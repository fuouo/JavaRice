package model.javarice.execution.adders;

import java.util.ArrayList;

import model.javarice.execution.commands.ICommand;

public class MainExecutionAdder implements IExecutionAdder {
	
	private ArrayList<ICommand> mainExecutionList;
	
	public MainExecutionAdder(ArrayList<ICommand> mainExecutionList) {
		this.mainExecutionList = mainExecutionList;
	}

	@Override
	public void addCommand(ICommand command) {
		this.mainExecutionList.add(command);
	}

}
