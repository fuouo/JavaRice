package model.javarice.error.errorcheckers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.javarice.JavaRiceParser.ExpressionContext;
import model.javarice.JavaRiceParser.StatementContext;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.evaluation.EvaluationCommand;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.searching.VariableSearcher;
import model.javarice.semantics.symboltable.scopes.ClassScope;

public class UndeclaredChecker implements IErrorChecker, ParseTreeListener {
	
	private ExpressionContext exprCtx;
	private int lineNumber;
	
	public UndeclaredChecker(ExpressionContext exprCtx) {
		this.exprCtx = exprCtx;
		
		Token firstToken = this.exprCtx.getStart();
		this.lineNumber = firstToken.getLine();
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		if(ctx instanceof ExpressionContext) {
			ExpressionContext exprCtx = (ExpressionContext) ctx;
			if(EvaluationCommand.isFunctionCall(exprCtx)) {
				this.verifyFunctionCall(exprCtx);
			}
			else if(EvaluationCommand.isVariableOrConstant(exprCtx)) {
				this.verifyVariableOrConst(exprCtx);
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
		treeWalker.walk(this, this.exprCtx);
	}

	private void verifyFunctionCall(ExpressionContext funcExprCtx) {
		if(funcExprCtx.expression(0).Identifier() == null)
			return;
	
		String functionName = funcExprCtx.expression(0).Identifier().getText();
		
		// parser handler shit here
		ClassScope classScope = null;
		JavaRiceFunction javaRiceFunction = classScope.searchFunction(functionName);
		
		if(javaRiceFunction == null) {
			// report error shit here
			// BuildChecker.reportCustomError(ErrorRepository.UNDECLARED_FUNCTION, "", functionName, this.lineNumber);
		} else {
			System.err.println("ADD TO CONSOLE: Function found " + functionName);
		}
	}
	
	private void verifyVariableOrConst(ExpressionContext varExprCtx) {
		JavaRiceValue javaRiceValue = null;
		
		if(ExecutionManager.getInstance().isInFunctionExecution()) {
			JavaRiceFunction javaRiceFunction = ExecutionManager.getInstance().getCurrentFunction();
			javaRiceValue = VariableSearcher.searchVariableInFunction(
					javaRiceFunction, varExprCtx.primary().Identifier().getText());
		}
		
		// if mobi value is still null, search class
		if(javaRiceValue == null) {
			// parser handler shit here
			ClassScope classScope = null;
			javaRiceValue = VariableSearcher.searchVariableInClass(classScope, 
					varExprCtx.primary().Identifier().getText());
		}
		
		// after second pass, we conclude if it cannot be found already
		if(javaRiceValue == null) {
			// report error shit here
			// BuildChecker.reportCustomError(ErrorRepository.UNDECLARED_VARIABLE, "", varExprCtx.getText(), this.lineNumber);
		}
	}
	
	/*
	 * Verifies a var or const identifier from a scan statement since scan grammar is different.
	 */
	public static void verifyVarOrConstForScan(String identifier, StatementContext statementCtx) {
		// parser handler shit here
		ClassScope classScope = null;
		JavaRiceValue javaRiceValue = VariableSearcher.searchVariableInClassIncludingLocal(classScope, identifier);
		
		if(javaRiceValue == null) {
			// report error shit here
			// BuildChecker.reportCustomError(ErrorRepository.UNDECLARED_VARIABLE, "", identifier, firstToken.getLine());
		}
	}
}
