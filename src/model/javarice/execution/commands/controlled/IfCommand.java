package model.javarice.execution.commands.controlled;

import java.util.ArrayList;
import java.util.List;

import model.javarice.execution.ExecutionManager;
import model.javarice.execution.ExecutionMonitor;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.controlled.IControlledCommand.ControlTypeEnum;
import model.javarice.execution.commands.simple.ReturnCommand;
import model.javarice.execution.commands.utils.ConditionEvaluator;
import model.javarice.generatedexp.JavaRiceParser.ParExpressionContext;
import model.javarice.semantics.mapping.IValueMapper;
import model.javarice.semantics.mapping.IdentifierMapper;
import model.javarice.semantics.utils.LocalVarTracker;

public class IfCommand implements IConditionalCommand {
	
	private List<ICommand> positiveCommands; //list of commands to execute if the condition holds true
	private List<ICommand> negativeCommands; //list of commands to execute if the condition holds false
	
	private ParExpressionContext conditionalExpr;
	private String modifiedConditionExpr;
	
	private boolean returned = false;
	
	private ArrayList<String> localVars = new ArrayList<>();
	
	public IfCommand(ParExpressionContext conditionalExpr) {
		this.positiveCommands = new ArrayList<ICommand>();
		this.negativeCommands = new ArrayList<ICommand>();
		
		this.conditionalExpr = conditionalExpr;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.identifyVariables();
		
		ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();
		
		try {
			//execute the positive commands
			if(ConditionEvaluator.evaluateCondition(this.conditionalExpr)) {
				for(ICommand command : this.positiveCommands) {
					executionMonitor.tryExecution();
					command.execute();
					
					LocalVarTracker.getInstance().popLocalVar(command);
					
					// don't execute succeeding commands if there's a return
					if(command instanceof ReturnCommand) {
						returned = true;
						break;
					}
					
				}
			}
			//execute the negative commands
			else {
				for(ICommand command : this.negativeCommands) {
					executionMonitor.tryExecution();
					command.execute();
					
					LocalVarTracker.getInstance().popLocalVar(command);
					
					// don't execute succeeding commands if there's a return
					if(command instanceof ReturnCommand) {
						returned = true;
						break;
					}
				}
			}
		} catch(InterruptedException e) {
			System.err.println("Monitor block interrupted! " + e.getMessage());
		}
	}

	@Override
	public ControlTypeEnum getControlType() {
		return ControlTypeEnum.CONDITIONAL_IF;
	}

	@Override
	public void addPositiveCommand(ICommand command) {
		this.positiveCommands.add(command);

	}

	@Override
	public void addNegativeCommand(ICommand command) {
		this.negativeCommands.add(command);
	}
	
	private void identifyVariables() {
		IValueMapper identifierMapper = new IdentifierMapper(this.conditionalExpr.getText());
		identifierMapper.analyze(this.conditionalExpr);
		
		this.modifiedConditionExpr = identifierMapper.getModifiedExpression();
	}
	
	public void clearAllCommands() {
		this.positiveCommands.clear();
		this.negativeCommands.clear();
	}
	
	public int getPositiveCommandsCount() {
		return this.positiveCommands.size();
	}
	
	public int getNegativeCommandsCount() {
		return this.negativeCommands.size();
	}
	
	public boolean isReturned() {
		return this.returned;
	}
	
	public void resetReturnFlag() {
		this.returned = false;
	}
	
	public ArrayList<String> getLocalVars() {
		return localVars;
	}
}
