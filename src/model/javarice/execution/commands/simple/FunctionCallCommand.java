package model.javarice.execution.commands.simple;

import model.javarice.JavaRiceParser.ExpressionContext;
import model.javarice.execution.commands.ICommand;
import model.javarice.semantics.representations.JavaRiceFunction;

public class FunctionCallCommand implements ICommand {
	
	private JavaRiceFunction javaRiceFunction;
	private ExpressionContext expressionContext;
	private String functionName;
	
	public FunctionCallCommand(String functionName, ExpressionContext expressionContext) {
		this.functionName = functionName;
		this.expressionContext = expressionContext;
		
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	
	private void searchFunction() {
		
	}
	
}
