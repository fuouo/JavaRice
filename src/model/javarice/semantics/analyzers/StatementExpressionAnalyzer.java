package model.javarice.semantics.analyzers;

import java.util.List;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
import model.javarice.builder.BuildChecker;
import model.javarice.builder.ErrorRepository;
import model.javarice.error.errorcheckers.ConstChecker;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.controlled.IConditionalCommand;
import model.javarice.execution.commands.controlled.IControlledCommand;
import model.javarice.execution.commands.evaluation.AssignmentCommand;
import model.javarice.execution.commands.evaluation.EvaluationCommand;
import model.javarice.execution.commands.simple.FunctionCallCommand;
import model.javarice.execution.commands.simple.IncDecCommand;
import model.javarice.generatedexp.JavaRiceLexer;
import model.javarice.generatedexp.JavaRiceParser.ArgumentsContext;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.StatementContext;
import model.javarice.generatedexp.JavaRiceParser.StatementExpressionContext;
import model.javarice.semantics.statements.StatementControlOverseer;

public class StatementExpressionAnalyzer implements ParseTreeListener {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";

	// used to avoid mistakenly reading right hand expressions as direct function calls as well.
	private ExpressionContext readRightHandExprCtx;

	//TODO: find a way to not rely on tree depth for function calls.
	public final static int FUNCTION_CALL_NO_PARAMS_DEPTH = 13;
	public final static int FUNCTION_CALL_WITH_PARAMS_DEPTH = 14;

	public StatementExpressionAnalyzer() {

	}

	public void analyze(StatementExpressionContext statementExprCtx) {
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, statementExprCtx);
	}

	public void analyze(ExpressionContext exprCtx) {
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, exprCtx);
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
		if(ctx instanceof ExpressionContext && 
				ctx.getParent() instanceof ExpressionContext && 
				ctx.getParent().getChild(1) instanceof ArgumentsContext && 
				ctx.getParent().getParent() instanceof ExpressionContext && 
				ctx.getParent().getParent().getChild(1) instanceof ArgumentsContext){
			
			BuildChecker.reportCustomError(ErrorRepository.MISMATCHED_INPUT, "", ctx.getStart().getLine(), "(", ";");
		}
		
		
		if(ctx instanceof ExpressionContext) {
			ExpressionContext exprCtx = (ExpressionContext) ctx;
			
			if(isAssignmentExpression(exprCtx)) {
				Console.log(LogType.DEBUG, TAG + "Assignment expr detected: " +exprCtx.getText());
				
				List<ExpressionContext> exprListCtx = exprCtx.expression();				
				AssignmentCommand assignmentCommand = new AssignmentCommand(exprListCtx.get(0), exprListCtx.get(1));
				
				this.readRightHandExprCtx = exprListCtx.get(1);
				this.handleStatementExecution(assignmentCommand);
			} 
			
			else if(isIncrementExpression(exprCtx)) {
				Console.log(LogType.DEBUG, TAG + "Increment expr detected: " +exprCtx.getText());
				
				List<ExpressionContext> exprListCtx = exprCtx.expression();
				
				ConstChecker constChecker = new ConstChecker(exprListCtx.get(0));
				constChecker.verify();
				
				IncDecCommand incDecCommand = new IncDecCommand(exprListCtx.get(0), JavaRiceLexer.INC);
				this.handleStatementExecution(incDecCommand);
			}
			
			else if(isDecrementExpression(exprCtx)) {
				Console.log(LogType.DEBUG, TAG + "Decrement expr detected: " +exprCtx.getText());
				
				List<ExpressionContext> exprListCtx = exprCtx.expression();
				
				ConstChecker constChecker = new ConstChecker(exprListCtx.get(0));
				constChecker.verify();
				
				IncDecCommand incDecCommand = new IncDecCommand(exprListCtx.get(0),JavaRiceLexer.DEC);
				this.handleStatementExecution(incDecCommand);
				
			}
			
			else if(this.isFunctionCallWithParams(exprCtx)) {
				this.handleFunctionCallWithParams(exprCtx);
			}
			
			else if(this.isFunctionCallWithNoParams(exprCtx)) {
				this.handleFunctionCallWithNoParams(exprCtx);
			}
			
			else {
				
				
				/* This is for the non-assignment stamenets like z * 20, z * 20 + 30 / 12, etc */
				if(	ctx.getParent() instanceof StatementExpressionContext &&
					!(ctx.getParent().getChild(1) instanceof ExpressionContext) &&
					ctx.getParent().getParent() instanceof StatementContext && 
					((ExpressionContext) ctx).arguments() == null &&
					!(ctx.getText().contains("=") || 
					 ctx.getText().contains("-=") ||
					 ctx.getText().contains("*=") ||
					 ctx.getText().contains("/=") ||
					 ctx.getText().contains("&=") ||
					 ctx.getText().contains("|=") ||
					 ctx.getText().contains("^=") ||
					 ctx.getText().contains("%=") ||
					 ctx.getText().contains("<<=") ||
					 ctx.getText().contains(">>=") ||
					 ctx.getText().contains(">>>=") || 
					 ctx.getText().contains("++") || 
					 ctx.getText().contains("--")/* end of assignment operator condition */) ){
					
					String var = ((ExpressionContext)ctx).expression(0).getText(); //not working
					var = var.split("[^\\w']+")[0];
					String op = ((StatementExpressionContext)ctx.getParent()).expression().getText().split(var)[1].substring(0, 1); // not working
					op = "=";
				
					BuildChecker.reportCustomError(ErrorRepository.MISSING_TOKEN, "", ctx.getStart().getLine(), op , var);
						
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
	
	private void handleFunctionCallWithParams(ExpressionContext funcExprCtx) {
		if(funcExprCtx.primary() == null){
			if(!EvaluationCommand.isFunctionCall(funcExprCtx))
				BuildChecker.reportCustomError(ErrorRepository.MISMATCHED_INPUT, "With Params", funcExprCtx.getStart().getLine(), "(", ";");
			return;
		}
		
		ExpressionContext functionExprCtx = funcExprCtx.expression(0);
		String functionName = functionExprCtx.primary().getText();
		
		FunctionCallCommand functionCallCommand = new FunctionCallCommand(functionName, funcExprCtx);
		this.handleStatementExecution(functionCallCommand);
		
		Console.log(LogType.DEBUG, TAG + "Function call with params detected: " +funcExprCtx.getText());
	}

	private void handleFunctionCallWithNoParams(ExpressionContext funcExprCtx) {
		if(funcExprCtx.primary() == null){
			if(!EvaluationCommand.isFunctionCall(funcExprCtx))
				BuildChecker.reportCustomError(ErrorRepository.MISMATCHED_INPUT, "Without Params", funcExprCtx.getStart().getLine(), "(", ";");
			//return;
		}
		String functionName = funcExprCtx.expression(0).getText();
		
		FunctionCallCommand functionCallCommand = new FunctionCallCommand(functionName, funcExprCtx);
		this.handleStatementExecution(functionCallCommand);

		Console.log(LogType.DEBUG, TAG + "Function call with no params detected: " +functionName);
	}

	private void handleStatementExecution(ICommand command) {
		StatementControlOverseer statementControl = StatementControlOverseer.getInstance();

		//add to conditional controlled command
		if(statementControl.isInConditionalCommand()) {
			IConditionalCommand conditionalCommand = 
					(IConditionalCommand) statementControl.getActiveControlledCommand();

			if(statementControl.isInPositiveRule()) {
				conditionalCommand.addPositiveCommand(command);
			}
			else {
				conditionalCommand.addNegativeCommand(command);
			} 
		} else if(statementControl.isInControlledCommand()) {
			IControlledCommand controlledCommand = 
					(IControlledCommand) statementControl.getActiveControlledCommand();
			controlledCommand.addCommand(command);
		}
		else {
			ExecutionManager.getInstance().addCommand(command);
		}
	}

	public static boolean isAssignmentExpression(ExpressionContext exprCtx) {
		List<TerminalNode> tokenList = exprCtx.getTokens(JavaRiceLexer.ASSIGN);
		return (tokenList.size() > 0);
	}

	public static boolean isIncrementExpression(ExpressionContext exprCtx) {
		List<TerminalNode> incrementList = exprCtx.getTokens(JavaRiceLexer.INC);

		return (incrementList.size() > 0);
	}

	public static boolean isDecrementExpression(ExpressionContext exprCtx) {
		List<TerminalNode> decrementList = exprCtx.getTokens(JavaRiceLexer.DEC);

		return (decrementList.size() > 0);
	}

	private boolean isFunctionCallWithParams(ExpressionContext exprCtx) {
		
		Pattern functionPattern = Pattern.compile("([a-zA-Z0-9]+)\\(([ ,.a-zA-Z0-9]*)\\)");
		
		if(exprCtx.arguments() != null || 
				functionPattern.matcher(exprCtx.getText()).matches()) {
			
			if(exprCtx.arguments().expressionList() != null) {
				return true;
			}
			
		}
		
		return false;

	}

	private boolean isFunctionCallWithNoParams(ExpressionContext exprCtx) {
		Pattern functionPattern = Pattern.compile("([a-zA-Z0-9]+)\\(([ ,.a-zA-Z0-9]*)\\)");
		
		if(exprCtx.arguments() != null || 
				functionPattern.matcher(exprCtx.getText()).matches()) {
			
			if(exprCtx.arguments().expressionList() == null) {
				return true;
			}
			
		}
		
		return false;
	}

}