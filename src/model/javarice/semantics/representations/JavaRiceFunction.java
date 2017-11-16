package model.javarice.semantics.representations;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import model.javarice.JavaRiceParser.ExpressionContext;
import model.javarice.error.errorcheckers.TypeErrorChecker;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.ExecutionMonitor;
import model.javarice.execution.FunctionTracker;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.controlled.IControlledCommand;
import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.symboltable.scopes.LocalScope;
import model.javarice.semantics.utils.RecognizedKeywords;

public class JavaRiceFunction implements IControlledCommand{

	public enum FunctionType {
		INT_TYPE,
		BOOLEAN_TYPE,
		CHAR_TYPE,
		DOUBLE_TYPE,
		FLOAT_TYPE,
		LONG_TYPE,
		SHORT_TYPE,
		STRING_TYPE,
		VOID_TYPE,
	}

	private String functionName;

	// the list of command executions by the function
	private List<ICommand> commandSequences;	

	// parent local scope of this function
	private LocalScope parentLocalScope;

	// the list of parameters accepted that follows the 'call-by-reference'
	private LinkedHashMap<String, ClassScope> parameterReferences;

	// this list of parameters accepted that follows the 'call-by-value'
	private LinkedHashMap<String, JavaRiceValue> parameterValues;

	// the return value of the function, null if it's a void type
	private JavaRiceValue returnValue;

	// the return type of the function
	private FunctionType returnType = FunctionType.VOID_TYPE;


	public JavaRiceFunction() {
		this.commandSequences = new ArrayList<>();
		this.parameterReferences = new LinkedHashMap<>();
		this.parameterValues = new LinkedHashMap<>();
	}

	public void setParentLocalScope(LocalScope localScope) {
		this.parentLocalScope = localScope;
	}

	public LocalScope getParentLocalScope() {
		return this.parentLocalScope;
	}

	public void setReturnType(FunctionType functionType) {
		this.returnType = functionType;

		// create an empty java rice value as a return value
		switch(this.returnType) {
		case BOOLEAN_TYPE:
			this.returnValue = new JavaRiceValue(true, PrimitiveType.BOOLEAN);
			break;
		case CHAR_TYPE:
			this.returnValue = new JavaRiceValue(' ', PrimitiveType.CHAR);
			break;
		case INT_TYPE:
			this.returnValue = new JavaRiceValue(0, PrimitiveType.INT);
			break;
		case DOUBLE_TYPE:
			this.returnValue = new JavaRiceValue(0, PrimitiveType.DOUBLE);
			break;
		case FLOAT_TYPE:
			this.returnValue = new JavaRiceValue(0, PrimitiveType.FLOAT);
			break;
		case LONG_TYPE:
			this.returnValue = new JavaRiceValue(0, PrimitiveType.LONG);
			break;
		case SHORT_TYPE:
			this.returnValue = new JavaRiceValue(0, PrimitiveType.SHORT);
			break;
		case STRING_TYPE:
			this.returnValue = new JavaRiceValue("", PrimitiveType.STRING);
			break;
		default:
			break;
		}
	}

	public FunctionType getReturnType() {
		return this.returnType;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionName() {
		return this.functionName;
	}

	/*
	 * Maps parameters by values, which means that the value is copied to its parameter listing
	 */
	public void mapParameterByValue(String... values) {
		for(int i = 0; i < values.length; i ++) {
			JavaRiceValue value = this.getParameterAt(i);
			value.setValue(values[i]);
		}
	}

	public void mapParameterByValueAt(String value, int index) {
		if(index >= this.parameterValues.size()) {
			return;
		}

		JavaRiceValue javaRiceValue = this.getParameterAt(index);
		javaRiceValue.setValue(value);
	}

	public void mapArrayAt(JavaRiceValue javaRiceValue, int index, String strIdentifier) {
		if(index >= this.parameterValues.size()) {
			return;
		}

		JavaRiceArray javaRiceArray = (JavaRiceArray) javaRiceValue.getValue();

		JavaRiceArray newArray = new JavaRiceArray(javaRiceArray.getPrimitiveType(), strIdentifier);
		JavaRiceValue newValue = new JavaRiceValue(newArray, PrimitiveType.ARRAY);

		newArray.initializeSize(javaRiceArray.getSize());

		for(int i = 0; i < newArray.getSize(); i ++) {
			newArray.updateValueAt(javaRiceArray.getValueAt(i), i);
		}

		this.parameterValues.put(this.getParameterKeyAt(index), newValue);
	}

	public int getParameterValueSize() {
		return this.parameterValues.size();
	}

	public void verifyParameterByValuesAt(ExpressionContext expressionContext, int index) {
		if(index >= this.parameterValues.size()) {
			return;
		}

		JavaRiceValue javaRiceValue = this.getParameterAt(index);
		TypeErrorChecker checker = new TypeErrorChecker(javaRiceValue, expressionContext);
		checker.verify();
	}

	public void addParameter(String strIdentifier, JavaRiceValue javaRiceValue) {
		this.parameterValues.put(strIdentifier, javaRiceValue);
		// add to console
		System.out.println("CONSOLE [DEBUG]: " + this.functionName + " added an empty parameter "
				+ strIdentifier + " type " + javaRiceValue.getPrimitiveType());
	}

	public boolean hasParameter(String strIdentifier) {
		return this.parameterValues.containsKey(strIdentifier);
	}

	public JavaRiceValue getParameter(String strIdentifier) {
		if(this.hasParameter(strIdentifier)) {
			return this.parameterValues.get(strIdentifier);
		}

		System.err.println(strIdentifier + " not found in parameter list!");
		return null;
	}

	public JavaRiceValue getParameterAt(int index) {
		int i = 0;

		for (JavaRiceValue javaRiceValue : this.parameterValues.values()) {
			if(i == index) {
				return javaRiceValue;
			}

			i++;
		}

		System.err.println(index + " has exceeded parameter list!");
		return null;
	}

	public String getParameterKeyAt(int index) {
		int i = 0;

		for (String key : this.parameterValues.keySet()) {
			if(i == index) {
				return key;
			}

			i++;
		}

		System.err.println(index + " has exceeded parameter list!");
		return null;
	}
	
	public JavaRiceValue getReturnValue() {
		if(this.returnType == FunctionType.VOID_TYPE) {
			// console pls
			System.out.println("CONSOLE [DEBUG]: " + this.functionName + " is a void function."
					+ " Null java rice value is returned.");
			return null;
		}
		
		return this.returnValue;
	}

	@Override
	public ControlTypeEnum getControlType() {
		// TODO Auto-generated method stub
		return ControlTypeEnum.FUNCTION_TYPE;
	}

	@Override
	public void addCommand(ICommand command) {
		// TODO Auto-generated method stub
		this.commandSequences.add(command);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();
		FunctionTracker.getInstance().reportEnterFunction(this);
		
		try {
			for (ICommand command : this.commandSequences) {
				executionMonitor.tryExecution();
				command.execute();
			}
		} catch(InterruptedException e) {
			System.err.println("Monitor blocked interrupted! " + e.getMessage());
		}
		
		FunctionTracker.getInstance().reportExitFunction();
	}

	public static FunctionType identifyFunctionType(String primitiveTypeString) {

		if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_BOOLEAN, primitiveTypeString)) {
			return FunctionType.BOOLEAN_TYPE;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_CHAR, primitiveTypeString)) {
			return FunctionType.CHAR_TYPE;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_DOUBLE, primitiveTypeString)) {
			return FunctionType.DOUBLE_TYPE;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_FLOAT, primitiveTypeString)) {
			return FunctionType.FLOAT_TYPE;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_INT, primitiveTypeString)) {
			return FunctionType.INT_TYPE;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_LONG, primitiveTypeString)) {
			return FunctionType.LONG_TYPE;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_SHORT, primitiveTypeString)) {
			return FunctionType.SHORT_TYPE;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_STRING, primitiveTypeString)) {
			return FunctionType.STRING_TYPE;
		}

		return FunctionType.VOID_TYPE;
	}
}
