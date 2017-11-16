package model.javarice.semantics.searching;

import model.javarice.execution.FunctionTracker;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.symboltable.scopes.LocalScopeCreator;

public class VariableSearcher {
	
	public static JavaRiceValue searchVariable(String strIdentifier) {
		JavaRiceValue javaRiceValue = null;
		
		if(FunctionTracker.getInstance().isInsideFunction()) {
			javaRiceValue = 
					searchVariableInFunction(FunctionTracker.getInstance().getLatestFunction(), strIdentifier);
		}
		
		if(javaRiceValue == null) {
			// parser handler shit here
			ClassScope classScope = null;
			javaRiceValue = searchVariableInClassIncludingLocal(classScope, strIdentifier);
		}
		
		return javaRiceValue;
	}
	
	public static JavaRiceValue searchVariableInFunction(JavaRiceFunction javaRiceFunction, String strIdentifier) {
		JavaRiceValue javaRiceValue = null;
		
		if(javaRiceFunction.hasParameter(strIdentifier)) {
			javaRiceValue = javaRiceFunction.getParameter(strIdentifier);
		} else {
			javaRiceValue = LocalScopeCreator.searchVariableInLocalIterative(strIdentifier, 
					javaRiceFunction.getParentLocalScope());
		}
		
		return javaRiceValue;
	}
	
	public static JavaRiceValue searchVariableInClassIncludingLocal(ClassScope classScope, String strIdentifier) {
		return classScope.searchVariableIncludingLocal(strIdentifier);
	}
	
	public static JavaRiceValue searchVariableInClass(ClassScope classScope, String strIdentifier) {
		return classScope.searchVariable(strIdentifier);
	}

}
