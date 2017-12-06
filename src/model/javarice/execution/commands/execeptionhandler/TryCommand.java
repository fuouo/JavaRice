package model.javarice.execution.commands.execeptionhandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.javarice.execution.ExecutionManager;
import model.javarice.execution.ExecutionMonitor;
import model.javarice.execution.commands.ICommand;
import model.javarice.semantics.statements.StatementControlOverseer;

public class TryCommand implements IAttemptCommand {
	
	private List<ICommand> tryCommands;
	private HashMap<CatchType, List<ICommand>> catchCommands;
	
	public TryCommand() {
		this.tryCommands = new ArrayList<>();
		this.catchCommands = new HashMap<>();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();
		ExecutionManager.getInstance().setCurrentTryCommand(this);
		
		try {
			for (ICommand command : tryCommands) {
				executionMonitor.tryExecution();
				command.execute();
				
				if(ExecutionManager.getInstance().getCurrCatchType() != null ||
						ExecutionManager.getInstance().isAborted()) {
					break;
				}
			}
			
			if(ExecutionManager.getInstance().getCurrCatchType() != null) {
				
				List<ICommand> currCatchCommands = this.catchCommands.get(
						ExecutionManager.getInstance().getCurrCatchType());
				
				if(currCatchCommands != null) {
					ExecutionManager.getInstance().setCurrCatchType(null);
					ExecutionManager.getInstance().setCurrentTryCommand(null);
					
					for (ICommand command : currCatchCommands) {
						executionMonitor.tryExecution();
						command.execute();
					}
				}
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addTryCommand(ICommand command) {
		// TODO Auto-generated method stub
		this.tryCommands.add(command);
		
	}

	@Override
	public void addCatchCommand(CatchType catchType, ICommand command) {
		// TODO Auto-generated method stub
		List<ICommand> commandList;
		
		if(this.catchCommands.containsKey(catchType)) {
			commandList = this.catchCommands.get(catchType);
		} else {
			commandList = new ArrayList<>();
		}
		
		commandList.add(command);
		
		catchCommands.put(catchType, commandList);
	}

	@Override
	public boolean hasCatchFor(CatchType catchType) {
		// TODO Auto-generated method stub
		return catchCommands.containsKey(catchType);
	}

}
