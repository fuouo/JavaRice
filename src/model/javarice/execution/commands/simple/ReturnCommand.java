package model.javarice.execution.commands.simple;

import model.javarice.JavaRiceParser.ExpressionContext;
import model.javarice.error.errorcheckers.TypeErrorChecker;
import model.javarice.error.errorcheckers.UndeclaredChecker;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.evaluation.EvaluationCommand;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.utils.AssignmentUtils;

public class ReturnCommand implements ICommand {
	
	private ExpressionContext expressionContext;
	private JavaRiceFunction assignedJavaRiceFunction;
	
	public ReturnCommand(ExpressionContext expressionContext, JavaRiceFunction assignedJavaRiceFunction) {
		this.expressionContext = expressionContext;
		this.assignedJavaRiceFunction = assignedJavaRiceFunction;

		UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.expressionContext);
		undeclaredChecker.verify();
		
		JavaRiceValue javaRiceValue = this.assignedJavaRiceFunction.getReturnValue();
		TypeErrorChecker typeChecker = new TypeErrorChecker(javaRiceValue, this.expressionContext);
		typeChecker.verify();
	}

	@Override
	public void execute() {
		EvaluationCommand evalCommand = new EvaluationCommand(this.expressionContext);
		evalCommand.execute();
		
		JavaRiceValue javaRiceValue = this.assignedJavaRiceFunction.getReturnValue();
		
		AssignmentUtils.assignAppropriateValue(javaRiceValue, evalCommand.getResult());
	}

}
