package model.javarice.semantics.statements;

import java.util.Stack;

import controller.Console;
import controller.Console.LogType;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.controlled.IConditionalCommand;
import model.javarice.execution.commands.controlled.IControlledCommand;
import model.javarice.execution.commands.controlled.IControlledCommand.ControlTypeEnum;

public class StatementControlOverseer {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	private static StatementControlOverseer INSTANCE = null;
	
	public static StatementControlOverseer getInstance() {
		return INSTANCE;
	}
	
	private Stack<ICommand> procedureCallStack;
	private ICommand activeControlledCommand = null;
	
	//used for conditional statements to indicate if the series of commands should go to the positive command list.
	private boolean isInPositive = true; 
	
	private StatementControlOverseer() {
		this.procedureCallStack = new Stack<ICommand>();
		
		System.out.println("Stack initialized!");
	}

	public static void initialize() {
		INSTANCE = new StatementControlOverseer();
	}
	
	public static void reset() {
		INSTANCE.procedureCallStack.clear();
		INSTANCE.activeControlledCommand = null;
	}
	
	public void openConditionalCommand(IConditionalCommand command) {
		if(this.procedureCallStack.isEmpty()) {
			this.procedureCallStack.push(command);
			this.activeControlledCommand = command;
		}
		else {
			this.processAdditionOfCommand(command);
		}
		
		this.isInPositive = true;
		
	}
	
	/*
	 * Opens a new controlled command
	 */
	public void openControlledCommand(IControlledCommand command) {
		this.procedureCallStack.push(command);
		this.activeControlledCommand = command;
	}
	
	public boolean isInPositiveRule() {
		return this.isInPositive;
	}
	
	public void reportExitPositiveRule() {
		this.isInPositive = false;
	}
	
	/*
	 * Processes the proper addition of commands.
	 */
	private void processAdditionOfCommand(ICommand command) {
		
		//if the current active controlled command is that of a conditional command,
		//we either add the newly opened command as either positive or a negative command
		if(this.isInConditionalCommand()) {
			IConditionalCommand conditionalCommand = (IConditionalCommand) this.activeControlledCommand;
			
			if(this.isInPositiveRule()) {
				conditionalCommand.addPositiveCommand(command);
			}
			else {
				conditionalCommand.addNegativeCommand(command);
			}
			
			this.procedureCallStack.push(command);
			this.activeControlledCommand = command;
		}
		//just add the newly opened command as a command under the last active controlled command.
		else {
			
			IControlledCommand controlledCommand = (IControlledCommand) this.activeControlledCommand;
			controlledCommand.addCommand(command);
			
			Console.log(LogType.DEBUG, TAG + "Adding to " +controlledCommand.getControlType());
			
			this.procedureCallStack.push(command);
			this.activeControlledCommand = command;
		}
	}
	
	/*
	 * Closes the current active controlled command and adds the root controlled command to the execution manager.
	 * The active controlled command is set to null.
	 */
	public void compileControlledCommand() {
		
		//we arrived at the root node, therefore we add this now to the execution manager
		if(this.procedureCallStack.size() == 1) {
			ICommand rootCommand = this.procedureCallStack.pop();
			ExecutionManager.getInstance().addCommand(rootCommand);
			
			this.activeControlledCommand = null;
		}
		//we pop then add it to the next root node
		else if(this.procedureCallStack.size() > 1) {
			ICommand childCommand = this.procedureCallStack.pop();
			ICommand parentCommand = this.procedureCallStack.peek();
			this.activeControlledCommand = parentCommand;
			
			// TODO: check this shit
			if(parentCommand instanceof IControlledCommand) {
				IControlledCommand controlledCommand = (IControlledCommand) parentCommand;
				controlledCommand.addCommand(childCommand);

			}
			
//			if(parentCommand instanceof IControlledCommand) {
//				if(((IControlledCommand) childCommand).getControlType() == ControlTypeEnum.CONDITIONAL_IF && 
//						(((IControlledCommand) parentCommand).getControlType() == ControlTypeEnum.WHILE_CONTROL ||
//						((IControlledCommand) parentCommand).getControlType() == ControlTypeEnum.DO_WHILE_CONTROL)) {
//						return;
//					}
//				}
//				
//				IControlledCommand controlledCommand = (IControlledCommand) parentCommand;
//				controlledCommand.addCommand(childCommand);
//			}
		}
		else {
			System.out.println("Procedure call stack is now empty.");
		}
	}
	
	public boolean isInConditionalCommand() {
		return (this.activeControlledCommand != null && activeControlledCommand instanceof IConditionalCommand);
	}
	
	public boolean isInControlledCommand() {
		return (this.activeControlledCommand!= null && this.activeControlledCommand instanceof IControlledCommand);
	}
	
	public ICommand getActiveControlledCommand() {
		return this.activeControlledCommand;
	}
}
