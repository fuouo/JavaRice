package model.javarice.error;

import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class VerboseListener extends MyBaseErrorListener {
	
	public static final VerboseListener INSTANCE = new VerboseListener();
	
	
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
		Collections.reverse(stack);		
		String error_msg = "Syntax Error at line " + line + ": ";
		ErrorType errorType = null;
		
		if(msg.contains("extraneous input")) {
			errorType = ErrorType.EXTRANEOUS;
		} else if(msg.contains("mismatched input")) {
			errorType = ErrorType.MISMATCHED;
		} else if(msg.contains("no viable alternative")) {
			errorType = ErrorType.NO_VIABLE_ALT;
		} else if(msg.contains("missing")) {
			errorType = ErrorType.MISSING;
		} else if(msg.contains("token recognition error")) {
			errorType = ErrorType.UNRECOG_TOKEN;
		} 
		
		error_msg = error_msg + generateErrorMessage(msg, errorType);
		
		this.errors.add(error_msg);
	}
	
	private String generateErrorMessage(String msg, ErrorType errorType) {
		
		String[] tokens;
		
		String error = "";
		
		switch(errorType) {
		
		case EXTRANEOUS: 
			
			tokens = msg.split("extraneous input | expecting ");
			error = "There's an extra " + tokens[1] + " found; we're expecting " + tokens[2] + ".";
			
			break;
		case MISSING: 
			
			tokens = msg.split("missing | at ");
			error = "Did you forget " + tokens[1] + " before " + tokens[2] + "?";
			
			break;
		case MISMATCHED: 
			
			tokens = msg.split("mismatched input | expecting ");
			error = "There's an input mismatch for " + tokens[1] + "; we're expecting " + tokens[2] + ".";
			
			break;
		case NO_VIABLE_ALT: 
			
			tokens = msg.split("no viable alternative at input ");
			error = "Sorry, we can't decide which path to take based on your input " + tokens[1] + ".";
			
			break;
		case UNRECOG_TOKEN: 
			
			tokens = msg.split("token recognition error at: ");
			error = "Oh no! We don't recognize this token " + tokens[1];
			
			break;
		}
		
		return error;
	}
}
