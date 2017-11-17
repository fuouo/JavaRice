package model.javarice.execution.commands.evaluation;

import org.antlr.v4.runtime.tree.ParseTreeWalker;

import model.javarice.error.errorcheckers.ConstChecker;
import model.javarice.error.errorcheckers.TypeErrorChecker;
import model.javarice.error.errorcheckers.UndeclaredChecker;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.ICommand;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.semantics.analyzers.FunctionCallVerifier;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.searching.VariableSearcher;

public class AssignmentCommand implements ICommand {
	
	private ExpressionContext leftHandExprCtx;
	private ExpressionContext rightHandExprCtx;

	public AssignmentCommand(ExpressionContext leftHandExprCtx, ExpressionContext rightHandExprCtx) {
		this.leftHandExprCtx = leftHandExprCtx;
		this.rightHandExprCtx = rightHandExprCtx;
		
		UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.leftHandExprCtx);
		undeclaredChecker.verify();
		
		ConstChecker constChecker = new ConstChecker(this.leftHandExprCtx);
		constChecker.verify();
		
		undeclaredChecker = new UndeclaredChecker(this.rightHandExprCtx);
		undeclaredChecker.verify();
		
		ParseTreeWalker functionWalker = new ParseTreeWalker();
		functionWalker.walk(new FunctionCallVerifier(), this.rightHandExprCtx);
		
		// type check the java rice value
		JavaRiceValue javaRiceValue;
		
		if(ExecutionManager.getInstance().isInFunctionExecution()) {
			javaRiceValue = VariableSearcher.searchVariableInFunction(
					ExecutionManager.getInstance().getCurrentFunction(), this.leftHandExprCtx.getText());
		}
		else {
			javaRiceValue = VariableSearcher.searchVariable(this.leftHandExprCtx.getText());
		}
		
		TypeErrorChecker typeChecker = new TypeErrorChecker(javaRiceValue, this.rightHandExprCtx);
		typeChecker.verify();
	}



	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

}
