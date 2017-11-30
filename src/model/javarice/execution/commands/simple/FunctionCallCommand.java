package model.javarice.execution.commands.simple;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeWalker;

import model.javarice.builder.ParserHandler;
import model.javarice.error.errorcheckers.ConstChecker;
import model.javarice.error.errorcheckers.UndeclaredChecker;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.evaluation.EvaluationCommand;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.semantics.analyzers.FunctionCallVerifier;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;
import model.javarice.semantics.searching.VariableSearcher;
import model.javarice.semantics.symboltable.SymbolTableManager;
import model.javarice.semantics.symboltable.scopes.ClassScope;

public class FunctionCallCommand implements ICommand {

	private JavaRiceFunction javaRiceFunction;
	private ExpressionContext expressionContext;
	private String functionName;

	public FunctionCallCommand(String functionName, ExpressionContext expressionContext) {
		this.functionName = functionName;
		this.expressionContext = expressionContext;

		UndeclaredChecker undeclaredChecker;
		undeclaredChecker = new UndeclaredChecker(this.expressionContext);
		undeclaredChecker.verify();
		
		this.searchFunction();

		ParseTreeWalker functionWalker = new ParseTreeWalker();
		functionWalker.walk(new FunctionCallVerifier(), this.expressionContext);

		this.verifyParameters();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.mapParameters();
		this.javaRiceFunction.execute();
	}

	private void searchFunction() {
		ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
				ParserHandler.getInstance().getCurrentClassName());
		this.javaRiceFunction = classScope.searchFunction(this.functionName);
	}

	private void verifyParameters() {
		if(this.expressionContext.arguments() == null || this.expressionContext.arguments().expressionList() == null
				|| this.expressionContext.arguments().expressionList().expression() == null) {
			return;
		}

		List<ExpressionContext> expressionContextList = 
				this.expressionContext.arguments().expressionList().expression();

		// map values in parameters
		for(int i = 0; i < expressionContextList.size(); i ++) {
			ExpressionContext paramExprCtx = expressionContextList.get(i);
			this.javaRiceFunction.verifyParameterByValuesAt(paramExprCtx, i);
		}


	}

	private void mapParameters() {
		if(this.expressionContext.arguments() == null || this.expressionContext.arguments().expressionList() == null
				|| this.expressionContext.arguments().expressionList().expression() == null) {
			return;
		}

		List<ExpressionContext> expressionContextList = 
				this.expressionContext.arguments().expressionList().expression();

		// map values in parameters
		for(int i = 0; i < expressionContextList.size(); i ++) {
			ExpressionContext paramExprCtx = expressionContextList.get(i);
			
			if(this.javaRiceFunction.getParameterAt(i).getPrimitiveType() == PrimitiveType.ARRAY) {
				JavaRiceValue javaRiceValue = VariableSearcher.searchVariable(paramExprCtx.getText());
				this.javaRiceFunction.mapArrayAt(javaRiceValue, i, paramExprCtx.getText());
			} else {
				EvaluationCommand evalCommand = new EvaluationCommand(paramExprCtx);
				evalCommand.execute();
				
				this.javaRiceFunction.mapParameterByValueAt(evalCommand.getResult().toEngineeringString(), i);
			}
		}
	}

	public JavaRiceValue getReturnValue() {
		return this.javaRiceFunction.getReturnValue();
	}

}
