package model.javarice.builder;

import java.util.HashMap;

public class ErrorRepository {
	
	// syntax errors
	public final static int EXTRANEOUS_INPUT = 1100;
	public final static int MISSING_TOKEN = 1200;
	public final static int MISMATCHED_INPUT = 1300;
	public final static int NO_VIABLE_ALT = 1400;
	public final static int UNRECOG_TOKEN = 1500;
	public final static int CUSTOM = 1600;
	
	// semantic errors
	public final static int INCONSISTENT_CLASS_NAME = 2100;
	public final static int TYPE_MISMATCH = 2200;
	public final static int UNDECLARED_VARIABLE = 2300;
	public final static int UNDECLARED_FUNCTION = 2400;
	public final static int CONST_REASSIGNMENT = 2500;
	public final static int MULTIPLE_VARIABLE = 2600;
	public final static int MULTIPLE_FUNCTION = 2700;
	public final static int PARAMETER_COUNT_MISMATCH = 2800;
	public final static int MISSING_RETURN = 2900;
	
	// runtime errors
	public final static int RUNTIME_ARRAY_OUT_OF_BOUNDS = 3100;
	public final static int RUNTIME_NUMBER_FORMAT = 3200;
	public final static int RUNTIME_NEGATIVE_ARRAY_SIZE = 3300;
	
	private static ErrorRepository INSTANCE = null;
	
	private HashMap<Integer, String> errorMessageDictionary;
	
	private ErrorRepository() {
		this.errorMessageDictionary = new HashMap<>();
		this.populateErrorMessages();
	}
	
	private void populateErrorMessages() {
		// syntax errors
		this.errorMessageDictionary.put(EXTRANEOUS_INPUT, 
				"SYNTAX[TYPE]%d[LINE]There's an extra %s found; we're expecting %s.");
		this.errorMessageDictionary.put(MISSING_TOKEN, 
				"SYNTAX[TYPE]%d[LINE]Did you forget %s before %s?");
		this.errorMessageDictionary.put(MISMATCHED_INPUT, 
				"SYNTAX[TYPE]%d[LINE]There's an input mismatch for %s; we're expecting %s.");
		this.errorMessageDictionary.put(NO_VIABLE_ALT, 
				"SYNTAX[TYPE]%d[LINE]Sorry, we can't decide which path to take based on your input %s.");
		this.errorMessageDictionary.put(UNRECOG_TOKEN, 
				"SYNTAX[TYPE]%d[LINE]Oh no! We don't recognize this token %s!");
		this.errorMessageDictionary.put(CUSTOM, 
				"SYNTAX[TYPE]%d[LINE]%s");
		
		// semantic errors
		this.errorMessageDictionary.put(ErrorRepository.INCONSISTENT_CLASS_NAME,
				"SEMANTIC[TYPE]Inconsistent class name. ");
		this.errorMessageDictionary.put(TYPE_MISMATCH, 
				"SEMANTIC[TYPE]%d[LINE]Data type mismatch detected! ");
		this.errorMessageDictionary.put(UNDECLARED_VARIABLE, 
				"SEMANTIC[TYPE]%d[LINE]Variable %s is not declared yet. ");
		this.errorMessageDictionary.put(UNDECLARED_FUNCTION, 
				"SEMANTIC[TYPE]%d[LINE]Function %s is not declared yet. ");
		this.errorMessageDictionary.put(CONST_REASSIGNMENT, 
				"SEMANTIC[TYPE]%d[LINE]Oops! You can't reassign a new value to constant %s! ");
		this.errorMessageDictionary.put(MULTIPLE_VARIABLE, 
				"SEMANTIC[TYPE]%d[LINE]There's a duplicate declaration of variable %s. ");
		this.errorMessageDictionary.put(MULTIPLE_FUNCTION, 
				"SEMANTIC[TYPE]%d[LINE]There's a duplicate method declaration %s. ");
		this.errorMessageDictionary.put(PARAMETER_COUNT_MISMATCH, 
				"SEMANTIC[TYPE]%d[LINE]Number of parameters for method %s does not match with its declaration. ");
		this.errorMessageDictionary.put(MISSING_RETURN, 
				"SEMANTIC[TYPE]%d[LINE]This method must return a result of type %s. ");
		
		// runtime errors
		this.errorMessageDictionary.put(RUNTIME_ARRAY_OUT_OF_BOUNDS, 
				"RUNTIME[TYPE]%d[LINE]Array %s out of bounds. Aborting operation. ");
		this.errorMessageDictionary.put(RUNTIME_NUMBER_FORMAT, 
				"RUNTIME[TYPE]%d[LINE]Number format exception for input: %s. Aborting operation. ");
		this.errorMessageDictionary.put(RUNTIME_NEGATIVE_ARRAY_SIZE, 
				"RUNTIME[TYPE]%d[LINE]Array %s can't be initialized with a negative value. Aborting operation. ");
	}
	
	public static void initialize() {
		INSTANCE = new ErrorRepository();
	}
	
	public static void reset() {
		INSTANCE.errorMessageDictionary.clear();
		INSTANCE.populateErrorMessages();
	}
	
	public static String getErrorMessage(int errorCode) {
		return INSTANCE.errorMessageDictionary.getOrDefault(errorCode, "Error code "+errorCode+ " not found.");
	} 

}
