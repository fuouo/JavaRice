package model.javarice.semantics.mapping;

import model.javarice.execution.FunctionTracker;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.ParExpressionContext;
import model.javarice.semantics.representations.JavaRiceValue;

public class IdentifierMapper implements IValueMapper {
	
	private IValueMapper valueMapper;
	
	public IdentifierMapper(String origExpression) {
		if(FunctionTracker.getInstance().isInsideFunction()) {
			this.valueMapper = new FunctionIdentifierMapper(origExpression, 
					FunctionTracker.getInstance().getLatestFunction());
		} else {
			this.valueMapper = new ClassIdentifierMapper(origExpression);
		}
	}

	@Override
	public void analyze(ExpressionContext expressionContext) {
		// TODO Auto-generated method stub
		this.valueMapper.analyze(expressionContext);
	}

	@Override
	public void analyze(ParExpressionContext expressionContext) {
		// TODO Auto-generated method stub
		this.valueMapper.analyze(expressionContext);
	}

	@Override
	public String getOriginalExpression() {
		return this.valueMapper.getOriginalExpression();
	}

	@Override
	public String getModifiedExpression() {
		return this.valueMapper.getModifiedExpression();
	}

	@Override
	public JavaRiceValue getJavaRiceValue() {
		return this.valueMapper.getJavaRiceValue();
	}

}
