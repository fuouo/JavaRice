

public class AntlrExprListener extends ExprBaseListener{
	
	@Override
	public void enterProg(ExprParser.ProgContext context){
		System.out.println("Entering Prog: " + context.expr().get(0).getText());
		
	}
	
	@Override
	public void exitProg(ExprParser.ProgContext context){
		System.out.println("Exiting Prog");
	}
	
}
