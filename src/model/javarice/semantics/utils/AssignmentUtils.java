package model.javarice.semantics.utils;

import java.math.BigDecimal;

import controller.Console;
import controller.Console.LogType;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;

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
			Console.log(LogType.DEBUG, "JavaRiceValue: Did not find appropriate type!");
		}
	}
	
	public static void assignAppropriateValue(JavaRiceValue javaRiceValue, String stringValue) {
		if(javaRiceValue.getPrimitiveType() == PrimitiveType.STRING || 
				javaRiceValue.getPrimitiveType() == PrimitiveType.CHAR) {
			javaRiceValue.setValue(stringValue);
		}
	}

}