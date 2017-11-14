package model.javarice.semantics.mapping;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.javarice.JavaRiceParser.ExpressionContext;
import model.javarice.JavaRiceParser.ParExpressionContext;
import model.javarice.JavaRiceParser.PrimaryContext;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.symboltable.scopes.LocalScope;
import model.javarice.semantics.symboltable.scopes.LocalScopeCreator;

public class FunctionIdentifierMapper implements ParseTreeListener, IValueMapper {

	private String origExpression;
	private String modExpression;
	
	private JavaRiceFunction assignedFunction;
	private JavaRiceValue javaRiceValue;
	private LocalScope functionLocalScope;
	
	public FunctionIdentifierMapper(String origExpression, JavaRiceFunction assignedFunction) {
		this.origExpression = origExpression;
		this.modExpression = origExpression;
		this.assignedFunction = assignedFunction;
		this.functionLocalScope = assignedFunction.getParentLocalScope();
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
				this.searchVariable(variableKey);
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
	
	private void searchVariable(String strIdentifier) {
		if(this.assignedFunction.hasParameter(strIdentifier)) {
			this.modExpression = this.modExpression.replace(strIdentifier, 
					this.assignedFunction.getParameter(strIdentifier).getValue().toString());
		} else {
			this.javaRiceValue = 
					LocalScopeCreator.searchVariableInLocalIterative(strIdentifier, this.functionLocalScope);
			
			if(this.javaRiceValue != null) {
				this.modExpression = 
						this.modExpression.replace(strIdentifier, this.javaRiceValue.getValue().toString());
			} else {
				// parser handler shit here
				ClassScope classScope = null;
				this.javaRiceValue = classScope.searchVariableIncludingLocal(strIdentifier);
				
				this.modExpression = 
						this.modExpression.replace(strIdentifier, this.javaRiceValue.getValue().toString());
			}
		}
	}

}
