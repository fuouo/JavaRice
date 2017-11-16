package model.javarice.execution.commands.controlled;

import java.util.ArrayList;
import java.util.List;

import model.javarice.JavaRiceParser.ParExpressionContext;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.ExecutionMonitor;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.utils.ConditionEvaluator;
import model.javarice.semantics.mapping.IValueMapper;
import model.javarice.semantics.mapping.IdentifierMapper;

public class WhileCommand implements IControlledCommand {
	
	// the list of commands inside the WHILE statement
	protected List<ICommand> commandSequences; 
	
	protected ParExpressionContext conditionalExpr;
	protected String modifiedConditionExpr;
	
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
		System.err.println("ADD TO CONSOLE: Added command to WHILE");
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

}
