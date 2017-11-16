package model.javarice.error.errorcheckers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.javarice.JavaRiceParser.VariableDeclaratorIdContext;
import model.javarice.execution.ExecutionManager;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.searching.VariableSearcher;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.symboltable.scopes.LocalScopeCreator;

public class MultipleVarDecChecker implements IErrorChecker, ParseTreeListener {
	
	private VariableDeclaratorIdContext varDecIdCtx;
	private int lineNumber;
	
	public MultipleVarDecChecker(VariableDeclaratorIdContext varDecIdCtx) {
		this.varDecIdCtx = varDecIdCtx;
		
		Token firstToken = this.varDecIdCtx.getStart();
		this.lineNumber = firstToken.getLine();
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		if(ctx instanceof VariableDeclaratorIdContext) {
			VariableDeclaratorIdContext varDecCtx = (VariableDeclaratorIdContext) ctx;
			this.verifyVariableOrConst(varDecCtx.getText());
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
		treeWalker.walk(this, this.varDecIdCtx);
	}

	private void verifyVariableOrConst(String identifierString) {
		JavaRiceValue javaRiceValue = null;
		
		if(ExecutionManager.getInstance().isInFunctionExecution()) {
			JavaRiceFunction javaRiceFunction = ExecutionManager.getInstance().getCurrentFunction();
			javaRiceValue = VariableSearcher.searchVariableInFunction(javaRiceFunction, identifierString);
		}
		
		// if after function finding, java rice value is still null, search local scope
		if(javaRiceValue == null) {
			javaRiceValue = LocalScopeCreator.searchVariableInLocalIterative(identifierString, 
					LocalScopeCreator.getInstance().getActiveLocalScope());
		}
		
		// if mobi value is still null, search class
		if(javaRiceValue == null) {
			// parser handler shit here
			ClassScope classScope = null;
			javaRiceValue = VariableSearcher.searchVariableInClass(classScope, identifierString);
		}
		
		if(javaRiceValue != null) {
			// report error shit here
			// BuildChecker.reportCustomError(ErrorRepository.MULTIPLE_VARIABLE, "", identifierString, this.lineNumber);
		}
	}
}
