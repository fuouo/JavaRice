package model.javarice.execution.commands.controlled;

import controller.Console;
import controller.Console.LogType;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.ExecutionMonitor;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.simple.ReturnCommand;
import model.javarice.generatedexp.JavaRiceParser.ParExpressionContext;

public class DoWhileCommand extends WhileCommand {
	
	private boolean doIsReturned = false;

	public DoWhileCommand(ParExpressionContext conditionalExpr) {
		super(conditionalExpr);
	}
	
	@Override
	public void execute() {
		
		Console.log(LogType.DEBUG, "DoWhileCommand: executeFirstCommandSequence");
		
		this.executeFirstCommandSequence();
		
		if(!this.doIsReturned) {
			Console.log(LogType.DEBUG, "DoWhileCommand: will execute while loops");
			super.execute();
		}
	}
	
	/*
	 * Executes the first command sequence before actually executing the behavior for the while command
	 */
	private void executeFirstCommandSequence() {
		this.identifyVariables();
		
		ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();
		
		try {
			for(ICommand command : this.commandSequences) {
				executionMonitor.tryExecution();
				command.execute();
				
				// don't execute succeeding commands if there's a return
				if(command instanceof ReturnCommand) {
					this.doIsReturned = true;
					break;
				} else if(command instanceof IfCommand) {
					if(((IfCommand) command).isReturned()) {
						((IfCommand) command).resetReturnFlag();
						this.doIsReturned = true;
						break;
					}
				} else if(command instanceof IControlledCommand) {
					if(((IControlledCommand) command).isReturned()) {
						((IControlledCommand) command).resetReturnFlag();
						this.doIsReturned = true;
						break;
					}
				} 
				
				this.identifyVariables();
			}
			
		} catch(InterruptedException e) {
			System.err.println("Monitor block interrupted! " +e.getMessage());
		}
	}
	
	@Override
	public ControlTypeEnum getControlType() {
		return ControlTypeEnum.DO_WHILE_CONTROL;
	}
	
	@Override
	public boolean isReturned() {
		// TODO Auto-generated method stub
		return super.isReturned() || this.doIsReturned;
	}
	
	@Override
	public void resetReturnFlag() {
		// TODO Auto-generated method stub
		super.resetReturnFlag();
	}

}
