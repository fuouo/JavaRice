package model.javarice.execution.commands.simple;

import org.antlr.v4.runtime.Token;

import controller.Console;
import controller.Console.LogType;
import model.javarice.builder.BuildChecker;
import model.javarice.builder.ErrorRepository;
import model.javarice.error.errorcheckers.TypeErrorChecker;
import model.javarice.error.errorcheckers.UndeclaredChecker;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.evaluation.EvaluationCommand;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.utils.AssignmentUtils;

public class ReturnCommand implements ICommand {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	private ExpressionContext expressionContext;
	private JavaRiceFunction assignedJavaRiceFunction;
	
	public ReturnCommand(ExpressionContext expressionContext, JavaRiceFunction assignedJavaRiceFunction) {
		this.expressionContext = expressionContext;
		this.assignedJavaRiceFunction = assignedJavaRiceFunction;

		UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.expressionContext);
		undeclaredChecker.verify();
		
		JavaRiceValue javaRiceValue = this.assignedJavaRiceFunction.getReturnValue();
		
		if(javaRiceValue == null) {
			// void
			Token firstToken = this.expressionContext.getStart();
			int lineNumber = firstToken.getLine();
			
			BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH, 
					"You can't return a value from a void function.", lineNumber);
		} else {
			TypeErrorChecker typeChecker = new TypeErrorChecker(javaRiceValue, this.expressionContext);
			typeChecker.verify();
		}
		
		
	}

	@Override
	public void execute() {
		EvaluationCommand evalCommand = new EvaluationCommand(this.expressionContext);
		evalCommand.execute();
		
		JavaRiceValue javaRiceValue = this.assignedJavaRiceFunction.getReturnValue();		
		
		AssignmentUtils.assignAppropriateValue(javaRiceValue, evalCommand.getResult());
	}

}
