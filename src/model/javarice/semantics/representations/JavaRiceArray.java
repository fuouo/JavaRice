package model.javarice.semantics.representations;

import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;
import model.javarice.semantics.utils.RecognizedKeywords;

public class JavaRiceArray {
	
	private JavaRiceValue[] javaRiceArray;
	private PrimitiveType arrayPrimitiveType;
	private String arrayIdentifier;
	private boolean finalFlag = false;
	
	public JavaRiceArray(PrimitiveType primitiveType, String identifier) {
		this.arrayPrimitiveType = primitiveType;
		this.arrayIdentifier = identifier;
	}
	
	public void setPrimitiveType(PrimitiveType arrayPrimitiveType) {
		this.arrayPrimitiveType = arrayPrimitiveType;
	}
	
	public PrimitiveType getPrimitiveType() {
		return arrayPrimitiveType;
	}
	
	public void markFinal() {
		this.finalFlag = true;
	}
	
	public boolean isFinal() {
		return this.finalFlag;
	}
	
	public void initializeSize(int size) {
		this.javaRiceArray = new JavaRiceValue[size];
		System.out.println("JavaRiceArray initialized to size " + this.javaRiceArray.length);
	}
	
	public int getSize() {
		return this.javaRiceArray.length;
	}
	
	public void updateValueAt(JavaRiceValue javaRiceValue, int index) {
		if(index >= this.javaRiceArray.length) {
			// should print error to console
			System.err.println("Print to Console: ARRAY OUT OF BOUNDS");
			return;
		}
		
		this.javaRiceArray[index] = javaRiceValue;
	}
	
	public JavaRiceValue getValueAt(int index) {
		if(index >= this.javaRiceArray.length) {
			// should print error to console
			System.err.println("Print to Console: ARRAY OUT OF BOUNDS");
			return this.javaRiceArray[this.javaRiceArray.length - 1];
		}
		
		return this.javaRiceArray[index];
	}
	
	/*
	 * Utility function that returns an arary of specified primitive type.
	 */
	public static JavaRiceArray createArray(String primitiveTypeString, String arrayIdentifier) {
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
		
		return new JavaRiceArray(primitiveType, arrayIdentifier);
	}

}
