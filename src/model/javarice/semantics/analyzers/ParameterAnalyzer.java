package model.javarice.semantics.analyzers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
import model.javarice.generatedexp.JavaRiceParser.FormalParameterContext;
import model.javarice.generatedexp.JavaRiceParser.FormalParameterListContext;
import model.javarice.generatedexp.JavaRiceParser.PrimitiveTypeContext;
import model.javarice.generatedexp.JavaRiceParser.TypeTypeContext;
import model.javarice.semantics.representations.JavaRiceArray;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;
import model.javarice.semantics.utils.IdentifiedTokens;
import model.javarice.semantics.utils.RecognizedKeywords;

public class ParameterAnalyzer implements ParseTreeListener {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	private final static String PARAMETER_TYPE_KEY = "PARAMETER_TYPE_KEY";
	private final static String PARAMETER_IDENTIFIER_KEY = "PARAMETER_IDENTIFIER_KEY";
	private final static String IS_ARRAY_KEY = "IS_ARRAY_KEY";
	
	
	private IdentifiedTokens identifiedTokens;
	private JavaRiceFunction declaredJavaRiceFunction;
	
	public ParameterAnalyzer(JavaRiceFunction declaredJavaRiceFunction) {
		this.declaredJavaRiceFunction = declaredJavaRiceFunction;
	}
	
	public void analyze(FormalParameterListContext ctx) {
		this.identifiedTokens = new IdentifiedTokens();
		
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, ctx);
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		if(ctx instanceof FormalParameterContext) {
			FormalParameterContext formalParamCtx = (FormalParameterContext) ctx;
			this.analyzeParameter(formalParamCtx);
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
	
	private void analyzeParameter(FormalParameterContext formalParamCtx) {
		if(formalParamCtx.typeType() != null) {
			TypeTypeContext typeCtx = formalParamCtx.typeType();
			
			//return type is a primitive type
			if(ClassAnalyzer.isPrimitiveDeclaration(typeCtx)) {
				PrimitiveTypeContext primitiveTypeCtx = typeCtx.primitiveType();
				this.identifiedTokens.addToken(PARAMETER_TYPE_KEY, primitiveTypeCtx.getText());
			}
			
			//check if its array declaration
			else if(ClassAnalyzer.isPrimitiveArrayDeclaration(typeCtx)) {
				PrimitiveTypeContext primitiveTypeCtx = typeCtx.primitiveType();
				this.identifiedTokens.addToken(PARAMETER_TYPE_KEY, primitiveTypeCtx.getText());
				this.identifiedTokens.addToken(IS_ARRAY_KEY, IS_ARRAY_KEY);
			}
			
			//return type is a string or a class type
			else {
				
				//a string type
				if(typeCtx.classOrInterfaceType().getText().contains(RecognizedKeywords.PRIMITIVE_TYPE_STRING)) {
					this.identifiedTokens.addToken(PARAMETER_TYPE_KEY, typeCtx.classOrInterfaceType().getText());
				}
			}
		}
		
		if(formalParamCtx.variableDeclaratorId() != null) {
			TerminalNode identifier = formalParamCtx.variableDeclaratorId().Identifier();
			this.identifiedTokens.addToken(PARAMETER_IDENTIFIER_KEY, identifier.getText());
			
			this.createJavaRiceValue();
		}
	}
	
	private void createJavaRiceValue() {
		if(this.identifiedTokens.containsTokens(IS_ARRAY_KEY, PARAMETER_TYPE_KEY, PARAMETER_IDENTIFIER_KEY)) {
			String typeString = this.identifiedTokens.getToken(PARAMETER_TYPE_KEY);
			String identifierString = this.identifiedTokens.getToken(PARAMETER_IDENTIFIER_KEY);
			
			//initialize an array java rice value
			JavaRiceArray declaredArray = JavaRiceArray.createArray(typeString, identifierString);
			JavaRiceValue javaRiceValue = new JavaRiceValue(declaredArray, PrimitiveType.ARRAY);
			this.declaredJavaRiceFunction.addParameter(identifierString, javaRiceValue);
			
			Console.log(LogType.DEBUG, TAG + 
					"Created array parameter for " +this.declaredJavaRiceFunction.getFunctionName());
		}
		
		else if(this.identifiedTokens.containsTokens(PARAMETER_TYPE_KEY, PARAMETER_IDENTIFIER_KEY)) {
			String typeString = this.identifiedTokens.getToken(PARAMETER_TYPE_KEY);
			String identifierString = this.identifiedTokens.getToken(PARAMETER_IDENTIFIER_KEY);
			
			JavaRiceValue javaRiceValue = JavaRiceValue.createEmptyVariableFromKeywords(typeString);
			this.declaredJavaRiceFunction.addParameter(identifierString, javaRiceValue);

			Console.log(LogType.DEBUG, TAG + 
					"Created parameter for " +this.declaredJavaRiceFunction.getFunctionName());
		}
		
		this.identifiedTokens.clearTokens();
	}

}
