package model.javarice.semantics.symboltable.scopes;

import model.javarice.semantics.representations.JavaRiceValue;

public interface IScope {
	
	public abstract JavaRiceValue searchVariableIncludingLocal(String identifier);
	public abstract boolean isParent();	

}
