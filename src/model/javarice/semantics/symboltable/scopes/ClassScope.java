package model.javarice.semantics.symboltable.scopes;

import java.util.HashMap;

import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.utils.RecognizedKeywords;

public class ClassScope implements IScope {

	private String className;
	
	private HashMap<String, JavaRiceValue> publicVariables;
	private HashMap<String, JavaRiceValue> privateVariables;
	
	private HashMap<String, JavaRiceFunction> publicFunctions;
	private HashMap<String, JavaRiceFunction> privateFunctions;
	
	// represents the parent local scope which is the local scope covered by the main function.
	// other classes may not contain this
	private LocalScope parentLocalScope;
	
	public ClassScope(String className) {
		this.className = className;
		
		this.publicVariables = new HashMap<>();
		this.privateVariables = new HashMap<>();
		
		this.publicFunctions = new HashMap<>();
		this.privateFunctions = new HashMap<>();
	}
	
	public String getClassName() {
		return this.className;
	}
	
	public void setParentLocalScope(LocalScope localScope) {
		this.parentLocalScope = localScope;
	}
	
	/*
	 * Attempts to add an empty variable based from keywords
	 */
	public void addEmptyVariableFromKeyWords(String strClassModifier, String strPrimitiveType, String strIdentifier) {
		boolean isPublic = true;
		
		if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.CLASS_MODIFIER_PRIVATE, strClassModifier)) {
			isPublic = false;
		}
		
		JavaRiceValue javaRiceValue = JavaRiceValue.createEmptyVariableFromKeywords(strPrimitiveType);
		
		if(isPublic) {
			this.publicVariables.put(strIdentifier, javaRiceValue);
			// add to console
			System.out.println("CONSOLE [DEBUG]: " + strClassModifier + " " + 
					strPrimitiveType + " " + strIdentifier + " created!");
		} else {
			this.privateVariables.put(strIdentifier, javaRiceValue);
			// add to console
			System.out.println("CONSOLE [DEBUG]: " + strClassModifier + " " + 
					strPrimitiveType + " " + strIdentifier + " created!");
		}
	}
	
	/*
	 * Attempts to add an initialized variable based from keywords
	 */
	public void addInitializedVariableFromKeyWords(String strClassModifier, String strPrimitiveType, 
			String strIdentifier, String strValue) {
		boolean isPublic = true;
		
		if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.CLASS_MODIFIER_PRIVATE, strClassModifier)) {
			isPublic = false;
		}
		
		this.addEmptyVariableFromKeyWords(strClassModifier, strPrimitiveType, strIdentifier);
		
		if(isPublic) {
			JavaRiceValue javaRiceValue = this.publicVariables.get(strIdentifier);
			this.publicVariables.put(strIdentifier, javaRiceValue);
			// add to console
			System.out.println("CONSOLE [DEBUG]: " + strClassModifier + " " + 
					strPrimitiveType + " " + strIdentifier + " updated!");
		} else {
			JavaRiceValue javaRiceValue = this.privateVariables.get(strIdentifier);
			this.privateVariables.put(strIdentifier, javaRiceValue);
			// add to console
			System.out.println("CONSOLE [DEBUG]: " + strClassModifier + " " + 
					strPrimitiveType + " " + strIdentifier + " updated!");
		}
	}	
	
	public JavaRiceValue getPublicVariable(String strIdentifier) {
		if(this.containsPublicVariable(strIdentifier)) {
			return this.publicVariables.get(strIdentifier);
		}
		
		System.err.println("Public " + strIdentifier + " is not found.");
		return null;
	}
	
	public JavaRiceValue getPrivateVariable(String strIdentifier) {
		if(this.containsPrivateVariable(strIdentifier)) {
			return this.privateVariables.get(strIdentifier);
		}
		
		System.err.println("Private " + strIdentifier + " is not found.");
		return null;
	}
	
	public void addPrivateJavaRiceFunction(String strIdentifier, JavaRiceFunction javaRiceFunction) {
		this.privateFunctions.put(strIdentifier, javaRiceFunction);
		// add to console
		System.out.println("CONSOLE [DEBUG]: Created private function " + javaRiceFunction.getReturnType() 
			+ " " + strIdentifier);
	}
	
	public void addPublicJavaRiceFunction(String strIdentifier, JavaRiceFunction javaRiceFunction) {
		this.publicFunctions.put(strIdentifier, javaRiceFunction);
		// add to console
		System.out.println("CONSOLE [DEBUG]: Created public function " + javaRiceFunction.getReturnType() 
			+ " " + strIdentifier);
	}
	
	public void addJavaRiceValue(String accessControlModifier, String strIdentifier, JavaRiceValue javaRiceValue) {
		
		if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.CLASS_MODIFIER_PRIVATE, accessControlModifier)) {
			this.privateVariables.put(strIdentifier, javaRiceValue);
		} else {
			this.publicVariables.put(strIdentifier, javaRiceValue);
		}
	}
	
	public JavaRiceFunction getPublicFunction(String strIdentifier) {
		if(this.containsPublicFunction(strIdentifier)) {
			return this.publicFunctions.get(strIdentifier);
		}
		
		System.err.println("Public " + strIdentifier + " function is not found.");
		return null;
	}
	
	public JavaRiceFunction getPrivateFunction(String strIdentifier) {
		if(this.containsPrivateFunction(strIdentifier)) {
			return this.privateFunctions.get(strIdentifier);
		}
		
		System.err.println("Private " + strIdentifier + " function is not found.");
		return null;
	}
	
	public JavaRiceFunction searchFunction(String strIdentifier) {
		if(this.containsPublicFunction(strIdentifier)) {
			return this.publicFunctions.get(strIdentifier);
		} else if(this.containsPrivateFunction(strIdentifier)) {
			return this.privateFunctions.get(strIdentifier);
		}
		
		System.err.println(strIdentifier + " function is not found in " + this.className);
		return null;
	}
	
	public boolean containsPublicVariable(String identifier) {
		return this.publicVariables.containsKey(identifier);
	}
	
	public boolean containsPrivateVariable(String identifier) {
		return this.privateVariables.containsKey(identifier);
	}
	
	public boolean containsPublicFunction(String identifier) {
		return this.publicFunctions.containsKey(identifier);
	}
	
	public boolean containsPrivateFunction(String identifier) {
		return this.privateFunctions.containsKey(identifier);
	}
	
	public JavaRiceValue searchVariable(String identifier) {
		JavaRiceValue javaRiceValue = null;
		
		if(this.containsPrivateFunction(identifier)) {
			javaRiceValue = this.getPrivateVariable(identifier);
		} else if(this.containsPublicVariable(identifier)) {
			javaRiceValue = this.getPublicVariable(identifier);
		}
		
		return javaRiceValue;
	}
	
	/*
	 * Resets all stored variables. This is called after the execution manager finishes
	 */
	public void resetValues() {
		JavaRiceValue[] publicJavaRiceValues = 
				this.publicVariables.values().toArray(new JavaRiceValue[this.publicVariables.size()]);
		JavaRiceValue[] privateJavaRiceValues = 
				this.privateVariables.values().toArray(new JavaRiceValue[this.privateVariables.size()]);
		
		for (JavaRiceValue javaRiceValue : privateJavaRiceValues) {
			javaRiceValue.reset();
		}
		
		for (JavaRiceValue javaRiceValue : publicJavaRiceValues) {
			javaRiceValue.reset();
		}
	}
	
	@Override
	public JavaRiceValue searchVariableIncludingLocal(String identifier) {
		JavaRiceValue javaRiceValue = null;
		
		if(this.containsPrivateFunction(identifier)) {
			javaRiceValue = this.getPrivateVariable(identifier);
		} else if(this.containsPublicVariable(identifier)) {
			javaRiceValue = this.getPublicVariable(identifier);
		} else {
			javaRiceValue = LocalScopeCreator.searchVariableInLocalIterative(identifier, this.parentLocalScope);
		}
		
		return javaRiceValue;
	}

	@Override
	public boolean isParent() {
		return true;
	}

}
