package model.javarice.semantics.utils;

import java.math.BigDecimal;

import model.javarice.semantics.representations.JavaRiceValue;

public class AssignmentUtils {
	
	public static void assignAppropriateValue(JavaRiceValue javaRiceValue, BigDecimal evalValue) {
		switch(javaRiceValue.getPrimitiveType()) {
		case INT:
			javaRiceValue.setValue(Integer.toString(evalValue.intValue()));
			break;
		case LONG:
			javaRiceValue.setValue(Long.toString(evalValue.longValue()));
			break;
		case SHORT:
			javaRiceValue.setValue(Short.toString(evalValue.shortValue()));
			break;
		case FLOAT:
			javaRiceValue.setValue(Float.toString(evalValue.floatValue()));
			break;
		case DOUBLE:
			javaRiceValue.setValue(Double.toString(evalValue.doubleValue()));
			break;
		case BOOLEAN:
			
			int result = evalValue.intValue();
			
			if(result == 1) {
				javaRiceValue.setValue(RecognizedKeywords.BOOLEAN_TRUE);
			} else {
				javaRiceValue.setValue(RecognizedKeywords.BOOLEAN_FALSE);
			}
			
			break;
		default:
			// add to console
			System.err.println("ADD TO CONSOLE: JavaRiceValue: Did not find appropriate type!" );
		}
	}

}
