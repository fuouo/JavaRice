package model.javarice.semantics.analyzers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.javarice.builder.ParserHandler;
import model.javarice.error.errorcheckers.ParameterMismatchChecker;
import model.javarice.execution.commands.evaluation.EvaluationCommand;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.symboltable.SymbolTableManager;
import model.javarice.semantics.symboltable.scopes.ClassScope;

public class FunctionCallVerifier implements ParseTreeListener {

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		if(ctx instanceof ExpressionContext) {
			ExpressionContext exprCtx = (ExpressionContext) ctx;
			if (EvaluationCommand.isFunctionCall(exprCtx)) {
				if(exprCtx.expression(0).Identifier() == null)
					return;
				
				String functionName = exprCtx.expression(0).Identifier().getText();

				ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
						ParserHandler.getInstance().getCurrentClassName());
				JavaRiceFunction javaRiceFunction = classScope.searchFunction(functionName);
				
				if (exprCtx.arguments() != null) {
					ParameterMismatchChecker paramsMismatchChecker = 
							new ParameterMismatchChecker(javaRiceFunction, exprCtx.arguments());
					paramsMismatchChecker.verify();
				}
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

}
