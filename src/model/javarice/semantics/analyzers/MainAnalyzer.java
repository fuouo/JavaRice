package model.javarice.semantics.analyzers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
import model.javarice.builder.ParserHandler;
import model.javarice.execution.ExecutionManager;
import model.javarice.generatedexp.JavaRiceParser.BlockContext;
import model.javarice.generatedexp.JavaRiceParser.MainDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.MethodBodyContext;
import model.javarice.semantics.symboltable.SymbolTableManager;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.symboltable.scopes.LocalScope;
import model.javarice.semantics.symboltable.scopes.LocalScopeCreator;

public class MainAnalyzer implements ParseTreeListener {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	public MainAnalyzer() {
		
	}
	
	public void analyze(MainDeclarationContext ctx) {
		if(!ExecutionManager.getInstance().hasFoundEntryPoint()) {
			ExecutionManager.getInstance().reportFoundEntryPoint(ParserHandler.getInstance().getCurrentClassName());
			
			ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
					ParserHandler.getInstance().getCurrentClassName());
			LocalScope localScope = LocalScopeCreator.getInstance().openLocalScope();
			localScope.setParent(classScope);
			classScope.setParentLocalScope(localScope);
			
			ParseTreeWalker treeWalker = new ParseTreeWalker();
			treeWalker.walk(this, ctx);
			
		} else {
			Console.log(LogType.DEBUG, TAG + "Already found main in " +
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
