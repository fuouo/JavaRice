package model.javarice.execution.commands.utils;

import model.javarice.JavaRiceParser.ExpressionContext;
import model.javarice.JavaRiceParser.ParExpressionContext;
import model.javarice.execution.commands.evaluation.EvaluationCommand;

public class ConditionEvaluator {

	public static boolean evaluateCondition(ParExpressionContext parExprCtx) {

		ExpressionContext condExprCtx = parExprCtx.expression();

		// catch rules if the is value has direct boolean flags
		if(condExprCtx.getText().contains("(true)")) {
			return true;
		} else if(condExprCtx.getText().contains("(false)")) {
			return false;
		}

		EvaluationCommand evalCommand = new EvaluationCommand(condExprCtx);
		evalCommand.execute();

		int result = evalCommand.getResult().intValue();

		return result == 1;
	}

	public static boolean evaluateCondition(ExpressionContext condExprCtx) {
		// catch rules if the is value has direct boolean flags
		if(condExprCtx.getText().contains("(true)")) {
			return true;
		} else if(condExprCtx.getText().contains("(false)")) {
			return false;
		}

		EvaluationCommand evalCommand = new EvaluationCommand(condExprCtx);
		evalCommand.execute();

		int result = evalCommand.getResult().intValue();

		return result == 1;
	}

}
