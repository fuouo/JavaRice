package model.javarice.semantics.utils;

import java.util.ArrayList;
import java.util.Stack;

import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.controlled.DoWhileCommand;
import model.javarice.execution.commands.controlled.ForCommand;
import model.javarice.execution.commands.controlled.IfCommand;
import model.javarice.execution.commands.controlled.WhileCommand;
import model.javarice.execution.commands.evaluation.AssignmentCommand;
import model.javarice.execution.commands.evaluation.MappingCommand;

public class LocalVarTracker {
	
	private static LocalVarTracker INSTANCE = null;
	private Stack<ArrayList<String>> sessions;
	
	private LocalVarTracker() {
		sessions = new Stack<>();
	}
	
	public static void initialize() {
		INSTANCE = new LocalVarTracker();
	}
	
	public static void reset() {
		INSTANCE = new LocalVarTracker();
	}
	
	public static LocalVarTracker getInstance() {
		return INSTANCE;
	}
	
	public void popLocalVar(ICommand command) {
		if(!sessions.isEmpty()) {
			
			if(command instanceof MappingCommand) {
				sessions.peek().add(((MappingCommand) command).getIdentifierString());
			} else if(command instanceof AssignmentCommand) {
				if(!((AssignmentCommand) command).isLeftHandArrayAccessor()) {
					sessions.peek().add(((AssignmentCommand) command).getLeftHandExpression().getText());
				}
			} else if(command instanceof AssignmentCommand) {
				sessions.peek().addAll(((ForCommand) command).getLocalVars());
				resetLocalVars(((ForCommand) command).getLocalVars());
			} else if(command instanceof WhileCommand) {
				
				if(command instanceof DoWhileCommand) {
					sessions.peek().addAll(((DoWhileCommand) command).getLocalVars());
				} else {
					sessions.peek().addAll(((WhileCommand) command).getLocalVars());
				}
				
				resetLocalVars(((WhileCommand) command).getLocalVars());
			} else if(command instanceof IfCommand) {
				sessions.peek().addAll(((IfCommand) command).getLocalVars());
				resetLocalVars(((IfCommand) command).getLocalVars());
			}
		}
	}
	
	public static void resetLocalVars(ArrayList<String> localVars) {
		localVars.clear();
	}
	
	public void startNewSession() {
		sessions.push(new ArrayList<>());
	}
	
	public ArrayList<String> getCurrentSession() {
		return sessions.peek();
	}
	
	public ArrayList<String> endCurrentSession() {
		return sessions.pop();
	}

}
