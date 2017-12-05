package controller.thread.scopeTable;

import java.util.ArrayList;

import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.autocomplete.ShorthandCompletion;

public class AutoCompleteScopeAnalyzer {
	
	String code;
	ArrayList<Scope> scopeList;
	int currScope = 0;
	
	
	public AutoCompleteScopeAnalyzer()
	{
		scopeList = new ArrayList<Scope>();
	}
	
	public void addVariableCompletion(DefaultCompletionProvider provider, String code, int currLinePos)
	{
		this.code = code;
		analyze();
		Scope curr = getVarScope(currLinePos);
		System.out.println("currentLine is " + currLinePos);
		System.out.println("Start of Current: " + curr.getParentStartLine());
		System.out.println("End of Current: " + curr.getParentEndLine());
		curr.printIdentifiers();
		//Add variables in certain scope 
		for (int i = 0; i < curr.getIdentifierNames().size(); i++) {
			String identifier = curr.getIdentifierNames().get(i);
			System.out.println("Adding : " + identifier);
			provider.addCompletion(new ShorthandCompletion(provider, identifier, identifier, identifier));
		}
		curr = scopeList.get(0);
		//Add variables in global scope 
		for (int i = 0; i < curr.getIdentifierNames().size(); i++) {
			String identifier = curr.getIdentifierNames().get(i);
			System.out.println("Adding : " + identifier);
			provider.addCompletion(new ShorthandCompletion(provider, identifier, identifier, identifier));
		}
	}
	
	public Scope getVarScope(int currLinePos)
	{
		for (int i = 1; i < scopeList.size(); i++) {
			System.out.println("Start : " + scopeList.get(i).getParentStartLine() );
			System.out.println("End : " + scopeList.get(i).getParentEndLine() );
			if(scopeList.get(i).getParentStartLine() <= currLinePos &&
				scopeList.get(i).getParentEndLine() >= currLinePos){
				currScope = i;
				return scopeList.get(i);
			}
		}
		return scopeList.get(0);
	}
	
	
	public void analyze()
	{
		
		System.out.println("ANALYZING");
		int lastCloseBracket = 0;
		String[] lineToken = code.split("\n");
		System.out.println(code);
		System.out.println(lineToken[0]);
		Scope scope = new Scope(0, 1);
		/*code = removeSingleComments(code);
	    code = removeMultipleComments (code);*/
		
		for(int i = 0; i < lineToken.length; i++)
		{
			System.out.println("Line : " + lineToken[i]);
			//Sets line number of the last seen closing bracket
			if(lineToken[i].contains("}"))
				lastCloseBracket = i;
			
			//Checks if it's for global scope
			if(hasPubPriv(lineToken[i]) && 
					lineToken[i].contains("class"))
			{
				System.out.println("Class Declaration");
				scope.setParentStartLine(i);
				scopeList.add(scope);
			}
			//Checks for normal Methods
			else if(hasPrimitiveType(lineToken[i]) &&
					hasPubPriv(lineToken[i]) &&
					lineToken[i].contains("(") &&
					lineToken[i].contains(")"))
			{
				System.out.println("Function Declaration");
				scopeList.get(currScope).setParentEndLine(lastCloseBracket);
				currScope ++;
				scope = new Scope(i, i+1);
				scopeList.add(scope);
			}
			//Checks Variables
			else if(hasPrimitiveType(lineToken[i]) && 
					!lineToken[i].contains("(") &&
					!lineToken[i].contains(")")){
				String[] splitLine = lineToken[i].split(" ");
				System.out.println("Variable Declaration");
				for (int j = 0; j < splitLine.length; j++) {
					if(hasPrimitiveType(splitLine[j])&&    //If variable
							j+1 < splitLine.length)
					{
						scopeList.get(currScope).addIdentifier(splitLine[j+1]);
					}
				}
			}
		}
		//Set last line for Global Scope
		scopeList.get(0).setParentEndLine(lastCloseBracket);
	}
	
	private boolean hasPrimitiveType(String code)
	{
		if(code.contains("_int") || 
				code.contains("_void") ||
				code.contains("_char") ||
				code.contains("_short") ||
				code.contains("_long") ||
				code.contains("_boolean") ||
				code.contains("_byte") ||
				code.contains("_float") ||
				code.contains("_double") ||
				code.contains("_String")){
			return true;
		}
		return false;
	}
	
	private boolean hasPubPriv(String code)
	{
		if(code.contains("public") || 
				code.contains("private")){
			return true;
		}
		return false;
	}
	
	 private String removeSingleComments(String code)
	   {
		   String[] token = code.split("\n");
		   String [] subtoken;
		   for (int i = 0; i < token.length; i++) {
			   if(token[i].contains("//"))
			   {
				   subtoken = token[i].split("//");
				   token[i] = subtoken[0];
			   }
		   }
		   String newCode = "";
		   for (int i = 0; i < token.length; i++) {
			   newCode += token[i] + "\n";
		   }
		   return newCode;
	   }
	   
	   private String removeMultipleComments(String code)
	   {
		   int start = 0;
		   int end = 0;
		   String comment = "";
		   
		   while(code.contains("/*"))
		   {
			   start = code.indexOf("/*");
			   end = code.indexOf("*/");
			   comment = code.substring(start, end + 2);
			   System.out.println("Replacing : " + comment);
			   code = code.replace(comment, "");
		   }
		   return code;
	   }

}
