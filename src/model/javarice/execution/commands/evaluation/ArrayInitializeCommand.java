package model.javarice.execution.commands.evaluation;

import model.javarice.execution.commands.ICommand;
import model.javarice.generatedexp.JavaRiceParser.ArrayCreatorRestContext;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.semantics.representations.JavaRiceArray;

public class ArrayInitializeCommand implements ICommand {
	
	private JavaRiceArray javaRiceArray;
	private ArrayCreatorRestContext arrayCreatorCtx;
	
	public ArrayInitializeCommand(JavaRiceArray javaRiceArray, ArrayCreatorRestContext arrayCreatorCtx) {
		this.javaRiceArray = javaRiceArray;
		this.arrayCreatorCtx = arrayCreatorCtx;
	}
	

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ExpressionContext exprCtx = this.arrayCreatorCtx.expression(0);
		
		if(exprCtx != null) {
			EvaluationCommand evaluationCommand = new EvaluationCommand(exprCtx);
			evaluationCommand.execute();
			
			this.javaRiceArray.initializeSize(evaluationCommand.getResult().intValue());
		}
	}

}
