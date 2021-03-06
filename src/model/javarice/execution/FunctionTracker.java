package model.javarice.execution;

import java.util.Stack;

import controller.Console;
import controller.Console.LogType;
import model.javarice.semantics.representations.JavaRiceFunction;

public class FunctionTracker {
	
	private static FunctionTracker INSTANCE = null;
	
	private Stack<JavaRiceFunction> callStack;
	
	public static FunctionTracker getInstance() {
		return INSTANCE;
	}
	
	private FunctionTracker() {
		this.callStack = new Stack<>();
	}
	
	public static void initialize() {
		INSTANCE = new FunctionTracker();
	}
	
	public static void reset() { }
	
	public void reportEnterFunction(JavaRiceFunction javaRiceFunction) {
		Console.log(LogType.DEBUG, "FunctionTracker entering " + javaRiceFunction.getFunctionName());
		this.callStack.push(javaRiceFunction);
	}
	
	public void reportExitFunction() {
		Console.log(LogType.DEBUG, "FunctionTracker exiting function");
		this.callStack.pop();
	}
	
	public JavaRiceFunction getLatestFunction() {
		return this.callStack.peek();
	}
	
	/*
	 * Returns true if the control flow is currently inside a function
	 */
	public boolean isInsideFunction() {
		return (this.callStack.size() != 0);
	}

}
