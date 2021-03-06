package model.javarice.semantics.representations;

import java.util.Stack;

import controller.Console;
import controller.Console.LogType;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.execeptionhandler.IAttemptCommand.CatchType;
import model.javarice.semantics.utils.RecognizedKeywords;
import model.javarice.semantics.utils.StringUtils;

public class JavaRiceValue {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";

	//these are the accepted primitive types
	public enum PrimitiveType {
		NOT_YET_IDENTIFIED,
		BOOLEAN,
		CHAR,
		INT,
		SHORT,
		LONG,
		FLOAT,
		DOUBLE,
		STRING,
		ARRAY
	}

	private Stack<Object> defaultValue; //this value will no longer change.
	private Stack<Object> value;
	private PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;
	private boolean finalFlag = false;
	private boolean scanning = false;
	
	public JavaRiceValue(Object value, PrimitiveType primitiveType) {
		
		if(value == null || checkValueType(value, primitiveType)) {					
			this.value = new Stack<>();
			
			if(value == null) {
				if(primitiveType != PrimitiveType.STRING && primitiveType != PrimitiveType.CHAR) {
					this.value.push(0);
				} else {
					this.value.push(value);
				}
			} else {
				this.value.push(value);
			}
			
			
			this.primitiveType = primitiveType;
		} else {
			// type mismatch???
			System.err.println("Type mismatch ???");
		}
	}
	
	public void setPrimitiveType(PrimitiveType primitiveType) {
		this.primitiveType = primitiveType;
	}
	
	public PrimitiveType getPrimitiveType() {
		return this.primitiveType;
	}
	
	public void markFinal() {
		this.finalFlag = true;
	}
	
	public boolean isFinal() {
		return this.finalFlag;
	}
	
	public void reset() {
		this.value = this.defaultValue;
	}
	
	public void setValue(String value) {
		
		switch(this.primitiveType) {
		case BOOLEAN:
		case CHAR:
		case INT:
		case SHORT:
		case LONG:
		case FLOAT:
		case DOUBLE:
			this.value.push(this.attemptTypeCast(value));
			break;
		case STRING:
			value = StringUtils.removeQuotes(value);
			this.value.push(value);
			break;
		case ARRAY:
			// error
			System.err.println(this.primitiveType + " is an array. Cannot directly change value.");
			break;
		case NOT_YET_IDENTIFIED:
			System.err.println("Primitive type not yet identified!");
			break;
		}
	}
	
	public Object getValue() {
		return this.value.peek();
	}
	
	public Object popBack() {
		if(this.value.size() > 2) {
			return this.value.pop();
		}
		
		return null;
	}
	
	public int stackSize() {
		return this.value.size();
	}
	
	public void setScanning(boolean scanning) {
		this.scanning = scanning;
	}
	
	private Object attemptTypeCast(String value) {		
		
		try {
			switch(this.primitiveType) {
				case BOOLEAN: return Boolean.valueOf(value);
				case CHAR: return Character.valueOf(value.charAt(0)); //only get first char at value
				case INT: 
					String s = value;
					
					if(s.contains(".")) {
						String[] tokens = s.split("\\.");
						return Integer.valueOf(tokens[0]);
					} else {
						return Integer.valueOf(value);
					}
				case LONG: return Long.valueOf(value);
				case SHORT: return Short.valueOf(value);
				case FLOAT: return Float.valueOf(value);
				case DOUBLE: return Double.valueOf(value);
				case STRING: return value;
				default: return null;
			}
		} catch(NumberFormatException e) {
			
			if(this.scanning) {
				ExecutionManager.getInstance().setCurrCatchType(CatchType.INPUT_MISMATCH);
			} else {
				ExecutionManager.getInstance().setCurrCatchType(CatchType.NUMBER_FORMAT);
			}
			
			return null;
		}
	}
	
	public static boolean checkValueType(Object value, PrimitiveType primitiveType) {
		switch(primitiveType) {
			case BOOLEAN:
				return value instanceof Boolean;
			case CHAR:
				return value instanceof Character;
			case INT:
				return value instanceof Integer;
			case SHORT:
				return value instanceof Short;
			case LONG:
				return value instanceof Long;
			case FLOAT:
				return value instanceof Float;
			case DOUBLE:
				return value instanceof Double;
			case STRING:
				return value instanceof String;
			case ARRAY:
				return value instanceof Object;
			default:
				return false;
		}
	}
	
	/*
	 * Utility function.
	 * Attempts to add an empty variable based from keywords
	 */
	public static JavaRiceValue createEmptyVariableFromKeywords(String primitiveTypeString) {
		
		//identify primitive type
		PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;
		
		if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_BOOLEAN, primitiveTypeString)) {
			primitiveType = PrimitiveType.BOOLEAN;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_CHAR, primitiveTypeString)) {
			primitiveType = PrimitiveType.CHAR;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_DOUBLE, primitiveTypeString)) {
			primitiveType = PrimitiveType.DOUBLE;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_FLOAT, primitiveTypeString)) {
			primitiveType = PrimitiveType.FLOAT;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_INT, primitiveTypeString)) {
			primitiveType = PrimitiveType.INT;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_LONG, primitiveTypeString)) {
			primitiveType = PrimitiveType.LONG;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_SHORT, primitiveTypeString)) {
			primitiveType = PrimitiveType.SHORT;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_STRING, primitiveTypeString)) {
			primitiveType = PrimitiveType.STRING;
		}
		
		//create empty java rice value
		return new JavaRiceValue(null, primitiveType);
	}

}
