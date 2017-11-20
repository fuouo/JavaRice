package model.javarice.execution;

import java.util.ArrayList;

import controller.Console;
import controller.Console.LogType;
import model.javarice.execution.adders.FunctionExecutionAdder;
import model.javarice.execution.adders.IExecutionAdder;
import model.javarice.execution.adders.MainExecutionAdder;
import model.javarice.execution.commands.ICommand;
import model.javarice.semantics.representations.JavaRiceFunction;

public class ExecutionManager {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";

	private static ExecutionManager INSTANCE = null;
	
	private ArrayList<ICommand> executionList = new ArrayList<>();
	private boolean foundEntryPoint = false;
	private String entryClassName = null;
	
	private ExecutionThread executionThread;
	private ExecutionMonitor executionMonitor;
	
	private IExecutionAdder activeExecutionAdder;
	private MainExecutionAdder mainExecutionAdder;
	
	private ExecutionManager() {
		this.mainExecutionAdder = new MainExecutionAdder(this.executionList);
		this.activeExecutionAdder = this.mainExecutionAdder;
	}
	
	public static ExecutionManager getInstance() {
		return INSTANCE;
	}
	
	public static void initialize() {
		INSTANCE = new ExecutionManager();
	}
	
	public static void reset() {
		INSTANCE.foundEntryPoint = false;
		INSTANCE.entryClassName = null;
		INSTANCE.clearAllActions();
	}
	
	/*
	 * Reported by the parser walker if void main() has been found 
	 * which means that an entry point for execution has been found.
	 * Required the class name in which main() has been found
	 */
	
	public void reportFoundEntryPoint(String entryClassName) {
		this.entryClassName = entryClassName;
		this.foundEntryPoint = true;
	}
	
	public boolean hasFoundEntryPoint() {
		return this.foundEntryPoint;
	}
	
	public String getEntryClassName() {
		return this.entryClassName;
	}
	
	public void addCommand(ICommand command) {
		this.activeExecutionAdder.addCommand(command);
	}
	
	public void deleteCommand(ICommand command) {
		this.executionList.remove(command);
	}
	
	/*
	 * Opens a function. Any succeeding commands to be added will be put to the function control flow.
	 */
	public void openFunctionExecution(JavaRiceFunction javaRiceFunction) {
		FunctionExecutionAdder functionExecutionAdder = new FunctionExecutionAdder(javaRiceFunction);
		this.activeExecutionAdder = functionExecutionAdder;
	}
	
	/*
	 * Returns true if the execution manager currently points to a function control flow.
	 */
	public boolean isInMainExecution() {
		return this.activeExecutionAdder instanceof MainExecutionAdder;
	}
	
	/*
	 * Returns true if the execution manager currently points to a function control flow.
	 */
	public boolean isInFunctionExecution() {
		return this.activeExecutionAdder instanceof FunctionExecutionAdder;
	}
	
	/*
	 * Returns the current function that the execution manager is populating.
	 */
	public JavaRiceFunction getCurrentFunction() {
		if(this.isInFunctionExecution()) {
			FunctionExecutionAdder functionExecutionAdder = (FunctionExecutionAdder) this.activeExecutionAdder;
			
			return functionExecutionAdder.getAssignedFunction();
		} else if(this.isInMainExecution()) {
			Console.log(LogType.DEBUG, TAG + "current execution is in main");
		}
		
		System.out.println("Execution Manager is not in a function!");
		return null;
	}
	
	/*
	 * Closes a function. Control flow will be given back to the main execution adder.
	 */
	public void closeFunctionExecution() {
		this.activeExecutionAdder = this.mainExecutionAdder;
	}
	
	/*
	 * Blocks the execution of the thread. Can only be called once. 
	 * At this point, resumeExecution() must be called by a specific command.
	 */
	public void blockExecution() {
		this.executionMonitor.claimExecutionFlag();
	}
	
	/*
	 * Resumes the execution of thread. Can only be called once. 
	 * At this point, the execution thread should continue to do other actions.
	 */
	public void resumeExecution() {
		this.executionMonitor.releaseExecutionFlag();
	}
	
	/*
	 * Spawns a worker thread to handle execution of actions. 
	 * A semaphore flag is included that may attempt to be claimed by specific commands (like SCAN statement).
	 * This causes the execution thread to temporarily halt until released.
	 */
	public void executeAllActions() {
		this.executionMonitor = new ExecutionMonitor();
		this.executionThread = new ExecutionThread(this.executionList, this.executionMonitor);
		this.executionThread.start();
	}
	
	public void clearAllActions() {
		this.executionList.clear();
	}
	
	/*
	 * Gets the execution monitor. This is used for controlled commands that also needs to check prior to execution.
	 */
	public ExecutionMonitor getExecutionMonitor() {
		return this.executionMonitor;
	}
	
}
