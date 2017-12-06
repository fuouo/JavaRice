package model.javarice.execution.commands.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
import model.javarice.error.errorcheckers.UndeclaredChecker;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.evaluation.EvaluationCommand;
import model.javarice.execution.commands.execeptionhandler.IAttemptCommand.CatchType;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.LiteralContext;
import model.javarice.generatedexp.JavaRiceParser.PrimaryContext;
import model.javarice.generatedexp.JavaRiceParser.StatementContext;
import model.javarice.semantics.representations.JavaRiceArray;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;
import model.javarice.semantics.representations.JavaRiceValueSearcher;
import model.javarice.semantics.utils.Expression;
import model.javarice.semantics.utils.StringUtils;

public class PrintCommand implements ICommand, ParseTreeListener{
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	private final Pattern functionPattern = Pattern.compile("([a-zA-Z0-9]+)\\(([ ,.a-zA-Z0-9]*)\\)");
	private final Pattern arrayPattern = Pattern.compile("([a-zA-Z0-9]+)\\[([ ,.+a-zA-Z0-9]*)\\]");
	
	private ExpressionContext expressionContext;
	
	private String strToPrint = "";
//	private boolean evaluatedExpr = false;
	private boolean complexExpr = false;
	private boolean arrayAccess = false;
	private boolean isLN = false;
	
	private boolean isEvaluatedExpr = false;
	
	private List<Object> printExpr = new ArrayList<>();
	
	public PrintCommand(StatementContext sCtx) {
		
		isLN = sCtx.WRITELN() != null;
		
		this.expressionContext = sCtx.expression(0);
		
		UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.expressionContext);
		undeclaredChecker.verify();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, expressionContext);

		if(isLN) {
			this.strToPrint += "\n";
		}
		
		// log to console
		Console.log(LogType.VERBOSE, this.strToPrint);
		Console.log(LogType.PRINT, this.strToPrint);
		
		// rest statement to print
		this.strToPrint = "";
		this.isEvaluatedExpr = false;
	}

	@Override
	public void enterEveryRule(ParserRuleContext context) {
		// TODO Auto-generated method stub
		
		if(context instanceof ExpressionContext && !isEvaluatedExpr) {
			ExpressionContext exprCtx = (ExpressionContext) context;
			
			EvaluationCommand evalComm = new EvaluationCommand(exprCtx);
			evalComm.execute();
			
			if (ExecutionManager.getInstance().getCurrCatchType() != null ||
					ExecutionManager.getInstance().isAborted()) {
				this.strToPrint += "";
			} else {
				if(evalComm.isNumericResult()) {
					this.strToPrint += evalComm.getResult().toEngineeringString();
				} else {
					this.strToPrint += evalComm.getStringResult();
				}
			}
			
			
			
			
			
			this.isEvaluatedExpr = true;
		}
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext context) {
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
	
	public void evaluateArrayPrint(JavaRiceValue javaRiceValue, PrimaryContext primaryContext) {
		
		// move up and determine expression contexts
		ExpressionContext parentExpressionContext = (ExpressionContext) primaryContext.getParent().getParent();
		ExpressionContext arrayIndexExpressionContext = parentExpressionContext.expression(1);
		
		EvaluationCommand evaluationCommand = new EvaluationCommand(arrayIndexExpressionContext);
		evaluationCommand.execute();
		
		JavaRiceArray javaRiceArray = (JavaRiceArray) javaRiceValue.getValue();
		JavaRiceValue arrayJavaRiceValue = javaRiceArray.getValueAt(evaluationCommand.getResult().intValue());
		
		this.strToPrint += arrayJavaRiceValue.getValue().toString();
	}
	
	public String getStatementToPrint() {
		return this.strToPrint;
	}

}