package model.javarice.semantics.symboltable.scopes;

import java.util.ArrayList;
import java.util.HashMap;

import model.javarice.semantics.representations.JavaRiceValue;

public class LocalScope implements IScope {
	
	private IScope parentScope = null;
	private ArrayList<LocalScope> childScopeList = null;
	
	private HashMap<String, JavaRiceValue> localVariables = null;
	
	public LocalScope() {	}
	
	public void initLocalVariableMap() {
		if(this.localVariables == null) {
			this.localVariables = new HashMap<String, JavaRiceValue>();
		}
	}
	
	public void initChildList() {
		if(this.childScopeList == null) {
			this.childScopeList = new ArrayList<>();
		}
	}
	
	public void setParent(IScope parentScope) {
		this.parentScope = parentScope;
	}
	
	public void addChild(LocalScope localScope) {
		this.initChildList();
		
		this.childScopeList.add(localScope);
	}
	
	public IScope getParent() {
		return this.parentScope;
	}
	
	public int getChildCount() {
		if(this.childScopeList != null) {
			return this.childScopeList.size();
		}
		
		return 0;
	}
	
	public LocalScope getChildAt(int index) {
		if(this.childScopeList != null) {
			return this.childScopeList.get(index);
		}
		
		return null;
	}
	
	public boolean containsVariable(String identifier) {
		return (this.localVariables != null && this.localVariables.containsKey(identifier));
	}
	
	public void addEmptyVariableFromKeywords(String strPrimitiveType, String strIdentifier) {
		this.initLocalVariableMap();
		
		JavaRiceValue javaRiceValue = JavaRiceValue.createEmptyVariableFromKeywords(strPrimitiveType);
		this.localVariables.put(strIdentifier, javaRiceValue);
	}
	
	public void addInitializedVariableFromKeywords(String strPrimitiveType, String strIdentifier, String strValue) {
		this.initLocalVariableMap();
		
		this.addEmptyVariableFromKeywords(strPrimitiveType, strIdentifier);
		JavaRiceValue javaRiceValue = this.localVariables.get(strIdentifier);
		javaRiceValue.setValue(strValue);
	}
	
	public void addFinalEmptyVariableFromKeywords(String strPrimitiveType, String strIdentifier) {
		this.initLocalVariableMap();
		
		JavaRiceValue javaRiceValue = JavaRiceValue.createEmptyVariableFromKeywords(strPrimitiveType);
		javaRiceValue.markFinal();
		this.localVariables.put(strIdentifier, javaRiceValue);
	}
	
	public void addFinalInitializedVariableFromKeywords(String strPrimitiveType, String strIdentifier, String strValue) {
		this.initLocalVariableMap();
		
		this.addFinalEmptyVariableFromKeywords(strPrimitiveType, strIdentifier);
		JavaRiceValue javaRiceValue = this.localVariables.get(strIdentifier);
		javaRiceValue.setValue(strValue);
	}
	
	public void addJavaRiceValue(String strIdentifier, JavaRiceValue javaRiceValue) {
		this.initLocalVariableMap();
		this.localVariables.put(strIdentifier, javaRiceValue);
	}
	
	public int getDepth() {
		int depthCount = -1;
		
		LocalScope scope = (LocalScope) this;
		
		while(scope != null) {
			depthCount++;
			
			IScope abstractScope = scope.getParent();
			
			scope = (LocalScope) abstractScope;
		}
		
		return depthCount;
	}

	@Override
	public JavaRiceValue searchVariableIncludingLocal(String identifier) {
		
		if(this.containsVariable(identifier)) {
			return this.localVariables.get(identifier);
		}
		
		System.err.println(identifier + " not found!!!");
		return null;
	}

	@Override
	public boolean isParent() {
		return this.parentScope == null;
	}

}
