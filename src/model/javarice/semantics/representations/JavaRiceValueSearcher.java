package model.javarice.semantics.representations;

import model.javarice.builder.ParserHandler;
import model.javarice.execution.FunctionTracker;
import model.javarice.semantics.symboltable.SymbolTableManager;
import model.javarice.semantics.symboltable.scopes.ClassScope;
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
			ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
					ParserHandler.getInstance().getCurrentClassName());
			javaRiceValue = classScope.searchVariableIncludingLocal(strIdentifier);
		}
		
		return javaRiceValue;
	}

}
