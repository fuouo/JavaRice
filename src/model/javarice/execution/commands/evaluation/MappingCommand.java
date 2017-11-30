package model.javarice.execution.commands.evaluation;

import org.antlr.v4.runtime.tree.ParseTreeWalker;

import controller.Console;
import controller.Console.LogType;
import model.javarice.error.errorcheckers.UndeclaredChecker;
import model.javarice.execution.commands.ICommand;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.semantics.analyzers.FunctionCallVerifier;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.searching.VariableSearcher;
import model.javarice.semantics.utils.AssignmentUtils;

public class MappingCommand implements ICommand {
	
	private String identifierString;
	private ExpressionContext parentExprCtx;
	
	private String modifiedExp;
	
	public MappingCommand(String identifierString, ExpressionContext exprCtx) {
		this.identifierString = identifierString;
		this.parentExprCtx = exprCtx;
		
		UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.parentExprCtx);
		undeclaredChecker.verify();
		
		ParseTreeWalker functionWalker = new ParseTreeWalker();
		functionWalker.walk(new FunctionCallVerifier(), this.parentExprCtx);
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.modifiedExp = this.parentExprCtx.getText();
		
		Console.log(LogType.DEBUG, "Mapping Command: " + this.modifiedExp);
		
		EvaluationCommand evaluationCommand = new EvaluationCommand(this.parentExprCtx);
		evaluationCommand.execute();
		
		JavaRiceValue javaRiceValue = VariableSearcher.searchVariable(this.identifierString);
		
		if(evaluationCommand.isNumericResult()) {
			AssignmentUtils.assignAppropriateValue(javaRiceValue, evaluationCommand.getResult());
		} else {
			AssignmentUtils.assignAppropriateValue(javaRiceValue, evaluationCommand.getStringResult());
		}
	}
	
	/*
	 * Returns the modified exp, with mapped values.
	 */
	public String getModifiedExp() {
		return this.modifiedExp;
	}
	
	/*
	 * Returns the modified exp, with mapped values.
	 */
	public String getIdentifierString() {
		return this.identifierString;
	}

}
