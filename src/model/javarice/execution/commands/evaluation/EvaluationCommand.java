package model.javarice.execution.commands.evaluation;

import java.math.BigDecimal;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
import model.javarice.builder.ParserHandler;
import model.javarice.execution.commands.ICommand;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.searching.VariableSearcher;
import model.javarice.semantics.symboltable.SymbolTableManager;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.utils.Expression;
import model.javarice.semantics.utils.RecognizedKeywords;

public class EvaluationCommand implements ICommand, ParseTreeListener {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	private ExpressionContext parentExpressionContext;
	private String modifiedExpression;
	private BigDecimal resultValue;
	
	public EvaluationCommand(ExpressionContext expressionContext) {
		this.parentExpressionContext = expressionContext;
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		
		if(ctx instanceof ExpressionContext) {
			ExpressionContext expressionContext = (ExpressionContext) ctx;
			
			if(EvaluationCommand.isFunctionCall(expressionContext)) {
				this.evaluateFunctionCall(expressionContext);
			} else if(EvaluationCommand.isVariableOrConstant(expressionContext)) {
				this.evaluateVariable(expressionContext);
			}
		}
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute() {
		
		this.modifiedExpression = this.parentExpressionContext.getText();
		
		// catch rules if the value has direct boolean flags
		if(this.modifiedExpression.contains(RecognizedKeywords.BOOLEAN_TRUE)) {
			this.resultValue = new BigDecimal(1);
		} else if(this.modifiedExpression.contains(RecognizedKeywords.BOOLEAN_FALSE)) {
			this.resultValue = new BigDecimal(0);
		} else {
			ParseTreeWalker treeWalker = new ParseTreeWalker();
			treeWalker.walk(this, this.parentExpressionContext);
			
			Expression evalExpression = new Expression(this.modifiedExpression);
			this.resultValue = evalExpression.eval();
		}
		
	}
	
	public static boolean isFunctionCall(ExpressionContext expressionContext) {
		return expressionContext.arguments() != null;
	}
	
	public static boolean isVariableOrConstant(ExpressionContext expressionContext) {
		return expressionContext.primary() != null && expressionContext.primary().Identifier() != null;
	}
	
	private void evaluateFunctionCall(ExpressionContext expressionContext) {
		String functionName = expressionContext.expression(0).Identifier().getText();
		
		ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
				ParserHandler.getInstance().getCurrentClassName());
		
		JavaRiceFunction javaRiceFunction = classScope.searchFunction(functionName);
		
		if(expressionContext.arguments().expressionList() != null) {
			List<ExpressionContext> expressionContextList = 
					expressionContext.arguments().expressionList().expression();
			
			for(int i = 0; i < expressionContextList.size(); i ++) {
				ExpressionContext paramExprCtx = expressionContextList.get(i);
				
				EvaluationCommand evalCommand = new EvaluationCommand(paramExprCtx);
				evalCommand.execute();
				
				javaRiceFunction.mapParameterByValueAt(evalCommand.getResult().toEngineeringString(), i);
			}
			
		}
		
		javaRiceFunction.execute();
		Console.log(LogType.DEBUG, TAG + "Before modified expression function call: " + this.modifiedExpression);
		this.modifiedExpression = this.modifiedExpression.replace(expressionContext.getText(), 
				javaRiceFunction.getReturnValue().getValue().toString());
		Console.log(LogType.DEBUG, TAG + "After modified expression function call: " + this.modifiedExpression);
		
	}
	
	private void evaluateVariable(ExpressionContext expressionContext) {
		JavaRiceValue javaRiceValue = VariableSearcher.searchVariable(expressionContext.getText());
		
		this.modifiedExpression = this.modifiedExpression.replaceFirst(expressionContext.getText(), 
				javaRiceValue.getValue().toString());
	}
	
	/*
	 * Returns the result
	 */
	public BigDecimal getResult() {
		return this.resultValue;
	}

}
