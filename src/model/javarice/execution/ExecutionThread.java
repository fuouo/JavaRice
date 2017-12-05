package model.javarice.execution;

import java.util.ArrayList;

import controller.IDEController;
import model.javarice.execution.commands.ICommand;

public class ExecutionThread extends Thread {
	
	private ArrayList<ICommand> executionList = new ArrayList<>();
	private ExecutionMonitor executionMonitor;
	IDEController controller;
	
	public ExecutionThread(ArrayList<ICommand> executionList, ExecutionMonitor executionMonitor, IDEController controller) {
		this.executionList = executionList;
		this.executionMonitor = executionMonitor;
		this.controller = controller;
	}
	
	/*
	 * Runs the thread by executing all actions provided that the execution flag isn't acquired by any other commands.
	 * If a command attempts to acquire the flag, this thread will block 
	 * until its flag is released(presumably by the command 
	 * who acquired it or another command).
	 * (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
			for (ICommand command : this.executionList) {
				try {
					this.executionMonitor.tryExecution();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				command.execute();
			}
			
			//controller.newThread();
	}

}
