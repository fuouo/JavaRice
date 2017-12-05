package model.javarice.execution;

import java.util.ArrayList;

import controller.Console;
import controller.Console.LogType;
import model.javarice.builder.BuildChecker;
import model.javarice.builder.ErrorRepository;
import model.javarice.execution.adders.FunctionExecutionAdder;
import model.javarice.execution.adders.IExecutionAdder;
import model.javarice.execution.adders.MainExecutionAdder;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.execeptionhandler.IAttemptCommand;
import model.javarice.execution.commands.execeptionhandler.IAttemptCommand.CatchType;
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
	
	private CatchType currCatchType = null;
	private IAttemptCommand currentTryCommand = null;
	
	private boolean aborted = false;
	
	private int currLineNumber = -1;
	
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
		
		INSTANCE.currCatchType = null;
		INSTANCE.currentTryCommand = null;
		INSTANCE.aborted = false;
	}
	
	public CatchType getCurrCatchType() {
		return currCatchType;
	}
	
	public void setCurrCatchType(CatchType currCatchType) {
		
		if(currCatchType == null) {
			this.currCatchType = null;
			return;
		}
		
		if(this.currentTryCommand != null && this.currentTryCommand.hasCatchFor(currCatchType)) {
			this.currCatchType = currCatchType;
		} else {
			this.aborted = true;
			
			if(currCatchType == CatchType.ARRAY_OUT_OF_BOUNDS) {
				BuildChecker.reportCustomError(ErrorRepository.RUNTIME_ARRAY_OUT_OF_BOUNDS, "", this.currLineNumber);
			} else if(currCatchType == CatchType.NEGATIVE_ARRAY_SIZE) {
				BuildChecker.reportCustomError(ErrorRepository.RUNTIME_NEGATIVE_ARRAY_SIZE, "", this.currLineNumber);
			} else if(currCatchType == CatchType.ARITHMETIC_EXPRESSION) {
				BuildChecker.reportCustomError(ErrorRepository.RUNTIME_ARITHMETIC_EXPRESSION, "", this.currLineNumber);
			} else if(currCatchType == CatchType.NUMBER_FORMAT) {
				BuildChecker.reportCustomError(ErrorRepository.RUNTIME_NUMBER_FORMAT, "", this.currLineNumber);
			}
			

			this.clearAllActions();
		}
		
		
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
	
	public IAttemptCommand getCurrentTryCommand() {
		return currentTryCommand;
	}
	
	public void setCurrentTryCommand(IAttemptCommand currentTryCommand) {
		this.currentTryCommand = currentTryCommand;
	}
	
	public boolean isAborted() {
		return this.aborted;
	}
	
	public void setCurrLineNumber(int currLineNumber) {
		this.currLineNumber = currLineNumber;
	}
}
