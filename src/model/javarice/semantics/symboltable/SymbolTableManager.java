package model.javarice.semantics.symboltable;

import java.util.HashMap;

import model.javarice.semantics.symboltable.scopes.ClassScope;

public class SymbolTableManager {
	
	private static SymbolTableManager INSTANCE = null;
	
	private HashMap<String, ClassScope> classTable;
	
	
	public static SymbolTableManager getInstance() {
		return INSTANCE;
	}
	
	private SymbolTableManager() {
		this.classTable = new HashMap<>();
	}
	
	public static void initialize() {
		INSTANCE = new SymbolTableManager();
	}
	
	public static void reset() {
		INSTANCE.classTable.clear();
	}

	public void addClassScope(String className, ClassScope classScope) {
		this.classTable.put(className, classScope);
	}
	
	public ClassScope getClassScope(String className) {
		if(this.containsClassScope(className)) {
			return this.classTable.get(className);
		} 
		
		System.err.println(className + " is not found!");
		return null;
	}
	
	public boolean containsClassScope(String className) {
		return this.classTable.containsKey(className);
	}
	
	public void resetClassTables() {
		ClassScope[] classScopes = this.classTable.values().toArray(new ClassScope[this.classTable.size()]);
		
		for (ClassScope classScope : classScopes) {
			classScope.resetValues();
		}
	}
}
