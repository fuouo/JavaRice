package model.javarice.error;

import java.util.ArrayList;

import org.antlr.v4.runtime.BaseErrorListener;

public abstract class MyBaseErrorListener extends BaseErrorListener {
	
	protected ArrayList<String> errors = new ArrayList<>();
	
	public ArrayList<String> getErrors() {
		return errors;
	}

}
