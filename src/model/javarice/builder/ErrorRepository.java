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
	public final static int RUNTIME_ARRAY_OUT_OF_BOUNDS = 2900;
	
	private static ErrorRepository INSTANCE = null;
	
	private HashMap<Integer, String> errorMessageDictionary;
	
	private ErrorRepository() {
		this.errorMessageDictionary = new HashMap<>();
		this.populateErrorMessages();
	}
	
	private void populateErrorMessages() {
		// syntax errors
		this.errorMessageDictionary.put(EXTRANEOUS_INPUT, 
				"%d[LINE] [SYNTAX] There's an extra %s found; we're expecting %s.");
		this.errorMessageDictionary.put(MISSING_TOKEN, 
				"%d[LINE] [SYNTAX] Did you forget %s before %s?");
		this.errorMessageDictionary.put(MISMATCHED_INPUT, 
				"%d[LINE] [SYNTAX] There's an input mismatch for %s; we're expecting %s.");
		this.errorMessageDictionary.put(NO_VIABLE_ALT, 
				"%d[LINE] [SYNTAX] Sorry, we can't decide which path to take based on your input %s.");
		this.errorMessageDictionary.put(UNRECOG_TOKEN, 
				"%d[LINE] [SYNTAX] Oh no! We don't recognize this token %s! [SYNTAX]");
		this.errorMessageDictionary.put(CUSTOM, "%d[LINE] [SYNTAX] %s");
		
		// semantic errors
		this.errorMessageDictionary.put(ErrorRepository.INCONSISTENT_CLASS_NAME, "Inconsistent class name. ");
		this.errorMessageDictionary.put(TYPE_MISMATCH, "%d[LINE] Data type mismatch detected! ");
		this.errorMessageDictionary.put(UNDECLARED_VARIABLE, "%d[LINE] Variable %s is not declared yet. ");
		this.errorMessageDictionary.put(UNDECLARED_FUNCTION, "%d[LINE] Function %s is not declared yet. ");
		this.errorMessageDictionary.put(CONST_REASSIGNMENT, 
				"%d[LINE] Oops! You can't reassign a new value to constant %s! ");
		this.errorMessageDictionary.put(MULTIPLE_VARIABLE, 
				"%d[LINE] There's a duplicate declaration of variable %s. ");
		this.errorMessageDictionary.put(MULTIPLE_FUNCTION, 
				"%d[LINE] There's a duplicate method declaration %s. ");
		this.errorMessageDictionary.put(PARAMETER_COUNT_MISMATCH, 
				"%d[LINE] Number of parameters for method %s does not match with its declaration. ");
		this.errorMessageDictionary.put(RUNTIME_ARRAY_OUT_OF_BOUNDS, "Array %s out of bounds. Aborting operation. ");
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
