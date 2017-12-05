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
import model.javarice.generatedexp.JavaRiceLexer;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.semantics.representations.JavaRiceArray;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceFunction.FunctionType;
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
	private String strResult = "";
	private String prevArrName = "";
	
	public EvaluationCommand(ExpressionContext expressionContext) {
		this.parentExpressionContext = expressionContext;
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		
		if(ctx instanceof ExpressionContext) {
			ExpressionContext expressionContext = (ExpressionContext) ctx;
			
//			Console.log(LogType.DEBUG, TAG + "Expression is = " + expressionContext.getText());

//			if(EvaluationCommand.isFunctionCall(expressionContext)) {
//				this.evaluateFunctionCall(expressionContext);
//			} else if(EvaluationCommand.isVariableOrConstant(expressionContext)) {
//				this.evaluateVariable(expressionContext);
//			}
			
			if(EvaluationCommand.isFunctionCall(expressionContext)) {
				this.evaluateFunctionCall(expressionContext);
			} 
			
			else if(EvaluationCommand.isArray(expressionContext)) {
				String s[] = expressionContext.getText().split("\\[");
				this.prevArrName = s[0];
				// evaluate array
				this.evaluateArray(expressionContext);
			}
			
			else if(EvaluationCommand.isVariableOrConstant(expressionContext)) {
				if(!this.prevArrName.equals(expressionContext.getText())) {
					this.evaluateVariable(expressionContext);
				}
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
		
		// evaluate function calls first
		for(int i = 0; i < this.parentExpressionContext.expression().size(); i ++) {
			ExpressionContext exprCtx = (ExpressionContext) this.parentExpressionContext.expression(i);
			if(isFunctionCall(exprCtx)) {
				EvaluationCommand evalCommand = new EvaluationCommand(exprCtx);
				evalCommand.execute();
				
				this.modifiedExpression = this.modifiedExpression.replace(exprCtx.getText(), evalCommand.modifiedExpression);
			}
		}
		
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, this.parentExpressionContext);
		
		this.isNumeric = !this.modifiedExpression.contains("\"") && !this.modifiedExpression.contains("'");

		if(!this.isNumeric) {
			
			if(this.modifiedExpression.contains("==") || this.modifiedExpression.contains("!=")) {
				String[] strings = {"", ""};
				
				if(this.modifiedExpression.contains("==")) {
					strings = this.modifiedExpression.split("==");
					
					if(strings[0].equals(strings[1]))
						this.resultValue = new BigDecimal(1);
					else 
						this.resultValue = new BigDecimal(0);
				}

				if(this.modifiedExpression.contains("!=")) {
					strings = this.modifiedExpression.split("!=");
					
					if(!(strings[0].equals(strings[1])))
						this.resultValue = new BigDecimal(1);
					else 
						this.resultValue = new BigDecimal(0);
				}
				
				this.isNumeric = true;
			} 
			
			else if(this.parentExpressionContext.expression().size() != 0 &&
					!isArray(this.parentExpressionContext) && !isFunctionCall(this.parentExpressionContext)) {
				for (ExpressionContext exprCtx : this.parentExpressionContext.expression()) {
					if(!isArrayVariable(exprCtx)) {
						EvaluationCommand evaluationCommand = new EvaluationCommand(exprCtx);
						evaluationCommand.execute();
						
						if(evaluationCommand.isNumericResult()) {
							if(evaluationCommand.getResult() != null)
								this.strResult += evaluationCommand.getResult().toEngineeringString();
						} else
							if(evaluationCommand.getStringResult() != null)
								this.strResult += evaluationCommand.getStringResult();
					}
				}
			}
			
			
			else{
				this.strResult = StringUtils.removeQuotes(this.modifiedExpression);
			}
		} 

		else {
						
			if(this.modifiedExpression.contains("!")) {
				this.modifiedExpression = this.modifiedExpression.replaceAll("!", "not");
				this.modifiedExpression = this.modifiedExpression.replaceAll("not=", "!=");
				
			}
			
//			Console.log(LogType.DEBUG, TAG + "Modified Expression is now = " + this.modifiedExpression);
			
			Expression evalExpression = new Expression(this.modifiedExpression);
			this.resultValue = evalExpression.eval();
			
			this.strResult = this.resultValue.toEngineeringString();
		}
		
	}
	
	public static boolean isFunctionCall(ExpressionContext expressionContext) {
		Pattern functionPattern = Pattern.compile("([a-zA-Z0-9]+)\\(([ ,.a-zA-Z0-9]*)\\)");
		
		if(expressionContext.arguments() != null || 
			functionPattern.matcher(expressionContext.getText()).matches()) {
			Pattern ptn = Pattern.compile("([a-zA-Z0-9]+)");
			if(ptn.matcher(expressionContext.getText().split("\\(")[0]).matches())
				return true;
			
		
		}
		
		return false;
//		return expressionContext.arguments() != null;
	}
	
	public static boolean isVariableOrConstant(ExpressionContext expressionContext) {
		return expressionContext.primary() != null && expressionContext.primary().Identifier() != null;
	}
	
	public static boolean isArrayVariable(ExpressionContext expressionContext) {
		JavaRiceValue value = VariableSearcher.searchVariable(expressionContext.getText());
		
		if(value != null) {
			return value.getPrimitiveType() == PrimitiveType.ARRAY && !isArray(expressionContext);
		}
		
		return false;
	}
	
	public static boolean isArray(ExpressionContext expressionContext) {
		List<TerminalNode> lBrackTokens = expressionContext.getTokens(JavaRiceLexer.LBRACK);
		List<TerminalNode> rBrackTokens = expressionContext.getTokens(JavaRiceLexer.RBRACK);

		return(lBrackTokens.size() > 0 && rBrackTokens.size() > 0);
	}
	
	private void evaluateFunctionCall(ExpressionContext expressionContext) {
		
		String functionName = expressionContext.expression(0).primary().getText();
		
		Console.log(LogType.DEBUG, TAG + "EVALUATING FUNCTION CALL " + functionName);
		
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
				
				if(evalCommand.isNumeric) {
					javaRiceFunction.mapParameterByValueAt(evalCommand.getResult().toEngineeringString(), i);
				} else {
					javaRiceFunction.mapParameterByValueAt(evalCommand.getStringResult(), i);
				}
				
			}
			
		}
		
		javaRiceFunction.execute();
		
		if(javaRiceFunction.getReturnType() == FunctionType.STRING_TYPE) {
			this.modifiedExpression = this.modifiedExpression.replace(expressionContext.getText(), 
					"\"" + javaRiceFunction.getReturnValue().getValue().toString() + "\"");
		} else {
			this.modifiedExpression = this.modifiedExpression.replace(expressionContext.getText(), 
					javaRiceFunction.getReturnValue().getValue().toString());
		}
		
	}
	
	private void evaluateVariable(ExpressionContext expressionContext) {
		JavaRiceValue javaRiceValue = VariableSearcher.searchVariable(expressionContext.getText());
		
		if(javaRiceValue == null || javaRiceValue.getPrimitiveType() == PrimitiveType.ARRAY) {
			return;
		}

		Console.log(LogType.DEBUG, TAG + "EVALUATING VARIABLE " + expressionContext.getText());

		if(javaRiceValue.getPrimitiveType() == PrimitiveType.STRING) {
			
			if(javaRiceValue.getValue() == null) {
				this.modifiedExpression = this.modifiedExpression.replaceFirst(expressionContext.getText(), 
						"\"null\"");
			} else {
				this.modifiedExpression = this.modifiedExpression.replaceFirst(expressionContext.getText(), 
						"\"" + javaRiceValue.getValue().toString() + "\"");
			}
			
		} else if(javaRiceValue.getPrimitiveType() == PrimitiveType.CHAR) {
			this.modifiedExpression = this.modifiedExpression.replaceFirst(expressionContext.getText(), 
					"'" + javaRiceValue.getValue().toString() + "'");
		} else
			this.modifiedExpression = this.modifiedExpression.replaceFirst(expressionContext.getText(), 
					javaRiceValue.getValue().toString());

		Console.log(LogType.DEBUG, TAG + "Evaluated: " + modifiedExpression);
	}
	
	private void evaluateArray(ExpressionContext expressionContext) {
		JavaRiceValue javaRiceValue = VariableSearcher.searchVariable(
				expressionContext.expression(0).primary().getText());
		
		if(javaRiceValue == null) {
			return;
		}

		Console.log(LogType.DEBUG, TAG + "EVALUATING ARRAY " + expressionContext.expression(0).primary().getText());
		
		ExpressionContext arrayIndexExpressionContext = expressionContext.expression(1);
		
		EvaluationCommand evaluationCommand = new EvaluationCommand(arrayIndexExpressionContext);
		evaluationCommand.execute();
		
		JavaRiceArray javaRiceArray = (JavaRiceArray) javaRiceValue.getValue();
		JavaRiceValue arrayJavaRiceValue = javaRiceArray.getValueAt(evaluationCommand.getResult().intValue(), expressionContext);

		if(arrayJavaRiceValue.getPrimitiveType() == PrimitiveType.STRING) {
			this.modifiedExpression = this.modifiedExpression.replaceFirst(
					expressionContext.expression(0).primary().getText() + "\\[" 
							+ arrayIndexExpressionContext.getText() + "\\]", 
							"\"" + arrayJavaRiceValue.getValue().toString() + "\"");
		} else if(arrayJavaRiceValue.getPrimitiveType() == PrimitiveType.CHAR) {
			this.modifiedExpression = this.modifiedExpression.replaceFirst(
					expressionContext.expression(0).primary().getText() + "\\[" 
							+ arrayIndexExpressionContext.getText() + "\\]", 
							"'" + arrayJavaRiceValue.getValue().toString() + "'");
		} else {
			this.modifiedExpression = this.modifiedExpression.replaceFirst(
					expressionContext.expression(0).primary().getText() + "\\[" 
							+ arrayIndexExpressionContext.getText() + "\\]", 
							arrayJavaRiceValue.getValue().toString());
		}

		Console.log(LogType.DEBUG, TAG + "Evaluated: " + this.modifiedExpression);
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