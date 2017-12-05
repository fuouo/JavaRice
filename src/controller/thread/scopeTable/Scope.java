package controller.thread.scopeTable;

public class Scope {
	
	int parentStartLine = 0;
	int parentEndLine = 1;
	String identifierName = "";
	
	public Scope(int parentStartLine, int parentEndLine, String identifierName) {
		super();
		this.parentStartLine = parentStartLine;
		this.parentEndLine = parentEndLine;
		this.identifierName = identifierName;
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
	public String getIdentifierName() {
		return identifierName;
	}
	public void setIdentifierName(String identifierName) {
		this.identifierName = identifierName;
	}
	
	
	
	
	
	
	
	
}
