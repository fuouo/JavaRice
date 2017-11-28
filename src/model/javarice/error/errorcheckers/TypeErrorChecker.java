package model.javarice.error.errorcheckers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
import model.javarice.builder.BuildChecker;
import model.javarice.builder.ErrorRepository;
import model.javarice.builder.ParserHandler;
import model.javarice.execution.commands.evaluation.EvaluationCommand;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.LiteralContext;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceFunction.FunctionType;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.symboltable.SymbolTableManager;
import model.javarice.semantics.symboltable.scopes.ClassScope;

public class TypeErrorChecker implements IErrorChecker, ParseTreeListener {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	private JavaRiceValue javaRiceValue;
	private ExpressionContext expressionContext;
	private int lineNumber;
	
	public TypeErrorChecker(JavaRiceValue javaRiceValue, ExpressionContext expressionContext) {
		this.javaRiceValue = javaRiceValue;
		this.expressionContext = expressionContext;
		
		Token firstToken = expressionContext.getStart();
		this.lineNumber = firstToken.getLine();
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		if(ctx instanceof LiteralContext) {			
			if(this.javaRiceValue == null) {
				return;
			}
			
			LiteralContext literalContext = (LiteralContext) ctx;
			String expressionString = literalContext.getText();
			String additionalMessage = "";
			
			Console.log(LogType.DEBUG, TAG + "primitive type: " + this.javaRiceValue.getPrimitiveType());
			
			switch(this.javaRiceValue.getPrimitiveType()) {
			case ARRAY:
				break;
			case BOOLEAN:
				if(literalContext.BooleanLiteral() == null) {
					additionalMessage = "Expected boolean.";
				}
				break;
			case INT:
				if(literalContext.IntegerLiteral() == null) {
					additionalMessage = "Expected int.";
				}
				break;
			case FLOAT:
			case DOUBLE:
				if(literalContext.FloatingPointLiteral() == null) {
					additionalMessage = "Expected float or double.";
				}
				break;
			case STRING:
				if((expressionString.charAt(0) != '\"' 
					&& (expressionString.charAt(expressionString.length() - 1) != '\"')) ||
					literalContext.StringLiteral() == null) {
					additionalMessage = "Expected String.";
				}
				break;
			default:
				break;
			}
			
			if(additionalMessage != "") {
				BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH, additionalMessage, this.lineNumber);
			}
		}
		
		
		else if(ctx instanceof ExpressionContext) {
			
			if(this.javaRiceValue == null) {
				return;
			}
			
			ExpressionContext exprCtx = (ExpressionContext) ctx;
			if(EvaluationCommand.isFunctionCall(exprCtx)) {
				Console.log(LogType.DEBUG, TAG + "Function call detected! "
						+ exprCtx.getText());
				String s[] = exprCtx.getText().split("\\(");
				
				String functionName = s[0];
				
				ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
						ParserHandler.getInstance().getCurrentClassName());
				
				JavaRiceFunction javaRiceFunction = classScope.searchFunction(functionName);
				
				if(javaRiceFunction == null) {
					return;
				}
				
				String additionalMessage = "";
				
				Console.log(LogType.DEBUG, TAG + "primitive type = " + this.javaRiceValue.getPrimitiveType());
				Console.log(LogType.DEBUG, TAG + "return type = " + javaRiceFunction.getReturnType());
				
				// type check type of function
				switch(this.javaRiceValue.getPrimitiveType()) {
				case ARRAY:					
					break;
				case BOOLEAN:
					if(javaRiceFunction.getReturnType() != FunctionType.BOOLEAN_TYPE) {
						additionalMessage = "Expected boolean.";
					}
					break;
				case INT:
					if(javaRiceFunction.getReturnType() != FunctionType.INT_TYPE &&
							javaRiceFunction.getReturnType() != FunctionType.LONG_TYPE) {
						additionalMessage = "Expected int or long.";
					}
					break;
				case FLOAT:
				case DOUBLE:
					if(javaRiceFunction.getReturnType() != FunctionType.FLOAT_TYPE && 
							javaRiceFunction.getReturnType() != FunctionType.DOUBLE_TYPE) {
						additionalMessage = "Expected float or double.";
					}
					break;
				case STRING:
					if(javaRiceFunction.getReturnType() != FunctionType.STRING_TYPE) {
						additionalMessage = "Expected string.";
					}
					break;
				default:
					break;
				}
				
				if(additionalMessage != "") {
					BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH, additionalMessage, this.lineNumber);
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
	public void verify() {
		// TODO Auto-generated method stub
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, this.expressionContext);
	}
	
	public static boolean isNumeric(String string) {
		// match a number with optional '-' and decimal
		return string.matches("-?\\d+(\\.\\d+)?");
	}

}
