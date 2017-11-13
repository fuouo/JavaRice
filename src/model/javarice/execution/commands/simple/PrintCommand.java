package model.javarice.execution.commands.simple;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.javarice.JavaRiceParser.ExpressionContext;
import model.javarice.JavaRiceParser.LiteralContext;
import model.javarice.JavaRiceParser.PrimaryContext;
import model.javarice.execution.commands.ICommand;
import model.javarice.semantics.utils.StringUtils;

public class PrintCommand implements ICommand, ParseTreeListener{
	
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
				ExpressionContext exprCtx = primaryContext.expression();
				this.complexExpr = true;
				
				// evaluation command here
				
				
				//shit hirap wtf
			}
			
			else if(primaryContext.expression() != null && this.complexExpr == false) {
				String identifier = primaryContext.getText();
				
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
	

}
