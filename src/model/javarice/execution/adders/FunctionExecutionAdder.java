package model.javarice.execution.adders;

import model.javarice.execution.commands.ICommand;
import model.javarice.semantics.representations.JavaRiceFunction;

public class FunctionExecutionAdder implements IExecutionAdder {
	
	private JavaRiceFunction assignedJavaRiceFunction;
	
	public FunctionExecutionAdder(JavaRiceFunction assignedJavaRiceFunction) {
		this.assignedJavaRiceFunction = assignedJavaRiceFunction;
	}

	@Override
	public void addCommand(ICommand command) {
		// TODO Auto-generated method stub
		this.assignedJavaRiceFunction.addCommand(command);
	}
	
	public JavaRiceFunction getAssignedFunction() {
		return this.assignedJavaRiceFunction;
	}

}
