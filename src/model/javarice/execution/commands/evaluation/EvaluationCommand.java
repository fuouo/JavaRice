package model.javarice.execution.commands.evaluation;

import java.math.BigDecimal;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
import model.javarice.builder.ParserHandler;
import model.javarice.execution.commands.ICommand;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;
import model.javarice.semantics.searching.VariableSearcher;
import model.javarice.semantics.symboltable.SymbolTableManager;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.utils.Expression;
import model.javarice.semantics.utils.RecognizedKeywords;
import model.javarice.semantics.utils.StringUtils;

public class EvaluationCommand implements ICommand, ParseTreeListener {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	private ExpressionContext parentExpressionContext;
	private String modifiedExpression;
	private BigDecimal resultValue;

	private boolean isNumeric;
	private String strResult;
	
	public EvaluationCommand(ExpressionContext expressionContext) {
		this.parentExpressionContext = expressionContext;
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {

		System.out.println("EvaluationCommand: entering every rule");
		
		if(ctx instanceof ExpressionContext) {
			ExpressionContext expressionContext = (ExpressionContext) ctx;
			
			System.out.println("exprCtx.getText(): " + expressionContext.getText());
            System.out.println("exprCtx.Identifier(): " + expressionContext.Identifier());
            System.out.println("exprCtx.arguments(): " + expressionContext.arguments());
            System.out.println("exprCtx.arguments().expressionList(): " + 
            		expressionContext.arguments().expressionList());

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

		Console.log(LogType.DEBUG, TAG + "executing");
		
		this.modifiedExpression = this.parentExpressionContext.getText();
		
		this.isNumeric = !this.modifiedExpression.contains("\"");

		// catch rules if the value has direct boolean flags
		if(this.modifiedExpression.contains(RecognizedKeywords.BOOLEAN_TRUE)) {
			this.resultValue = new BigDecimal(1);
			this.strResult = this.resultValue.toEngineeringString();
		} 

		else if(this.modifiedExpression.contains(RecognizedKeywords.BOOLEAN_FALSE)) {
			this.resultValue = new BigDecimal(0);
			this.strResult = this.resultValue.toEngineeringString();
		} 

		else if(!this.isNumeric) {
			this.strResult = StringUtils.removeQuotes(this.modifiedExpression);
		}

		else {
			Expression evalExpression = new Expression(this.modifiedExpression);
			this.resultValue = evalExpression.eval();
			this.strResult = this.resultValue.toEngineeringString();
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
		

		if(javaRiceFunction == null) {
			return;
		}

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
		
		if(javaRiceValue == null) {
			return;
		}

		this.modifiedExpression = this.modifiedExpression.replaceFirst(expressionContext.getText(), 
				javaRiceValue.getValue().toString());

		if(javaRiceValue.getPrimitiveType() == PrimitiveType.STRING) {
			this.modifiedExpression = "\"" + modifiedExpression + "\"";
		}

		Console.log(LogType.DEBUG, TAG + "Evaluated: " + modifiedExpression);
	}
	
	/*
	 * Returns the result
	 */
	public BigDecimal getResult() {
		return this.resultValue;
	}

	public String getStringResult() {
		return this.strResult;
	}

	public boolean isNumericResult() {
		return this.isNumeric;
	}

}
