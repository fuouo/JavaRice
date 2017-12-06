package model.javarice.execution.commands.controlled;

import java.util.ArrayList;
import java.util.List;

import controller.Console;
import controller.Console.LogType;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.ExecutionMonitor;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.simple.ReturnCommand;
import model.javarice.execution.commands.utils.ConditionEvaluator;
import model.javarice.generatedexp.JavaRiceParser.ParExpressionContext;
import model.javarice.semantics.mapping.IValueMapper;
import model.javarice.semantics.mapping.IdentifierMapper;
import model.javarice.semantics.utils.LocalVarTracker;

public class WhileCommand implements IControlledCommand {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	// the list of commands inside the WHILE statement
	protected List<ICommand> commandSequences; 
	
	protected ParExpressionContext conditionalExpr;
	protected String modifiedConditionExpr;
	
	protected boolean returned = false;
	
	private ArrayList<String> localVars = new ArrayList<>();
	
	public WhileCommand(ParExpressionContext conditionalExpr) {
		this.commandSequences = new ArrayList<ICommand>();
		this.conditionalExpr = conditionalExpr;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.identifyVariables();
		
		ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();
		
		try {
			//evaluate the given condition
			while(ConditionEvaluator.evaluateCondition(this.conditionalExpr)) {
				for(ICommand command : this.commandSequences) {
					executionMonitor.tryExecution();
					command.execute();
					
					LocalVarTracker.getInstance().popLocalVar(command);
					
					if(ExecutionManager.getInstance().getCurrCatchType() != null) {
						break;
					}
					
					if(ExecutionManager.getInstance().isAborted()) {
						break;
					}
					
					// don't execute succeeding commands if there's a return
					if(command instanceof ReturnCommand) {
						this.returned = true;
						break;
					} else if(command instanceof IfCommand) {
						if(((IfCommand) command).isReturned()) {
							((IfCommand) command).resetReturnFlag();
							this.returned = true;
							break;
						}
					} else if(command instanceof IControlledCommand) {
						if(((IControlledCommand) command).isReturned()) {
							((IControlledCommand) command).resetReturnFlag();
							this.returned = true;
							break;
						}
					} 
				}
				
				if(ExecutionManager.getInstance().getCurrCatchType() != null) {
					break;
				}
				
				if(ExecutionManager.getInstance().isAborted()) {
					break;
				}
				
				if(this.returned) {
					break;
				}
				
				this.identifyVariables(); //identify variables again to detect changes to such variables used.
			}
			
		} catch(InterruptedException e) {
			System.err.println("Monitor block interrupted! " + e.getMessage());
		}
	}

	@Override
	public ControlTypeEnum getControlType() {
		return ControlTypeEnum.WHILE_CONTROL;
	}

	@Override
	public void addCommand(ICommand command) {
		// add to console
		Console.log(LogType.DEBUG, TAG + "Added command to WHILE");
		this.commandSequences.add(command);
	}
	
	protected void identifyVariables() {
		IValueMapper identifierMapper = new IdentifierMapper(this.conditionalExpr.getText());
		identifierMapper.analyze(this.conditionalExpr);
		
		this.modifiedConditionExpr = identifierMapper.getModifiedExpression();
	}
	
	public int getCommandCount() {
		return this.commandSequences.size();
	}
	
	@Override
	public boolean isReturned() {
		return this.returned;
	}
	
	@Override
	public void resetReturnFlag() {
		this.returned = false;
	}
	
	public ArrayList<String> getLocalVars() {
		return localVars;
	}

}
