package model.javarice.error;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class VerboseListener extends BaseErrorListener {
	
	public static final VerboseListener INSTANCE = new VerboseListener();
	
	private ArrayList<Error> errors = new ArrayList<>();
	private Error error;
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
		Collections.reverse(stack);		
		SubErrorType subErrorType = null;
		
		if(msg.contains("extraneous input")) {
			subErrorType = SubErrorType.EXTRANEOUS;
		} else if(msg.contains("mismatched input")) {
			subErrorType = SubErrorType.MISMATCHED;
		} else if(msg.contains("no viable alternative")) {
			subErrorType = SubErrorType.NO_VIABLE_ALT;
		} else if(msg.contains("missing")) {
			subErrorType = SubErrorType.MISSING;
		} else if(msg.contains("token recognition error")) {
			subErrorType = SubErrorType.UNRECOG_TOKEN;
		} else {
			subErrorType = SubErrorType.CUSTOM;
		}
		
		String message = generateErrorMessage(msg, subErrorType);
		
		error = new Error();
		error.setErrorType(ErrorType.SYNTAX);
		error.setSubErrorType(subErrorType);
		error.setLine(line);
		error.setMessage(message);
		
		this.errors.add(error);
	}
	
	private String generateErrorMessage(String msg, SubErrorType subErrorType) {
		
		String[] tokens;
		
		String error = "";
		
		switch(subErrorType) {
		
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
			error = "Sorry, we can't decide w hich path to take based on your input " + tokens[1] + ".";			
			break;
		case UNRECOG_TOKEN: 			
			tokens = msg.split("token recognition error at: ");
			error = "Oh no! We don't recognize this token " + tokens[1];
			break;
		default:
			error = msg;
		}
		
		return error;
	}
	
	public ArrayList<Error> getErrors() {
		return errors;
	}
}
