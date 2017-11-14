package model.javarice.execution.commands.controlled;

import model.javarice.execution.commands.ICommand;

public interface IControlledCommand extends ICommand {
	
	public enum ControlTypeEnum {
		CONDITIONAL_IF,
		DO_WHILE_CONTROL,
		WHILE_CONTROL,
		FOR_CONTROL,
		FUNCTION_TYPE
	}
	
	public abstract ControlTypeEnum getControlType();
	public abstract void addCommand(ICommand command);

}
