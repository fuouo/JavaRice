package model.javarice.execution.commands.controlled;

import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.controlled.IControlledCommand.ControlTypeEnum;

public interface IConditionalCommand extends ICommand {
	
	public abstract ControlTypeEnum getControlType();
	public abstract void addPositiveCommand(ICommand command);
	public abstract void addNegativeCommand(ICommand command);

}
