package model.javarice.execution.commands.evaluation;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
import model.javarice.error.errorcheckers.ConstChecker;
import model.javarice.error.errorcheckers.TypeErrorChecker;
import model.javarice.error.errorcheckers.UndeclaredChecker;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.ICommand;
import model.javarice.generatedexp.JavaRiceLexer;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.semantics.analyzers.FunctionCallVerifier;
import model.javarice.semantics.representations.JavaRiceArray;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.searching.VariableSearcher;
import model.javarice.semantics.utils.AssignmentUtils;

public class AssignmentCommand implements ICommand {

	private final String TAG = this.getClass().getSimpleName() + ": ";

	private ExpressionContext leftHandExprCtx;
	private ExpressionContext rightHandExprCtx;

	public AssignmentCommand(ExpressionContext leftHandExprCtx, ExpressionContext rightHandExprCtx) {
		this.leftHandExprCtx = leftHandExprCtx;
		this.rightHandExprCtx = rightHandExprCtx;

		UndeclaredChecker undeclaredChecker;
		ConstChecker constChecker;

		if(isLeftHandArrayAccessor()) {
			undeclaredChecker = new UndeclaredChecker(this.leftHandExprCtx.expression(0));
			undeclaredChecker.verify();

			constChecker = new ConstChecker(this.leftHandExprCtx.expression(0));
			constChecker.verify();
		} else {
			undeclaredChecker = new UndeclaredChecker(this.leftHandExprCtx);
			undeclaredChecker.verify();

			constChecker = new ConstChecker(this.leftHandExprCtx);
			constChecker.verify();
		}

		undeclaredChecker = new UndeclaredChecker(this.rightHandExprCtx);
		undeclaredChecker.verify();

		ParseTreeWalker functionWalker = new ParseTreeWalker();
		functionWalker.walk(new FunctionCallVerifier(), this.rightHandExprCtx);

		// type check the java rice value
		JavaRiceValue javaRiceValue;

		if(ExecutionManager.getInstance().isInFunctionExecution()) {
			javaRiceValue = VariableSearcher.searchVariableInFunction(
					ExecutionManager.getInstance().getCurrentFunction(), this.leftHandExprCtx.getText());

			// maybe it's array
			if(javaRiceValue == null && this.isLeftHandArrayAccessor()) {
				javaRiceValue = VariableSearcher.searchVariableInFunction(
						ExecutionManager.getInstance().getCurrentFunction(), 
						this.leftHandExprCtx.expression(0).getText());
			}
		}
		else {
			javaRiceValue = VariableSearcher.searchVariable(this.leftHandExprCtx.getText());
			
			// maybe it's array
			if(javaRiceValue == null && this.isLeftHandArrayAccessor()) {
				javaRiceValue =VariableSearcher.searchVariable(this.leftHandExprCtx.expression(0).getText());
			}
		}

		TypeErrorChecker typeChecker = new TypeErrorChecker(javaRiceValue, this.rightHandExprCtx);
		typeChecker.verify();
	}



	@Override
	public void execute() {
		// TODO Auto-generated method stub
		EvaluationCommand evaluationCommand = new EvaluationCommand(this.rightHandExprCtx);
		evaluationCommand.execute();
		
		if(evaluationCommand.hasException()) {
			return;
		}

		if(this.isLeftHandArrayAccessor()) {
			
			if(evaluationCommand.isNumericResult()) {
				this.handleArrayAssignment(evaluationCommand.getResult().toEngineeringString());
			} else {
				this.handleArrayAssignment(evaluationCommand.getStringResult());
			}
		}
		else {
			JavaRiceValue javaRiceValue = VariableSearcher.searchVariable(this.leftHandExprCtx.getText());
			
			if(evaluationCommand.isNumericResult()) {
				AssignmentUtils.assignAppropriateValue(javaRiceValue, evaluationCommand.getResult());
			} else {

				AssignmentUtils.assignAppropriateValue(javaRiceValue, evaluationCommand.getStringResult());
			}
		}
	}

	public boolean isLeftHandArrayAccessor() {
		List<TerminalNode> lBrackTokens = this.leftHandExprCtx.getTokens(JavaRiceLexer.LBRACK);
		List<TerminalNode> rBrackTokens = this.leftHandExprCtx.getTokens(JavaRiceLexer.RBRACK);

		return(lBrackTokens.size() > 0 && rBrackTokens.size() > 0);
	}

	private void handleArrayAssignment(String resultString) {
		TerminalNode identifierNode = this.leftHandExprCtx.expression(0).primary().Identifier();
		ExpressionContext arrayIndexExprCtx = this.leftHandExprCtx.expression(1);
		
		ExecutionManager.getInstance().setCurrLineNumber(arrayIndexExprCtx.getStart().getLine());

		JavaRiceValue javaRiceValue = VariableSearcher.searchVariable(identifierNode.getText());
		JavaRiceArray javaRiceArray = (JavaRiceArray) javaRiceValue.getValue();

		EvaluationCommand evaluationCommand = new EvaluationCommand(arrayIndexExprCtx);
		evaluationCommand.execute();

		//create a new array value to replace value at specified index
		JavaRiceValue newArrayValue = new JavaRiceValue(null, javaRiceArray.getPrimitiveType());
		newArrayValue.setValue(resultString);
		javaRiceArray.updateValueAt(newArrayValue, evaluationCommand.getResult().intValue());

		//Console.log("Index to access: " +evaluationCommand.getResult().intValue()+ " Updated with: " +resultString);
	}
	
	public ExpressionContext getLeftHandExpression() {
		return this.leftHandExprCtx;
	}

}