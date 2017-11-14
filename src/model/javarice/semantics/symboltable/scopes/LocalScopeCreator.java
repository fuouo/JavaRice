package model.javarice.semantics.symboltable.scopes;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import model.javarice.semantics.representations.JavaRiceValue;

public class LocalScopeCreator {
	
	private static LocalScopeCreator INSTANCE = null;
	private LocalScope activeLocalScope = null;
	
	private LocalScopeCreator() { }
	
	public static LocalScopeCreator getInstance() {
		return INSTANCE;
	}
	
	public static void initialize() {
		INSTANCE = new LocalScopeCreator();
	}
	
	public static void reset() {
		INSTANCE.activeLocalScope = null;
	}
	
	public LocalScope getActiveLocalScope() {
		return this.activeLocalScope;
	}
	
	/*
	 * Opens a new local scope instance. If the active local scope instance is null,
	 * it creates a new one and sets it as a parent. Otherwise, the active local scope is set as
	 * a parent of the new instance, then the new instance becomes the active local scope.
	 */
	public LocalScope openLocalScope() {
		if(this.activeLocalScope == null) {
			this.activeLocalScope = new LocalScope();
		} else {
			LocalScope childLocalScope = new LocalScope();
			
			// assign current local scope as parent
			childLocalScope.setParent(this.activeLocalScope);
			
			// add new scope as child to the current local scope
			this.activeLocalScope.addChild(childLocalScope);
			
			// change pointer to the child scope
			this.activeLocalScope = childLocalScope;
		}
		
		return this.activeLocalScope;
	}
	
	/*
	 * Closes the active local scope which changes the pointer to the parent of the active local scope.
	 */
	public void closeLocalScope() {
		if(this.activeLocalScope.getParent() != null && this.activeLocalScope.getParent() instanceof LocalScope) {
			this.activeLocalScope = (LocalScope) this.activeLocalScope.getParent();
		} else if(this.activeLocalScope.getParent() == null) {
			System.err.println("Local scope has no parent scope.");
		} else {
			System.err.println("Parent is now class scope.");
		}
	}
	
	/*
	 * Searches for a local variable using an iterative depth-first search.
	 */
	public static JavaRiceValue searchVariableInLocalIterative(String strIdentifier, LocalScope localScope) {
		if(localScope != null) {
			
			Stack<LocalScope> stack	= new Stack<>();
			
			stack.push(localScope);
			
			
			List<LocalScope> discoveredScopes = new ArrayList<>();
			LocalScope scope;
			
			while(!stack.isEmpty()) {
				scope = stack.pop();
				
				if(scope.containsVariable(strIdentifier)) {
					return scope.searchVariableIncludingLocal(strIdentifier);
				}
				
				if(!discoveredScopes.contains(scope)) {
					discoveredScopes.add(scope);
					
					for(int i = 0; i < scope.getChildCount(); i ++) {
						LocalScope childScope = scope.getChildAt(i);
						stack.push(childScope);
					}
				}
			}
		}
		
		System.err.println(strIdentifier + " not found in any local scope!");
		return null;
	}
	

}
