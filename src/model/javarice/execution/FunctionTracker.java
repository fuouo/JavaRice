package model.javarice.execution;

import java.util.Stack;

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
	
	public void initialize() {
		INSTANCE = new FunctionTracker();
	}
	
	public void reset() { }
	
	public void reportEnterFunction(JavaRiceFunction javaRiceFunction) {
		this.callStack.push(javaRiceFunction);
	}
	
	public void reportExitFunction() {
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
