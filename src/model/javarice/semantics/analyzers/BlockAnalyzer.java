package model.javarice.semantics.analyzers;

import java.util.List;

import model.javarice.generatedexp.JavaRiceParser.BlockContext;
import model.javarice.generatedexp.JavaRiceParser.BlockStatementContext;
import model.javarice.generatedexp.JavaRiceParser.LocalVariableDeclarationStatementContext;
import model.javarice.generatedexp.JavaRiceParser.StatementContext;
import model.javarice.semantics.symboltable.scopes.LocalScopeCreator;

public class BlockAnalyzer {
	
	public BlockAnalyzer() {
		LocalScopeCreator.getInstance().openLocalScope();
	}
	
	public void analyze(BlockContext ctx) {
		
		List<BlockStatementContext> blockListCtx = ctx.blockStatement();
		
		for(BlockStatementContext blockStatementCtx : blockListCtx) {
			if(blockStatementCtx.statement() != null) {
				StatementContext statementCtx = blockStatementCtx.statement();
				StatementAnalyzer statementAnalyzer = new StatementAnalyzer();
				statementAnalyzer.analyze(statementCtx);
			}
			else if(blockStatementCtx.localVariableDeclarationStatement() != null) {
				LocalVariableDeclarationStatementContext localVarDecStatementCtx = 
						blockStatementCtx.localVariableDeclarationStatement();
				
				LocalVariableAnalyzer localVarAnalyzer = new LocalVariableAnalyzer();
				localVarAnalyzer.analyze(localVarDecStatementCtx.localVariableDeclaration());
			}
		}
		
		LocalScopeCreator.getInstance().closeLocalScope();
	}

}
