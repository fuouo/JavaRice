package model.javarice.error.errorcheckers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
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

public class UndeclaredChecker implements IErrorChecker, ParseTreeListener {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	private ExpressionContext exprCtx;
	private int lineNumber;
	
	private String prevFunctionName = "";
	
	public UndeclaredChecker(ExpressionContext exprCtx) {
		this.exprCtx = exprCtx;
		
		Token firstToken = this.exprCtx.getStart();
		this.lineNumber = firstToken.getLine();
		this.prevFunctionName = "";
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
		if(ctx instanceof ExpressionContext) {
			ExpressionContext exprCtx = (ExpressionContext) ctx;
			if(EvaluationCommand.isFunctionCall(exprCtx)) {
				Console.log(LogType.DEBUG, TAG + "Function call detected! "
						+ exprCtx.getText());
				String s[] = exprCtx.getText().split("\\(");
				this.prevFunctionName = s[0];
				this.verifyFunctionCall(exprCtx);
			}
			else if(EvaluationCommand.isVariableOrConstant(exprCtx)) {
				if(!this.prevFunctionName.equals(exprCtx.getText())) {
					Console.log(LogType.DEBUG, TAG + "variable or constant detected! " 
							+ exprCtx.getText());
					this.verifyVariableOrConst(exprCtx);
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

	@Override
	public void verify() {
		// TODO Auto-generated method stub
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, this.exprCtx);
	}

	private void verifyFunctionCall(ExpressionContext funcExprCtx) {		
		
		if(funcExprCtx.expression(0).primary().Identifier() != null) {
			Console.log(LogType.DEBUG, TAG + "Function found " + funcExprCtx.expression(0).primary().Identifier());
		}
		
		if(funcExprCtx.expression(0).primary().Identifier() == null)
			return;
	
		String functionName = funcExprCtx.expression(0).primary().Identifier().getText();
		
		ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
				ParserHandler.getInstance().getCurrentClassName());
		JavaRiceFunction javaRiceFunction = classScope.searchFunction(functionName);
		
		if(javaRiceFunction == null) {
			BuildChecker.reportCustomError(ErrorRepository.UNDECLARED_FUNCTION, "", this.lineNumber, functionName);
		} else {
			Console.log(LogType.DEBUG, TAG + "Function found " + functionName);
		}
	}
	
	private void verifyVariableOrConst(ExpressionContext varExprCtx) {
		JavaRiceValue javaRiceValue = null;
		
		if(ExecutionManager.getInstance().isInFunctionExecution()) {
			JavaRiceFunction javaRiceFunction = ExecutionManager.getInstance().getCurrentFunction();
			
			Console.log(LogType.DEBUG, TAG + "searching " + varExprCtx.primary().Identifier().getText() + 
					" in " + javaRiceFunction.getFunctionName());
			
			javaRiceValue = VariableSearcher.searchVariableInFunction(
					javaRiceFunction, varExprCtx.primary().Identifier().getText());
		}
		
		// if main
		if(ExecutionManager.getInstance().isInMainExecution()) {
			ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
					ParserHandler.getInstance().getCurrentClassName());
			
			Console.log(LogType.DEBUG, TAG + "searching " + varExprCtx.primary().Identifier().getText() + 
					" in main");
			
			javaRiceValue = VariableSearcher.searchVariableInClassIncludingLocal(classScope, 
					varExprCtx.primary().Identifier().getText());
		}
		
		// if java rice value is still null, search class
		if(javaRiceValue == null) {
			ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
					ParserHandler.getInstance().getCurrentClassName());
			
			Console.log(LogType.DEBUG, TAG + "searching " + varExprCtx.primary().Identifier().getText() + 
					" in " + classScope.getClassName());
			
			
			javaRiceValue = VariableSearcher.searchVariableInClass(classScope, 
					varExprCtx.primary().Identifier().getText());
		}
		
		// after second pass, we conclude if it cannot be found already
		if(javaRiceValue == null) {
			BuildChecker.reportCustomError(ErrorRepository.UNDECLARED_VARIABLE, "", 
					this.lineNumber, varExprCtx.getText());
		}
	}
	
	/*
	 * Verifies a var or const identifier from a scan statement since scan grammar is different.
	 */
	public static void verifyVarOrConstForScan(String identifier, ScanContext statementCtx) {
		ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
				ParserHandler.getInstance().getCurrentClassName());
		JavaRiceValue javaRiceValue = VariableSearcher.searchVariableInClassIncludingLocal(classScope, identifier);
		
		Token firstToken = statementCtx.getStart();
		
		if(javaRiceValue == null) {
			BuildChecker.reportCustomError(ErrorRepository.UNDECLARED_VARIABLE, "", firstToken.getLine(), identifier);
		}
	}
}
