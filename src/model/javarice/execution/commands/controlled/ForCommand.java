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
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.LocalVariableDeclarationContext;
import model.javarice.semantics.analyzers.LocalVariableAnalyzer;
import model.javarice.semantics.mapping.IValueMapper;
import model.javarice.semantics.mapping.IdentifierMapper;

public class ForCommand implements IControlledCommand {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	private List<ICommand> commandSequences;
	
	//a local variable ctx that is evaluated at the start of the for loop
	private LocalVariableDeclarationContext localVarDecCtx; 
	
	//the condition to satisfy
	private ExpressionContext conditionalExpr; 
	
	//the update command after every iteration
	private ICommand updateCommand; 
	
	private String modifiedConditionExpr;
	
	private boolean returned = false;
	
	public ForCommand(LocalVariableDeclarationContext localVarDecCtx, 
			ExpressionContext conditionalExpr, ICommand updateCommand) {
		this.localVarDecCtx = localVarDecCtx;
		this.conditionalExpr = conditionalExpr;
		this.updateCommand = updateCommand;
		
		this.commandSequences = new ArrayList<ICommand>();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.evaluateLocalVariable();
		this.identifyVariables();
		
		ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();
		
		try {
			//evaluate the given condition
			while(ConditionEvaluator.evaluateCondition(this.conditionalExpr)) {
				for(ICommand command : this.commandSequences) {
					executionMonitor.tryExecution();
					command.execute();
					
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
				
				if(this.returned) {
					break;
				}
				
				//execute the update command
				this.updateCommand.execute(); 
				
				//identify variables again to detect changes to such variables used.
				this.identifyVariables(); 
			}
			
		} catch(InterruptedException e) {
			System.err.println("Monitor block interrupted! " +e.getMessage());
		}
	}

	@Override
	public ControlTypeEnum getControlType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCommand(ICommand command) {
		// TODO Auto-generated method stub
		Console.log(LogType.DEBUG, TAG + "Added command to FOR");
		this.commandSequences.add(command);
	}
	
	private void evaluateLocalVariable() {
		if(this.localVarDecCtx != null) {
			LocalVariableAnalyzer localVarAnalyzer = new LocalVariableAnalyzer();
			localVarAnalyzer.markImmediateExecution();
			localVarAnalyzer.analyze(this.localVarDecCtx);
		}
	}
	
	private void identifyVariables() {
		IValueMapper identifierMapper = new IdentifierMapper(this.conditionalExpr.getText());
		identifierMapper.analyze(this.conditionalExpr);
		
		this.modifiedConditionExpr = identifierMapper.getModifiedExpression();
	}
	
	@Override
	public boolean isReturned() {
		return this.returned;
	}
	
	@Override
	public void resetReturnFlag() {
		this.returned = false;
	}

}
