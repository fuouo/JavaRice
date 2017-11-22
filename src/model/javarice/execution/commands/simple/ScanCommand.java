package model.javarice.execution.commands.simple;

import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.ICommand;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.representations.JavaRiceValueSearcher;
import view.ScanDialog;

public class ScanCommand implements ICommand {
	
	private String identifierString;
	
	public ScanCommand(String identifierString) {
		this.identifierString = identifierString;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		// halt execution until we get input from user
		ExecutionManager.getInstance().blockExecution();
		
		// open dialog box here
		new ScanDialog(this).setVisible(true);
	}
	
	/*
	 * called when dialog box is dismissed
	 */
	public void acquireInputFromUser(String input) {		
		// create java rice value
		JavaRiceValue javaRiceValue = JavaRiceValueSearcher.searchJavaRiceValue(this.identifierString);
		javaRiceValue.setValue(input);
		
		// resume execution
		ExecutionManager.getInstance().resumeExecution();
	}

}
