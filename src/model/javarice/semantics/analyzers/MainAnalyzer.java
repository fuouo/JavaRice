package model.javarice.semantics.analyzers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.javarice.JavaRiceParser.BlockContext;
import model.javarice.JavaRiceParser.MainDeclarationContext;
import model.javarice.JavaRiceParser.MethodBodyContext;
import model.javarice.execution.ExecutionManager;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.symboltable.scopes.LocalScope;
import model.javarice.semantics.symboltable.scopes.LocalScopeCreator;

public class MainAnalyzer implements ParseTreeListener {
	
	public MainAnalyzer() {
		
	}
	
	public void analyze(MainDeclarationContext ctx) {
		if(!ExecutionManager.getInstance().hasFoundEntryPoint()) {
			// parser handler shit here
			// report found entry point
			// ExecutionManager.getInstance().reportFoundEntryPoint(ParserHandler.getInstance().getCurrentClassName());
			
			// parser handler shit here
			ClassScope classScope = null;
			LocalScope localScope = LocalScopeCreator.getInstance().openLocalScope();
			localScope.setParent(classScope);
			classScope.setParentLocalScope(localScope);
			
			ParseTreeWalker treeWalker = new ParseTreeWalker();
			treeWalker.walk(this, ctx);
			
		} else {
			System.out.println("CONSOLE [DEBUG]: " + "Already found main in " +
					ExecutionManager.getInstance().getEntryClassName());
		}
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		if(ctx instanceof MethodBodyContext) {
			BlockContext blockCtx = ((MethodBodyContext) ctx).block();
			
			BlockAnalyzer blockAnalyzer = new BlockAnalyzer();
			blockAnalyzer.analyze(blockCtx);
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

}
