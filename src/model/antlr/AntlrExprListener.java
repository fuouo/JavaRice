package model.antlr;

import mode.java.ExprBaseListener;
import mode.java.ExprParser;

public class AntlrExprListener extends ExprBaseListener{
	
	@Override
	public void enterExpr(ExprParser.ExprContext context){
		System.out.println(context.getText());
		
	}
	
}
