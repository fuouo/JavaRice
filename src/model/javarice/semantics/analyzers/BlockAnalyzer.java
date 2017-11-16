package model.javarice.semantics.analyzers;

import java.util.List;

import model.javarice.JavaRiceParser.BlockContext;
import model.javarice.JavaRiceParser.BlockStatementContext;
import model.javarice.JavaRiceParser.LocalVariableDeclarationStatementContext;
import model.javarice.JavaRiceParser.StatementContext;
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
