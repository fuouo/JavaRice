package model.javarice.execution.commands.simple;

import model.javarice.execution.commands.ICommand;

public class ScanCommand implements ICommand {
	
	private String typeString;
	private String identifierString;
	
	public ScanCommand(String typeString, String identifierString) {
		this.typeString = typeString;
		this.identifierString = identifierString;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
	}

}
