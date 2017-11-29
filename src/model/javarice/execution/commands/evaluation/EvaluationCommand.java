package model.javarice.execution.commands.evaluation;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Pattern;

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
import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;
import model.javarice.semantics.searching.VariableSearcher;
import model.javarice.semantics.symboltable.SymbolTableManager;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.utils.Expression;
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
		
		if(ctx instanceof ExpressionContext) {
			ExpressionContext expressionContext = (ExpressionContext) ctx;
			
			Console.log(LogType.DEBUG, TAG + "EXPRESSION MOTHER FUCKER " + expressionContext.getText());

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
		
		this.isNumeric = !this.modifiedExpression.contains("\"");
		
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, this.parentExpressionContext);

		if(!this.isNumeric) {
			this.strResult = StringUtils.removeQuotes(this.modifiedExpression);
		}

		else {
						
			if(this.modifiedExpression.contains("!")) {
				this.modifiedExpression = this.modifiedExpression.replaceAll("!", "not");
				this.modifiedExpression = this.modifiedExpression.replaceAll("not=", "!=");
				
			}

			if(this.modifiedExpression.contains("and")) {
				this.modifiedExpression = this.modifiedExpression.replaceAll("and", "&&");

			}

			if(this.modifiedExpression.contains("or")) {
				this.modifiedExpression = this.modifiedExpression.replaceAll("or", "||");
			}
			
			Expression evalExpression = new Expression(this.modifiedExpression);
			this.resultValue = evalExpression.eval();
			this.strResult = this.resultValue.toEngineeringString();
		}
		
	}
	
	public static boolean isFunctionCall(ExpressionContext expressionContext) {
		Pattern functionPattern = Pattern.compile("([a-zA-Z0-9]+)\\(([ ,.a-zA-Z0-9]*)\\)");
		
		if(expressionContext.arguments() != null || 
				functionPattern.matcher(expressionContext.getText()).matches()) {
			return true;
		}
		
		return false;
//		return expressionContext.arguments() != null;
	}
	
	public static boolean isVariableOrConstant(ExpressionContext expressionContext) {
		return expressionContext.primary() != null && expressionContext.primary().Identifier() != null;
	}
	
	private void evaluateFunctionCall(ExpressionContext expressionContext) {
		
		Console.log(LogType.DEBUG, TAG + "EVALUATING FUNCTION CALL");
		
		String functionName = expressionContext.expression(0).primary().getText();
		
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
		Console.log(LogType.DEBUG, TAG + "evaluateVariable");
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