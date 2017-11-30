package model.javarice.semantics.utils;

import java.util.ArrayList;
import java.util.Stack;

public class LocalVarTracker {
	
	private static LocalVarTracker INSTANCE = null;
	private Stack<ArrayList<String>> sessions;
	
	private LocalVarTracker() {
		sessions = new Stack<>();
	}
	
	public static void initialize() {
		INSTANCE = new LocalVarTracker();
	}
	
	public static void reset() {
		INSTANCE = new LocalVarTracker();
	}
	
	public static LocalVarTracker getInstance() {
		return INSTANCE;
	}
	
//	public void popLocalVar(ICommand command) {
//		
//	}

}
