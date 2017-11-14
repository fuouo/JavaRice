package model.javarice.semantics.mapping;

import model.javarice.JavaRiceParser.ExpressionContext;
import model.javarice.JavaRiceParser.ParExpressionContext;
import model.javarice.semantics.representations.JavaRiceValue;

public interface IValueMapper {
	
	public abstract void analyze(ExpressionContext expressionContext);
	public abstract void analyze(ParExpressionContext expressionContext);
	public abstract String getOriginalExpression();
	public abstract String getModifiedExpression();
	public abstract JavaRiceValue getJavaRiceValue();	

}
