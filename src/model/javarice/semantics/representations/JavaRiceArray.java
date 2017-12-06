package model.javarice.semantics.representations;

import org.antlr.v4.runtime.ParserRuleContext;

import controller.Console;
import controller.Console.LogType;
import model.javarice.builder.BuildChecker;
import model.javarice.builder.ErrorRepository;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.execeptionhandler.IAttemptCommand.CatchType;
import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;
import model.javarice.semantics.statements.StatementControlOverseer;
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
		try {
			this.javaRiceArray = new JavaRiceValue[size];
			
			for(int i = 0; i < this.javaRiceArray.length; i ++) {
				this.javaRiceArray[i] = new JavaRiceValue(null, this.arrayPrimitiveType);
			}
			
		} catch(NegativeArraySizeException e) {
			this.javaRiceArray = null;
			
			ExecutionManager.getInstance().setCurrCatchType(CatchType.NEGATIVE_ARRAY_SIZE);
		}
	}
	
	public int getSize() {
		return this.javaRiceArray.length;
	}
	
	public void updateValueAt(JavaRiceValue javaRiceValue, int index) {
		
		if(javaRiceArray == null) {
			Console.log(LogType.DEBUG, "array not yet initialized! " + index);
			ExecutionManager.getInstance().setCurrCatchType(CatchType.NULL_POINTER);
			return;
		}
		
		if(index >= this.javaRiceArray.length) {
			Console.log(LogType.DEBUG, "array out of bounds detected! " + index);
			ExecutionManager.getInstance().setCurrCatchType(CatchType.ARRAY_OUT_OF_BOUNDS);
			return;
		}
		
		this.javaRiceArray[index] = javaRiceValue;
	}
	
	public JavaRiceValue getValueAt(int index) {
		
		if(javaRiceArray == null) {
			Console.log(LogType.DEBUG, "array not yet initialized! " + index);
			ExecutionManager.getInstance().setCurrCatchType(CatchType.NULL_POINTER);
			return null;
		}
		
		if(index >= this.javaRiceArray.length || index < 0) {
			ExecutionManager.getInstance().setCurrCatchType(CatchType.ARRAY_OUT_OF_BOUNDS);
			return null;
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
