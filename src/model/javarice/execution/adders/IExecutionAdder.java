package model.javarice.execution.adders;

import model.javarice.execution.commands.ICommand;

public interface IExecutionAdder {
	
	public abstract void addCommand(ICommand command);

}
