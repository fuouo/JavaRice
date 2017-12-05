package controller.thread.scopeTable;

import java.util.ArrayList;

public class Scope {
	
	int parentStartLine = 0;
	int parentEndLine = 1;
	ArrayList<String> identifierNames;
	
	public Scope(int parentStartLine, int parentEndLine) {
		super();
		this.parentStartLine = parentStartLine;
		this.parentEndLine = parentEndLine;
		this.identifierNames = new ArrayList<String>();
	}
	
	
	public int getParentStartLine() {
		return parentStartLine;
	}
	public void setParentStartLine(int parentStartLine) {
		this.parentStartLine = parentStartLine;
	}
	public int getParentEndLine() {
		return parentEndLine;
	}
	public void setParentEndLine(int parentEndLine) {
		this.parentEndLine = parentEndLine;
	}
	public ArrayList<String> getIdentifierNames() {
		return identifierNames;
	}
	public void setIdentifierName(ArrayList<String> identifierNames) {
		this.identifierNames = identifierNames;
	}
	
	public void addIdentifier(String identifier) {
		this.identifierNames.add(identifier);
	}
	
	public void printIdentifiers() {
		
		for (int i = 0; i < identifierNames.size(); i++) {
			System.out.println(identifierNames.get(i));
		}
		
	}
	
	
	
	
	
	
}
