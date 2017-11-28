package model.javarice.semantics.analyzers;

import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
import model.javarice.error.errorcheckers.ConstChecker;
import model.javarice.error.errorcheckers.UndeclaredChecker;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.controlled.DoWhileCommand;
import model.javarice.execution.commands.controlled.ForCommand;
import model.javarice.execution.commands.controlled.IConditionalCommand;
import model.javarice.execution.commands.controlled.IControlledCommand;
import model.javarice.execution.commands.controlled.IfCommand;
import model.javarice.execution.commands.controlled.WhileCommand;
import model.javarice.execution.commands.simple.PrintCommand;
import model.javarice.execution.commands.simple.ReturnCommand;
import model.javarice.execution.commands.simple.ScanCommand;
import model.javarice.generatedexp.JavaRiceLexer;
import model.javarice.generatedexp.JavaRiceParser.BlockContext;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.ScanContext;
import model.javarice.generatedexp.JavaRiceParser.StatementContext;
import model.javarice.semantics.statements.StatementControlOverseer;
import model.javarice.semantics.symboltable.scopes.LocalScopeCreator;

public class StatementAnalyzer {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";

	public StatementAnalyzer() {

	}

	public void analyze(StatementContext ctx) {
		// print statement
		if(ctx.WRITE() != null || ctx.WRITELN() != null) {
			this.handlePrintStatement(ctx);
		}

		// scan statement
		else if(ctx.scan() != null) {
			this.handleScanStatement(ctx);
		}

		// an expression
		else if(ctx.statementExpression() != null) {
			StatementExpressionAnalyzer expressionAnalyzer = new StatementExpressionAnalyzer();
			expressionAnalyzer.analyze(ctx.statementExpression());
		}

		//a block statement
		else if(ctx.block() != null) {
			BlockContext blockCtx = ctx.block();
			
			BlockAnalyzer blockAnalyzer = new BlockAnalyzer();
			blockAnalyzer.analyze(blockCtx);
		}

		// an IF statement
		else if(isIFStatement(ctx)) {
			
			StatementContext statementCtx = ctx.statement(0);
			
			Console.log(LogType.DEBUG, TAG + "IF statement detected! " + ctx.parExpression().getText());
			
			IfCommand ifCommand = new IfCommand(ctx.parExpression());
			StatementControlOverseer.getInstance().openConditionalCommand(ifCommand);
			
			StatementAnalyzer statementAnalyzer = new StatementAnalyzer();
			statementAnalyzer.analyze(statementCtx);
			
			StatementControlOverseer.getInstance().reportExitPositiveRule();
			
			// check if there is an ELSE statement
			if(isELSEStatement(ctx)) {
				statementCtx = ctx.statement(1);
				statementAnalyzer.analyze(statementCtx);
			}
			
			StatementControlOverseer.getInstance().compileControlledCommand();
		}

		// an WHILE statement
		else if(isWHILEStatement(ctx)) {
			Console.log(LogType.DEBUG, TAG + "While par expression: " +ctx.parExpression().getText());
			
			StatementContext statementCtx = ctx.statement(0);
			
			WhileCommand whileCommand = new WhileCommand(ctx.parExpression());
			StatementControlOverseer.getInstance().openControlledCommand(whileCommand);
			
			StatementAnalyzer statementAnalyzer = new StatementAnalyzer();
			statementAnalyzer.analyze(statementCtx);
			
			StatementControlOverseer.getInstance().compileControlledCommand();
			
			Console.log(LogType.DEBUG, TAG + "End of WHILE expression: " +ctx.parExpression().getText());
		}

		// an DOWHILE statement
		else if(isDOWHILEStatement(ctx)) {
			Console.log(LogType.DEBUG, TAG + "Do While PAR expression: " +ctx.parExpression().getText());
			
			StatementContext statementCtx = ctx.statement(0);
			Console.log(LogType.DEBUG, TAG + ctx.statement(0).getText());
			
			DoWhileCommand doWhileCommand = new DoWhileCommand(ctx.parExpression());
			StatementControlOverseer.getInstance().openControlledCommand(doWhileCommand);
			
			StatementAnalyzer statementAnalyzer = new StatementAnalyzer();
			statementAnalyzer.analyze(statementCtx);
			
			StatementControlOverseer.getInstance().compileControlledCommand();
			
			Console.log(LogType.DEBUG, TAG + "End of DO-WHILE expression: " +ctx.parExpression().getText());
		}

		// an FOR statement
		else if(isFORStatement(ctx)) {
//			Console.log(LogType.DEBUG, TAG + "FOR expression: " +ctx.parExpression().getText());
			Console.log(LogType.DEBUG, TAG + "FOR expression: " +ctx.forControl().getText());
			
			LocalScopeCreator.getInstance().openLocalScope();
			
			ForControlAnalyzer forControlAnalyzer = new ForControlAnalyzer();
			forControlAnalyzer.analyze(ctx.forControl());
			
			ForCommand forCommand = new ForCommand(forControlAnalyzer.getLocalVarDecContext(), 
					forControlAnalyzer.getExprContext(), forControlAnalyzer.getUpdateCommand());
			StatementControlOverseer.getInstance().openControlledCommand(forCommand);
			
			StatementContext statementCtx = ctx.statement(0);
			StatementAnalyzer statementAnalyzer = new StatementAnalyzer();
			statementAnalyzer.analyze(statementCtx);
			
			StatementControlOverseer.getInstance().compileControlledCommand();
			
			LocalScopeCreator.getInstance().closeLocalScope();
			
			Console.log(LogType.DEBUG, TAG + "End of FOR loop");
		}

		// an RETURN statement
		else if(isRETURNStatement(ctx) && ExecutionManager.getInstance().isInFunctionExecution()) {
			Console.log(LogType.DEBUG, TAG + "Detected return expression: " +ctx.expression(0).getText());
			this.handleReturnStatement(ctx.expression(0));
		}
	}
	
	private void handlePrintStatement(StatementContext ctx) {
		
		Console.log(LogType.DEBUG, TAG + "Print detected!");
		
		PrintCommand printCommand = new PrintCommand(ctx);
		
		StatementControlOverseer statementControl = StatementControlOverseer.getInstance();
		//add to conditional controlled command
		if(statementControl.isInConditionalCommand()) {
			IConditionalCommand conditionalCommand = 
					(IConditionalCommand) statementControl.getActiveControlledCommand();
			
			if(statementControl.isInPositiveRule()) {
				conditionalCommand.addPositiveCommand(printCommand);
			}
			else {
				conditionalCommand.addNegativeCommand(printCommand);
			}
		}
		
		else if(statementControl.isInControlledCommand()) {
			IControlledCommand controlledCommand = (IControlledCommand) statementControl.getActiveControlledCommand();
			controlledCommand.addCommand(printCommand);
		}
		else {
			ExecutionManager.getInstance().addCommand(printCommand);
		}
		
	}
	
	private void handleScanStatement(StatementContext ctx) {
		
		ScanContext scanCtx = ctx.scan();
		
		ScanCommand scanCommand = new ScanCommand(scanCtx);	
		
//		ScanCommand scanCommand = new ScanCommand(scanCtx.expression().getText());		
//		UndeclaredChecker.verifyVarOrConstForScan(scanCtx.expression().getText(), scanCtx);
//		ConstChecker.verifyConstForScan(scanCtx.expression().getText(), scanCtx);
		
		StatementControlOverseer statementControl = StatementControlOverseer.getInstance();
		//add to conditional controlled command
		if(statementControl.isInConditionalCommand()) {
			IConditionalCommand conditionalCommand = 
					(IConditionalCommand) statementControl.getActiveControlledCommand();
			
			if(statementControl.isInPositiveRule()) {
				conditionalCommand.addPositiveCommand(scanCommand);
			}
			else {
				conditionalCommand.addNegativeCommand(scanCommand);
			}
		}
		
		else if(statementControl.isInControlledCommand()) {
			IControlledCommand controlledCommand = (IControlledCommand) statementControl.getActiveControlledCommand();
			controlledCommand.addCommand(scanCommand);
		}
		else {
			ExecutionManager.getInstance().addCommand(scanCommand);
		}
		
	}
	
	private void handleReturnStatement(ExpressionContext exprCtx) {		
		ReturnCommand returnCommand = new ReturnCommand
				(exprCtx, ExecutionManager.getInstance().getCurrentFunction());
		/*
		 * TODO: Return commands supposedly stops a controlled or conditional command 
		 * and returns back the control to the caller.
		 * Find a way to halt such commands if they are inside a controlled command.
		 */
		StatementControlOverseer statementControl = StatementControlOverseer.getInstance();
		
		if(statementControl.isInConditionalCommand()) {
			IConditionalCommand conditionalCommand = 
					(IConditionalCommand) statementControl.getActiveControlledCommand();
			
			if(statementControl.isInPositiveRule()) {
				conditionalCommand.addPositiveCommand(returnCommand);
			}
			else {
				String functionName = ExecutionManager.getInstance().getCurrentFunction().getFunctionName();
				conditionalCommand.addNegativeCommand(returnCommand);
			}
		}
		
		else if(statementControl.isInControlledCommand()) {
			IControlledCommand controlledCommand = (IControlledCommand) statementControl.getActiveControlledCommand();
			controlledCommand.addCommand(returnCommand);
		}
		else {
			ExecutionManager.getInstance().getCurrentFunction().setValidReturn(true);
			ExecutionManager.getInstance().addCommand(returnCommand);
		}
		
	}

	public static boolean isIFStatement(StatementContext ctx) {
		List<TerminalNode> tokenList = ctx.getTokens(JavaRiceLexer.IF);

		return (tokenList.size() != 0);
	}

	public static boolean isELSEStatement(StatementContext ctx) {
		List<TerminalNode> tokenList = ctx.getTokens(JavaRiceLexer.ELSE);

		return (tokenList.size() != 0);
	}

	public static boolean isWHILEStatement(StatementContext ctx) {
		List<TerminalNode> whileTokenList = ctx.getTokens(JavaRiceLexer.WHILE);
		List<TerminalNode> doTokenList = ctx.getTokens(JavaRiceLexer.DO);

		return (whileTokenList.size() != 0 && doTokenList.size() == 0);
	}

	public static boolean isDOWHILEStatement(StatementContext ctx) {
		List<TerminalNode> whileTokenList = ctx.getTokens(JavaRiceLexer.WHILE);
		List<TerminalNode> doTokenList = ctx.getTokens(JavaRiceLexer.DO);

		return (whileTokenList.size() != 0 && doTokenList.size() != 0);
	}

	public static boolean isFORStatement(StatementContext ctx) {
		List<TerminalNode> forTokenList = ctx.getTokens(JavaRiceLexer.FOR);

		return (forTokenList.size() != 0);
	}

	public static boolean isRETURNStatement(StatementContext ctx) {
		List<TerminalNode> returnTokenList = ctx.getTokens(JavaRiceLexer.RETURN);

		return (returnTokenList.size() != 0);
	}

}
