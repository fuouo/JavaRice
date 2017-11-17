package model.javarice.error.errorcheckers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.javarice.builder.BuildChecker;
import model.javarice.builder.ErrorRepository;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.LiteralContext;
import model.javarice.semantics.representations.JavaRiceValue;

public class TypeErrorChecker implements IErrorChecker, ParseTreeListener {
	
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
				BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH,  additionalMessage, this.lineNumber);
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
