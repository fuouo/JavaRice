package model.javarice.semantics.searching;

import controller.Console;
import controller.Console.LogType;
import model.javarice.builder.ParserHandler;
import model.javarice.execution.FunctionTracker;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.symboltable.SymbolTableManager;
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
			ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
					ParserHandler.getInstance().getCurrentClassName());
			javaRiceValue = searchVariableInClassIncludingLocal(classScope, strIdentifier);
		}
		
		return javaRiceValue;
	}
	
	public static JavaRiceValue searchVariableInFunction(JavaRiceFunction javaRiceFunction, String strIdentifier) {
		JavaRiceValue javaRiceValue = null;
		
		if(javaRiceFunction.hasParameter(strIdentifier)) {
			javaRiceValue = javaRiceFunction.getParameter(strIdentifier);
			Console.log(LogType.DEBUG, "variable is a parameter");
		} else {
			javaRiceValue = LocalScopeCreator.searchVariableInLocalIterative(strIdentifier, 
					javaRiceFunction.getParentLocalScope());
		}
		
		if(javaRiceValue == null) {
			Console.log(LogType.DEBUG, "variable not found in " + javaRiceFunction.getFunctionName());
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
