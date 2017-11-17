package model.javarice.execution.commands.simple;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.evaluation.EvaluationCommand;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.LiteralContext;
import model.javarice.generatedexp.JavaRiceParser.PrimaryContext;
import model.javarice.semantics.representations.JavaRiceArray;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;
import model.javarice.semantics.representations.JavaRiceValueSearcher;
import model.javarice.semantics.utils.StringUtils;

public class PrintCommand implements ICommand, ParseTreeListener{
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	private ExpressionContext expressionContext;
	
	private String strToPrint = "";
	private boolean complexExpr = false;
	private boolean arrayAccess = false;
	
	public PrintCommand(ExpressionContext expressionContext) {
		this.expressionContext = expressionContext;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, expressionContext);
		
		// log to console
		Console.log(LogType.DEBUG, this.strToPrint);
		
		// rest statement to print
		this.strToPrint = "";
	}

	@Override
	public void enterEveryRule(ParserRuleContext context) {
		// TODO Auto-generated method stub
		
		if(context instanceof LiteralContext) {
			LiteralContext literalContext = (LiteralContext) context;
			
			if(literalContext.StringLiteral() != null) {
				String quotedString = literalContext.StringLiteral().getText();
				
				this.strToPrint += StringUtils.removeQuotes(quotedString);
			}
		}
		
		else if(context instanceof PrimaryContext) {
			PrimaryContext primaryContext = (PrimaryContext) context;
			
			if(primaryContext.expression() != null) {
				ExpressionContext expressionContext = primaryContext.expression();
				this.complexExpr = true;
				
				// add to console
				Console.log(LogType.DEBUG, TAG + "Complex expression detected: " + expressionContext.getText());
				
				EvaluationCommand evaluationCommand = new EvaluationCommand(expressionContext);
				evaluationCommand.execute();
				
				this.strToPrint += evaluationCommand.getResult().toEngineeringString();
				
			}
			
			else if(primaryContext.expression() != null && this.complexExpr == false) {
				String identifier = primaryContext.getText();
				
				JavaRiceValue value = JavaRiceValueSearcher.searchJavaRiceValue(identifier);
				
				if(value.getPrimitiveType() == PrimitiveType.ARRAY) {
					this.arrayAccess = true;
					this.evaluateArrayPrint(value, primaryContext);
				} else if(this.arrayAccess == false) {
					this.strToPrint += value.getValue();
				}
				
			}
			
		}
	}

	@Override
	public void exitEveryRule(ParserRuleContext context) {
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
	
	public void evaluateArrayPrint(JavaRiceValue javaRiceValue, PrimaryContext primaryContext) {
		
		// move up and determine expression contexts
		ExpressionContext parentExpressionContext = (ExpressionContext) primaryContext.getParent().getParent();
		ExpressionContext arrayIndexExpressionContext = parentExpressionContext.expression(1);
		
		EvaluationCommand evaluationCommand = new EvaluationCommand(arrayIndexExpressionContext);
		evaluationCommand.execute();
		
		JavaRiceArray javaRiceArray = (JavaRiceArray) javaRiceValue.getValue();
		JavaRiceValue arrayJavaRiceValue = javaRiceArray.getValueAt(evaluationCommand.getResult().intValue());
		
		this.strToPrint += arrayJavaRiceValue.getValue().toString();
	}
	
	public String getStatementToPrint() {
		return this.strToPrint;
	}

}
