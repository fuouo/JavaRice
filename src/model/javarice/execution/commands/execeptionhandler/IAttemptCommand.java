package model.javarice.execution.commands.execeptionhandler;

import model.javarice.execution.commands.ICommand;

public interface IAttemptCommand extends ICommand{
	
	public enum CatchType {
		ARRAY_OUT_OF_BOUNDS,
		ARITHMETIC_EXPRESSION,
		INPUT_MISMATCH,
		NEGATIVE_ARRAY_SIZE,
		NULL_POINTER,
		NUMBER_FORMAT;
	}
	
	public abstract void addTryCommand(ICommand command);
	public abstract void addCatchCommand(CatchType catchType, ICommand command);
	public abstract boolean hasCatchFor(CatchType catchType);
	

}
