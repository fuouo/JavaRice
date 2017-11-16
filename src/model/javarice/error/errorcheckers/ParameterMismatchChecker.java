package model.javarice.error.errorcheckers;

import java.util.List;

import model.javarice.JavaRiceParser.ArgumentsContext;
import model.javarice.JavaRiceParser.ExpressionContext;
import model.javarice.semantics.representations.JavaRiceFunction;

public class ParameterMismatchChecker implements IErrorChecker {
	
	private JavaRiceFunction javaRiceFunction;
	private List<ExpressionContext> exprCtxList;
	private int lineNumber;
	
	public ParameterMismatchChecker(JavaRiceFunction javaRiceFunction, ArgumentsContext argumentsCtx) {
		this.javaRiceFunction = javaRiceFunction;

		if(argumentsCtx.expressionList() != null) {
			this.exprCtxList = argumentsCtx.expressionList().expression();
		}
		
		this.lineNumber = argumentsCtx.getStart().getLine();
	}

	@Override
	public void verify() {
		// TODO Auto-generated method stub
		if(this.javaRiceFunction == null) {
			return;
		}
		
		if(this.exprCtxList == null && this.javaRiceFunction.getParameterValueSize() != 0) {
			
			// report error shit here
			// BuildChecker.reportCustomError(ErrorRepository.PARAMETER_COUNT_MISMATCH, "", this.mobiFunction.getFunctionName(), this.lineNumber);
		}
		else if(this.exprCtxList != null && this.exprCtxList.size() != this.javaRiceFunction.getParameterValueSize()) {
			// report error shit here
			// BuildChecker.reportCustomError(ErrorRepository.PARAMETER_COUNT_MISMATCH, "", this.mobiFunction.getFunctionName(), this.lineNumber);
		}
	}

}
