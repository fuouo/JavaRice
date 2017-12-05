package model.javarice.semantics.analyzers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
import model.javarice.error.errorcheckers.MultipleVarDecChecker;
import model.javarice.error.errorcheckers.TypeErrorChecker;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.controlled.IConditionalCommand;
import model.javarice.execution.commands.controlled.IControlledCommand;
import model.javarice.execution.commands.evaluation.MappingCommand;
import model.javarice.execution.commands.execeptionhandler.IAttemptCommand;
import model.javarice.generatedexp.JavaRiceLexer;
import model.javarice.generatedexp.JavaRiceParser.ClassOrInterfaceTypeContext;
import model.javarice.generatedexp.JavaRiceParser.LocalVariableDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.PrimitiveTypeContext;
import model.javarice.generatedexp.JavaRiceParser.TypeTypeContext;
import model.javarice.generatedexp.JavaRiceParser.VariableDeclaratorContext;
import model.javarice.generatedexp.JavaRiceParser.VariableModifierContext;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.statements.StatementControlOverseer;
import model.javarice.semantics.symboltable.scopes.LocalScope;
import model.javarice.semantics.symboltable.scopes.LocalScopeCreator;
import model.javarice.semantics.utils.IdentifiedTokens;
import model.javarice.semantics.utils.RecognizedKeywords;

public class LocalVariableAnalyzer implements ParseTreeListener {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	private final static String PRIMITIVE_TYPE_KEY = "PRIMITIVE_TYPE_KEY";
	private final static String IDENTIFIER_KEY = "IDENTIFIER_KEY";
	private final static String IDENTIFIER_VALUE_KEY = "IDENTIFIER_VALUE_KEY";
	public final static String CONST_CONTROL_KEY = "CONST_CONSTROL_KEY";
	
	private IdentifiedTokens identifiedTokens;
	private boolean executeMappingImmediate = false;
	private boolean hasPassedArrayDeclaration = false;
	
	private boolean isFinal = false;
	
	public LocalVariableAnalyzer() {
		
	}
	
	public void analyze(LocalVariableDeclarationContext localVarDecCtx) {
		this.identifiedTokens = new IdentifiedTokens();
		
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, localVarDecCtx);
		
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		this.analyzeVariables(ctx);
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
	
	private void analyzeVariables(ParserRuleContext ctx) {
		if(ctx instanceof VariableModifierContext) {
			VariableModifierContext varCtx = (VariableModifierContext) ctx;
			
			if(varCtx.getTokens(JavaRiceLexer.FINAL).size() > 0) {
				this.identifiedTokens.addToken(CONST_CONTROL_KEY, varCtx.getText());
				isFinal = true;
			}
		}
		
		
		else if(ctx instanceof TypeTypeContext) {
			TypeTypeContext typeCtx = (TypeTypeContext) ctx;
			
			//clear tokens for reuse, if not final
			if(!isFinal) {
				this.identifiedTokens.clearTokens();
			}
			
			if(ClassAnalyzer.isPrimitiveDeclaration(typeCtx)) {
				PrimitiveTypeContext primitiveTypeCtx = typeCtx.primitiveType();
				this.identifiedTokens.addToken(PRIMITIVE_TYPE_KEY, primitiveTypeCtx.getText());
				Console.log(LogType.DEBUG, TAG + "Primitive type declaration: " + primitiveTypeCtx.getText());
				
			} //check if its array declaration
			else if(ClassAnalyzer.isPrimitiveArrayDeclaration(typeCtx)) {
				Console.log(LogType.DEBUG, TAG + "Primitive array declaration: " +typeCtx.getText());
				ArrayAnalyzer arrayAnalyzer = new ArrayAnalyzer(this.identifiedTokens, 
						LocalScopeCreator.getInstance().getActiveLocalScope());
				arrayAnalyzer.analyze(typeCtx.getParent());
				this.hasPassedArrayDeclaration = true;
			} //this is for class type ctx
			else {
				//a string identified
				if(typeCtx.classOrInterfaceType().getText().contains(RecognizedKeywords.PRIMITIVE_TYPE_STRING)) {
					ClassOrInterfaceTypeContext classInterfaceCtx = typeCtx.classOrInterfaceType();
					this.identifiedTokens.addToken(PRIMITIVE_TYPE_KEY, classInterfaceCtx.getText());
				}
			}
		} 
		
		
		else if(ctx instanceof VariableDeclaratorContext) {
			
			VariableDeclaratorContext varCtx = (VariableDeclaratorContext) ctx;
			
			if(this.hasPassedArrayDeclaration) {
				return;
			}
			
			//check for duplicate declarations
			if(this.executeMappingImmediate == false) {
				
				MultipleVarDecChecker multipleDeclaredChecker = 
						new MultipleVarDecChecker(varCtx.variableDeclaratorId());
				multipleDeclaredChecker.verify();
			}
			
			this.identifiedTokens.addToken(IDENTIFIER_KEY, varCtx.variableDeclaratorId().getText());
			this.createJavaRiceValue();
			
			if(varCtx.variableInitializer() != null) {
				
				//we do not evaluate strings.
				if(this.identifiedTokens.containsTokens(PRIMITIVE_TYPE_KEY)) {
					String primitiveTypeString = this.identifiedTokens.getToken(PRIMITIVE_TYPE_KEY);
					if(primitiveTypeString.contains(RecognizedKeywords.PRIMITIVE_TYPE_STRING)) {
						this.identifiedTokens.addToken(IDENTIFIER_VALUE_KEY, varCtx.variableInitializer().getText()); 
					}
				}
				
				this.processMapping(varCtx);
				
				LocalScope localScope = LocalScopeCreator.getInstance().getActiveLocalScope();
				JavaRiceValue declaredJavaRiceValue = localScope.searchVariableIncludingLocal(
						varCtx.variableDeclaratorId().getText());
				
				//type check the java rice value
				TypeErrorChecker typeChecker = new TypeErrorChecker(
						declaredJavaRiceValue, varCtx.variableInitializer().expression());
				typeChecker.verify();
			}
		} 
	}
	
	/*
	 * Local variable analyzer is also used for loops. Whenever there is a loop,
	 * mapping command should be executed immediately to update the value in the symbol table.
	 * Otherwise, it proceeds normally.
	 */
	private void processMapping(VariableDeclaratorContext varCtx) {
		if(this.executeMappingImmediate) {
			MappingCommand mappingCommand = new MappingCommand(
					varCtx.variableDeclaratorId().getText(), varCtx.variableInitializer().expression());
			mappingCommand.execute();
		}
		else {
			MappingCommand mappingCommand = new MappingCommand(
					varCtx.variableDeclaratorId().getText(), varCtx.variableInitializer().expression());
			
			StatementControlOverseer statementControl = StatementControlOverseer.getInstance();
			
			if(statementControl.isInConditionalCommand()) {
				IConditionalCommand conditionalCommand = (IConditionalCommand) statementControl.getActiveControlledCommand();
				
				if(statementControl.isInPositiveRule()) {
					conditionalCommand.addPositiveCommand(mappingCommand);
				} else {
					conditionalCommand.addNegativeCommand(mappingCommand);
				}
			}
			
			else if(statementControl.isInControlledCommand()) {
				IControlledCommand controlledCommand = (IControlledCommand) statementControl.getActiveControlledCommand();
				controlledCommand.addCommand(mappingCommand);
			} else if(statementControl.isAttemptCommand()) {
				IAttemptCommand attemptCommand = (IAttemptCommand) statementControl.getActiveControlledCommand();
				
				if(statementControl.isInTryBlock()) {
					attemptCommand.addTryCommand(mappingCommand);
				} else {
					attemptCommand.addCatchCommand(statementControl.getCurrCatchType(), mappingCommand);
				}
			}
			
			else {
				ExecutionManager.getInstance().addCommand(mappingCommand);
			}
			
		}
	}
	
	public void markImmediateExecution() {
		this.executeMappingImmediate = true;
	}
	
	private void createJavaRiceValue() {
		
		if(this.identifiedTokens.containsTokens(PRIMITIVE_TYPE_KEY, IDENTIFIER_KEY)) {
			String primitiveTypeString = this.identifiedTokens.getToken(PRIMITIVE_TYPE_KEY);
			String identifierString = this.identifiedTokens.getToken(IDENTIFIER_KEY);
			String identifierValueString = null;
			
			LocalScope localScope = LocalScopeCreator.getInstance().getActiveLocalScope();
			
			if(this.identifiedTokens.containsTokens(IDENTIFIER_VALUE_KEY)) {
				
				identifierValueString = this.identifiedTokens.getToken(IDENTIFIER_VALUE_KEY);
				localScope.addInitializedVariableFromKeywords(
						primitiveTypeString, identifierString, identifierValueString);
			
				if(this.identifiedTokens.containsTokens(CONST_CONTROL_KEY)) {
					localScope.addFinalInitializedVariableFromKeywords(
							primitiveTypeString, identifierString, identifierValueString);
					Console.log(LogType.DEBUG, TAG + "adding final " + primitiveTypeString + " " + identifierString);
				}
			}
			else {
				
				localScope.addEmptyVariableFromKeywords(primitiveTypeString, identifierString);
				
				if(this.identifiedTokens.containsTokens(CONST_CONTROL_KEY)) {
					localScope.addFinalEmptyVariableFromKeywords(primitiveTypeString, identifierString);
					Console.log(LogType.DEBUG, TAG + "adding final " + primitiveTypeString + " " + identifierString);
				} 
				
				Console.log(LogType.DEBUG, TAG + identifierString + " is added to local scope.");
			}
			
			//remove the following tokens
			this.identifiedTokens.removeToken(IDENTIFIER_KEY);
			this.identifiedTokens.removeToken(IDENTIFIER_VALUE_KEY);
		}
	}

}
