package model.javarice.execution;

import java.util.ArrayList;

import model.javarice.execution.commands.ICommand;

public class ExecutionThread extends Thread {
	
	private ArrayList<ICommand> executionList = new ArrayList<>();
	private ExecutionMonitor executionMonitor;
	
	public ExecutionThread(ArrayList<ICommand> executionList, ExecutionMonitor executionMonitor) {
		this.executionList = executionList;
		this.executionMonitor = executionMonitor;
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
		try {
			for (ICommand command : this.executionList) {
				this.executionMonitor.tryExecution();
				command.execute();
			}
		} catch (InterruptedException e) {
			System.err.println("Monitor block interrupted! " + e.getMessage());
		}
	}

}
