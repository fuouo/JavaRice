package model.javarice.execution.commands.controlled;

import controller.Console;
import controller.Console.LogType;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.ExecutionMonitor;
import model.javarice.execution.commands.ICommand;
import model.javarice.generatedexp.JavaRiceParser.ParExpressionContext;

public class DoWhileCommand extends WhileCommand {

	public DoWhileCommand(ParExpressionContext conditionalExpr) {
		super(conditionalExpr);
	}
	
	@Override
	public void execute() {
		this.executeFirstCommandSequence();
		super.execute();
	}
	
	/*
	 * Executes the first command sequence before actually executing the behavior for the while command
	 */
	private void executeFirstCommandSequence() {
		this.identifyVariables();
		
		ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();
		
		try {
			for(ICommand command : this.commandSequences) {
				Console.log(LogType.DEBUG, "DOWHILE " + "for");
				executionMonitor.tryExecution();
				command.execute();
			}
			
		} catch(InterruptedException e) {
			System.err.println("Monitor block interrupted! " +e.getMessage());
		}
	}
	
	@Override
	public ControlTypeEnum getControlType() {
		return ControlTypeEnum.DO_WHILE_CONTROL;
	}

}
