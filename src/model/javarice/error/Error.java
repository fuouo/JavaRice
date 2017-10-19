package model.javarice.error;

public class Error {
	
	private ErrorType errorType;
	private SubErrorType subErrorType;
	private String message;
	private int line;
	
	public Error() {}
	
	public ErrorType getErrorType() {
		return errorType;
	}
	
	public void setErrorType(ErrorType errorType) {
		this.errorType = errorType;
	}
	
	public SubErrorType getSubErrorType() {
		return subErrorType;
	}

	public void setSubErrorType(SubErrorType subErrorType) {
		this.subErrorType = subErrorType;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public int getLine() {
		return line;
	}
	
	public void setLine(int line) {
		this.line = line;
	}
	
	

}
