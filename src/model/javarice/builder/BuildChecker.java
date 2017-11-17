package model.javarice.builder;

import java.util.BitSet;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import controller.Console;
import controller.Console.LogType;

public class BuildChecker implements ANTLRErrorListener {

private static BuildChecker INSTANCE = null;
	
	private boolean successful = true;
	
	public static BuildChecker getInstance() {
		return INSTANCE;
	}
	
	private BuildChecker() {
		
	}
	
	public static void initialize() {
		INSTANCE = new BuildChecker();
		ErrorRepository.initialize();
	}
	
	public static void reset() {
		INSTANCE.successful  = true;
		ErrorRepository.reset();
	}
	
	public boolean canExecute() {
		return this.successful;
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		// error here
		List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
		Collections.reverse(stack);
		
		String tokens[] = null;
		
		if(msg.contains("extraneous input")) {
			tokens = msg.split("extraneous input | expecting ");
			reportCustomError(ErrorRepository.EXTRANEOUS_INPUT, "", tokens[1], tokens[2], line);
		} else if(msg.contains("mismatched input")) {
			tokens = msg.split("mismatched input | expecting ");
			reportCustomError(ErrorRepository.MISMATCHED_INPUT, "", tokens[1], tokens[2], line);
		} else if(msg.contains("no viable alternative")) {
			tokens = msg.split("no viable alternative at input ");
			reportCustomError(ErrorRepository.NO_VIABLE_ALT, "", tokens[1], line);
		} else if(msg.contains("missing")) {
			tokens = msg.split("missing | at ");
			reportCustomError(ErrorRepository.MISSING_TOKEN, "", tokens[1], tokens[2], line);
		} else if(msg.contains("token recognition error")) {
			tokens = msg.split("token recognition error at: ");
			reportCustomError(ErrorRepository.UNRECOG_TOKEN, "", tokens[1], line);
		} else {
			
		}
		
		this.successful = false;
	}

	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex,
			int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa,
			int startIndex, int stopIndex, BitSet conflictingAlts,
			ATNConfigSet configs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa,
			int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
		// TODO Auto-generated method stub
		
	}
	
	public static void reportCustomError(int errorCode, String additionalMessage) {
		String errorMessage = ErrorRepository.getErrorMessage(errorCode) + " " + additionalMessage;
		Console.log(LogType.ERROR, errorMessage);
		
		INSTANCE.successful = false;
	}
	
	public static void reportCustomError(int errorCode, String additionalMessage, Object... parameters) {
		String errorMessage = String.format(ErrorRepository.getErrorMessage(errorCode) + " " 
				+ additionalMessage, parameters);
		Console.log(LogType.ERROR, errorMessage);
		
		INSTANCE.successful = false;
	}

}
