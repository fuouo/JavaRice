package model.javarice.semantics.mapping;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.javarice.builder.BuildChecker;
import model.javarice.builder.ErrorRepository;
import model.javarice.builder.ParserHandler;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.ParExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.PrimaryContext;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.symboltable.SymbolTableManager;
import model.javarice.semantics.symboltable.scopes.ClassScope;

public class ClassIdentifierMapper implements ParseTreeListener, IValueMapper {

	private JavaRiceValue javaRiceValue;
	private String origExpression = null;
	private String modExpression = null;
	
	public ClassIdentifierMapper(String origExpression) {
		this.origExpression = origExpression;
		this.modExpression = origExpression;
	}

	@Override
	public void analyze(ExpressionContext expressionContext) {
		// TODO Auto-generated method stub
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, expressionContext);
	}

	@Override
	public void analyze(ParExpressionContext expressionContext) {
		// TODO Auto-generated method stub
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, expressionContext);
	}

	@Override
	public String getOriginalExpression() {
		return this.origExpression;
	}

	@Override
	public String getModifiedExpression() {
		return this.modExpression;
	}

	@Override
	public JavaRiceValue getJavaRiceValue() {
		return this.javaRiceValue;
	}
	
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		if(ctx instanceof PrimaryContext) {
			PrimaryContext primaryContext = (PrimaryContext) ctx;
			
			if(primaryContext.Identifier() != null) {
				String variableKey = primaryContext.getText();
				
				ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
						ParserHandler.getInstance().getCurrentClassName());
				
				this.javaRiceValue = classScope.searchVariableIncludingLocal(variableKey);
				
				if(this.javaRiceValue.getValue() == null)
					BuildChecker.reportCustomError(ErrorRepository.UNINITIALIZED_VARIABLE, "", ctx.getStart().getLine(), variableKey);
				else
					this.modExpression = this.modExpression.replace(variableKey, this.javaRiceValue.getValue().toString());
			}
		}
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
