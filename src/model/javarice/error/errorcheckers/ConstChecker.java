package model.javarice.error.errorcheckers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.javarice.builder.BuildChecker;
import model.javarice.builder.ErrorRepository;
import model.javarice.builder.ParserHandler;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.evaluation.EvaluationCommand;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.ScanContext;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.searching.VariableSearcher;
import model.javarice.semantics.symboltable.SymbolTableManager;
import model.javarice.semantics.symboltable.scopes.ClassScope;

public class ConstChecker implements IErrorChecker, ParseTreeListener {
	
	private ExpressionContext exprCtx;
	private int lineNumber;
	
	public ConstChecker(ExpressionContext exprCtx) {
		this.exprCtx = exprCtx;
		
		Token firstToken = this.exprCtx.getStart();
		this.lineNumber = firstToken.getLine();
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		if(ctx instanceof ExpressionContext) {
			ExpressionContext exprCtx = (ExpressionContext) ctx;
			if(EvaluationCommand.isVariableOrConstant(exprCtx)) {
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
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, this.exprCtx);
	}
	
	private void verifyVariableOrConst(ExpressionContext varExprCtx) {
		JavaRiceValue javaRiceValue = null;
		
		if(ExecutionManager.getInstance().isInFunctionExecution()) {
			JavaRiceFunction javaRiceFunction = ExecutionManager.getInstance().getCurrentFunction();
			javaRiceValue = VariableSearcher.searchVariableInFunction(
					javaRiceFunction, varExprCtx.primary().Identifier().getText());
		}
		
		//if after function finding, java rice value is still null, search class
		if(javaRiceValue == null) {
			ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
					ParserHandler.getInstance().getCurrentClassName());
			javaRiceValue = VariableSearcher.searchVariableInClassIncludingLocal(
					classScope, varExprCtx.primary().Identifier().getText());
		}
		
		if(javaRiceValue != null && javaRiceValue.isFinal()) {
			BuildChecker.reportCustomError(ErrorRepository.CONST_REASSIGNMENT, "", 
					this.lineNumber, varExprCtx.getText());
		}
	}
	
	/*
	 * Verifies a const identifier from a scan statement since scan grammar is different.
	 */
	public static void verifyConstForScan(String identifier, ScanContext statementCtx) {		
		JavaRiceValue javaRiceValue = null;
		
		if(ExecutionManager.getInstance().isInFunctionExecution()) {
			JavaRiceFunction javaRiceFunction = ExecutionManager.getInstance().getCurrentFunction();
			javaRiceValue = VariableSearcher.searchVariableInFunction(
					javaRiceFunction, identifier);
		}
		
		//if after function finding, java rice value is still null, search class
		if(javaRiceValue == null) {
			ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
					ParserHandler.getInstance().getCurrentClassName());
			javaRiceValue = VariableSearcher.searchVariableInClassIncludingLocal(
					classScope, identifier);
		}
		
		Token firstToken = statementCtx.getStart();
		
		if(javaRiceValue != null && javaRiceValue.isFinal()) {
			BuildChecker.reportCustomError(ErrorRepository.CONST_REASSIGNMENT, "", 
					firstToken.getLine(), identifier);
		}
	}

}
