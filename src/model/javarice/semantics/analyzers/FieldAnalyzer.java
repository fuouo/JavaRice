package model.javarice.semantics.analyzers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.javarice.JavaRiceParser.VariableDeclaratorContext;
import model.javarice.JavaRiceParser.VariableDeclaratorsContext;
import model.javarice.error.errorcheckers.MultipleVarDecChecker;
import model.javarice.error.errorcheckers.TypeErrorChecker;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.evaluation.MappingCommand;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.utils.IdentifiedTokens;
import model.javarice.semantics.utils.RecognizedKeywords;

public class FieldAnalyzer implements ParseTreeListener {
	
	private ClassScope declaredClassScope;
	private IdentifiedTokens identifiedTokens;
	
	public FieldAnalyzer(IdentifiedTokens identifiedTokens, ClassScope declaredClassScope) {
		this.identifiedTokens = identifiedTokens;
		this.declaredClassScope = declaredClassScope;
	}
	
	public void analyze(VariableDeclaratorsContext varDecCtxList) {
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, varDecCtxList);
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		if(ctx instanceof VariableDeclaratorContext) {
			VariableDeclaratorContext varCtx = (VariableDeclaratorContext) ctx;
			
			//check for duplicate declarations
			MultipleVarDecChecker multipleDeclaredChecker = new MultipleVarDecChecker(varCtx.variableDeclaratorId());
			multipleDeclaredChecker.verify();
			
			this.identifiedTokens.addToken(ClassAnalyzer.IDENTIFIER_KEY, varCtx.variableDeclaratorId().getText());
			this.createJavaRiceValue();
			
			if(varCtx.variableInitializer() != null) {
				
				//we do not evaluate strings.
				if(this.identifiedTokens.containsTokens(ClassAnalyzer.PRIMITIVE_TYPE_KEY)) {
					String primitiveTypeString = this.identifiedTokens.getToken(ClassAnalyzer.PRIMITIVE_TYPE_KEY);
					if(primitiveTypeString.contains(RecognizedKeywords.PRIMITIVE_TYPE_STRING)) {
						this.identifiedTokens.addToken(ClassAnalyzer.IDENTIFIER_VALUE_KEY, 
								varCtx.variableInitializer().getText()); 
						return;
					}
				}
				
				MappingCommand mappingCommand = new MappingCommand(
						varCtx.variableDeclaratorId().getText(), varCtx.variableInitializer().expression());
				ExecutionManager.getInstance().addCommand(mappingCommand);
				
				JavaRiceValue declaredJavaRiceValue = this.declaredClassScope.searchVariableIncludingLocal(
						varCtx.variableDeclaratorId().getText());
				
				//type check the java rice value
				TypeErrorChecker typeChecker = new TypeErrorChecker(
						declaredJavaRiceValue, varCtx.variableInitializer().expression());
				typeChecker.verify();
			}
		}
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * Attempts to create an intermediate representation of the variable 
	 * once a sufficient amount of info has been retrieved.
	 */
	private void createJavaRiceValue() {
		
		if(this.identifiedTokens.containsTokens(ClassAnalyzer.ACCESS_CONTROL_KEY, 
				ClassAnalyzer.PRIMITIVE_TYPE_KEY, ClassAnalyzer.IDENTIFIER_KEY)) {
			
			String classModifierString = this.identifiedTokens.getToken(ClassAnalyzer.ACCESS_CONTROL_KEY);
			String primitiveTypeString = this.identifiedTokens.getToken(ClassAnalyzer.PRIMITIVE_TYPE_KEY);
			String identifierString = this.identifiedTokens.getToken(ClassAnalyzer.IDENTIFIER_KEY);
			String identifierValueString = null;
			
			System.err.println("ADD TO CONSOLE: " + "Class modifier: " +classModifierString);
			
			if(this.identifiedTokens.containsTokens(ClassAnalyzer.IDENTIFIER_VALUE_KEY)) {
				identifierValueString = this.identifiedTokens.getToken(ClassAnalyzer.IDENTIFIER_VALUE_KEY);
				this.declaredClassScope.addInitializedVariableFromKeyWords(
						classModifierString, primitiveTypeString, identifierString, identifierValueString);
			}
			else {
				this.declaredClassScope.addEmptyVariableFromKeyWords(
						classModifierString, primitiveTypeString, identifierString);
			}
			
			JavaRiceValue declaredValue = this.declaredClassScope.searchVariableIncludingLocal(identifierString);
			
			//verify if the declared variable is a constant
			if(this.identifiedTokens.containsTokens(ClassAnalyzer.CONST_CONTROL_KEY)) {
				declaredValue.markFinal();
			}
			
			//remove the following tokens
			this.identifiedTokens.removeToken(ClassAnalyzer.IDENTIFIER_KEY);
			this.identifiedTokens.removeToken(ClassAnalyzer.IDENTIFIER_VALUE_KEY);
		}
	}

}
