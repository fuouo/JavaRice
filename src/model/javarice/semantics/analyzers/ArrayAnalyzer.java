package model.javarice.semantics.analyzers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.javarice.JavaRiceParser.ArrayCreatorRestContext;
import model.javarice.JavaRiceParser.CreatedNameContext;
import model.javarice.JavaRiceParser.PrimitiveTypeContext;
import model.javarice.JavaRiceParser.VariableDeclaratorIdContext;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.evaluation.ArrayInitializeCommand;
import model.javarice.semantics.representations.JavaRiceArray;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.symboltable.scopes.LocalScope;
import model.javarice.semantics.utils.IdentifiedTokens;

public class ArrayAnalyzer implements ParseTreeListener {
	
	private final static String ARRAY_PRIMITIVE_KEY = "ARRAY_PRIMITIVE_KEY";
	private final static String ARRAY_IDENTIFIER_KEY = "ARRAY_IDENTIFIER_KEY";
	
	private IdentifiedTokens identifiedTokens;
	private ClassScope declaredClassScope;
	private LocalScope localScope;
	private JavaRiceArray declaredArray;
	
	public ArrayAnalyzer( IdentifiedTokens identifiedTokens, ClassScope declaredClassScope) {
		this.identifiedTokens = identifiedTokens;
		this.declaredClassScope = declaredClassScope;
	}
	
	public ArrayAnalyzer( IdentifiedTokens identifiedTokens, LocalScope localScope) {
		this.identifiedTokens = identifiedTokens;
		this.localScope = localScope;
	}
	
	public void analyze(ParserRuleContext ctx) {
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, ctx);
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		if(ctx instanceof PrimitiveTypeContext) {
			PrimitiveTypeContext primitiveCtx = (PrimitiveTypeContext) ctx;
			this.identifiedTokens.addToken(ARRAY_PRIMITIVE_KEY, primitiveCtx.getText());
		}
		else if(ctx instanceof VariableDeclaratorIdContext) {
			VariableDeclaratorIdContext varDecIdCtx = (VariableDeclaratorIdContext) ctx;
			this.identifiedTokens.addToken(ARRAY_IDENTIFIER_KEY, varDecIdCtx.getText());
			
			this.analyzeArray();
		}
		else if(ctx instanceof CreatedNameContext) {
			CreatedNameContext createdNameCtx = (CreatedNameContext) ctx;
			System.err.println("ADD TO CONSOLE: " + "Array created name: " +createdNameCtx.getText());
		}
		
		else if(ctx instanceof ArrayCreatorRestContext) {
			ArrayCreatorRestContext arrayCreatorCtx = (ArrayCreatorRestContext) ctx;
			this.createInitializeCommand(arrayCreatorCtx);
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
	
	private void analyzeArray() {
		if(this.declaredClassScope != null) {
			if(this.identifiedTokens.containsTokens(ClassAnalyzer.ACCESS_CONTROL_KEY, 
					ARRAY_PRIMITIVE_KEY, ARRAY_IDENTIFIER_KEY)) {
				String accessControlString = this.identifiedTokens.getToken(ClassAnalyzer.ACCESS_CONTROL_KEY);
				String arrayTypeString = this.identifiedTokens.getToken(ARRAY_PRIMITIVE_KEY);
				String arrayIdentifierString = this.identifiedTokens.getToken(ARRAY_IDENTIFIER_KEY);
				
				//initialize an array java rice value
				this.declaredArray = JavaRiceArray.createArray(arrayTypeString, arrayIdentifierString);
				JavaRiceValue javaRiceValue = new JavaRiceValue(this.declaredArray, PrimitiveType.ARRAY);
				
				this.declaredClassScope.addJavaRiceValue(accessControlString, arrayIdentifierString, javaRiceValue);
				System.out.println("CONSOLE [DEBUG]: " + 
						"Creating array with type " +arrayTypeString+ " variable " +arrayIdentifierString);
				
				this.identifiedTokens.clearTokens();
			}
		} else if(this.localScope != null) {
			if(this.identifiedTokens.containsTokens(ARRAY_PRIMITIVE_KEY, ARRAY_IDENTIFIER_KEY)) {
				String arrayTypeString = this.identifiedTokens.getToken(ARRAY_PRIMITIVE_KEY);
				String arrayIdentifierString = this.identifiedTokens.getToken(ARRAY_IDENTIFIER_KEY);
				
				//initialize an array java rice value
				this.declaredArray = JavaRiceArray.createArray(arrayTypeString, arrayIdentifierString);
				JavaRiceValue javaRiceValue = new JavaRiceValue(this.declaredArray, PrimitiveType.ARRAY);
				
				this.localScope.addJavaRiceValue(arrayIdentifierString, javaRiceValue);
				System.out.println("CONSOLE [DEBUG]: " + 
						"Creating array with type " +arrayTypeString+ " variable " +arrayIdentifierString);
				
				this.identifiedTokens.clearTokens();
			}
		}
	}
	
	private void createInitializeCommand(ArrayCreatorRestContext arrayCreatorCtx) {
		ArrayInitializeCommand arrayInitializeCommand = new ArrayInitializeCommand(
				this.declaredArray, arrayCreatorCtx);
		ExecutionManager.getInstance().addCommand(arrayInitializeCommand);
	}

}
