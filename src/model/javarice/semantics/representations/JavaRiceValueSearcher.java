package model.javarice.semantics.representations;

import model.javarice.execution.FunctionTracker;
import model.javarice.semantics.symboltable.scopes.LocalScopeCreator;

public class JavaRiceValueSearcher {
	
	public static JavaRiceValue searchJavaRiceValue(String strIdentifier) {
		JavaRiceValue javaRiceValue = null;
		
		if(FunctionTracker.getInstance().isInsideFunction()) {
			JavaRiceFunction javaRiceFunction = FunctionTracker.getInstance().getLatestFunction();
			
			if(javaRiceFunction.hasParameter(strIdentifier)) {
				javaRiceValue = javaRiceFunction.getParameter(strIdentifier);
			} else {
				javaRiceValue = LocalScopeCreator.searchVariableInLocalIterative(
						strIdentifier, javaRiceFunction.getParentLocalScope());
			}
		}
		
		if(javaRiceValue == null) {
			// do something here
		}
		
		return javaRiceValue;
	}

}
