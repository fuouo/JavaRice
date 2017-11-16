package model.javarice.semantics.analyzers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.javarice.JavaRiceParser.BlockContext;
import model.javarice.JavaRiceParser.ClassOrInterfaceTypeContext;
import model.javarice.JavaRiceParser.FormalParametersContext;
import model.javarice.JavaRiceParser.MethodBodyContext;
import model.javarice.JavaRiceParser.MethodDeclarationContext;
import model.javarice.JavaRiceParser.PrimitiveTypeContext;
import model.javarice.JavaRiceParser.TypeTypeContext;
import model.javarice.error.errorcheckers.MultipleFuncDecChecker;
import model.javarice.execution.ExecutionManager;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.representations.JavaRiceFunction.FunctionType;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.symboltable.scopes.LocalScopeCreator;
import model.javarice.semantics.utils.IdentifiedTokens;
import model.javarice.semantics.utils.RecognizedKeywords;

public class MethodAnalyzer implements ParseTreeListener {
	
	private ClassScope declaredClassScope;
	private IdentifiedTokens identifiedTokens;
	private JavaRiceFunction declaredJavaRiceFunction;
	
	public MethodAnalyzer(IdentifiedTokens identifiedTokens, ClassScope declaredClassScope) {
		this.identifiedTokens = identifiedTokens;
		this.declaredClassScope = declaredClassScope;
		this.declaredJavaRiceFunction = new JavaRiceFunction();
	}
	
	public void analyze(MethodDeclarationContext ctx) {
		ExecutionManager.getInstance().openFunctionExecution(this.declaredJavaRiceFunction);
		
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, ctx);
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		if(ctx instanceof MethodDeclarationContext) {
			MethodDeclarationContext methodDecCtx = (MethodDeclarationContext) ctx;
			MultipleFuncDecChecker funcDecChecker = new MultipleFuncDecChecker(methodDecCtx);
			funcDecChecker.verify();
			
			this.analyzeIdentifier(methodDecCtx.Identifier()); //get the function identifier
		}
		
		else {
			this.analyzeMethod(ctx);
		}
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		if(ctx instanceof MethodDeclarationContext) {
			ExecutionManager.getInstance().closeFunctionExecution();
		}
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}
	
	private void analyzeMethod(ParserRuleContext ctx) {
		if(ctx instanceof TypeTypeContext) {
			TypeTypeContext typeCtx = (TypeTypeContext) ctx;
			
			//return type is a primitive type
			if(typeCtx.primitiveType() != null) {
				PrimitiveTypeContext primitiveTypeCtx = typeCtx.primitiveType();
				this.declaredJavaRiceFunction.setReturnType(
						JavaRiceFunction.identifyFunctionType(primitiveTypeCtx.getText()));
			}
			//return type is a string or a class type
			else {
				this.analyzeClassOrInterfaceType(typeCtx.classOrInterfaceType());
			}
		}
		
		else if(ctx instanceof FormalParametersContext) {
			FormalParametersContext formalParamsCtx = (FormalParametersContext) ctx;
			this.analyzeParameters(formalParamsCtx);
			this.storeJavaRiceFunction();
		}
		
		else if(ctx instanceof MethodBodyContext) {
			
			BlockContext blockCtx = ((MethodBodyContext) ctx).block();
			
			BlockAnalyzer blockAnalyzer = new BlockAnalyzer();
			this.declaredJavaRiceFunction.setParentLocalScope(LocalScopeCreator.getInstance().getActiveLocalScope());
			blockAnalyzer.analyze(blockCtx);
			
		}
	}
	
	private void analyzeClassOrInterfaceType(ClassOrInterfaceTypeContext classOrInterfaceCtx) {
		// a string identified
		if(classOrInterfaceCtx.getText().contains(RecognizedKeywords.PRIMITIVE_TYPE_STRING)) {
			this.declaredJavaRiceFunction.setReturnType(FunctionType.STRING_TYPE);
		}
		// a class identified
		else {
			System.out.println("CONSOLE [DEBUG]: " + "Class identified: " + classOrInterfaceCtx.getText());
		}
	}
	
	private void analyzeParameters(FormalParametersContext formalParamsCtx) {
		if(formalParamsCtx.formalParameterList() != null) {
			ParameterAnalyzer parameterAnalyzer = new ParameterAnalyzer(this.declaredJavaRiceFunction);
			parameterAnalyzer.analyze(formalParamsCtx.formalParameterList());
		}
	}
	
	private void analyzeIdentifier(TerminalNode identifier) {
		this.declaredJavaRiceFunction.setFunctionName(identifier.getText());
	}
	
	/*
	 * Stores the created function in its corresponding class scope
	 */
	private void storeJavaRiceFunction() {
		if(this.identifiedTokens.containsTokens(ClassAnalyzer.ACCESS_CONTROL_KEY)) {
			String accessToken = this.identifiedTokens.getToken(ClassAnalyzer.ACCESS_CONTROL_KEY);
			
			if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.CLASS_MODIFIER_PRIVATE, accessToken)) {
				this.declaredClassScope.addPrivateJavaRiceFunction(
						this.declaredJavaRiceFunction.getFunctionName(), this.declaredJavaRiceFunction);
			}
			
			else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.CLASS_MODIFIER_PUBLIC, accessToken)) {
				this.declaredClassScope.addPublicJavaRiceFunction(
						this.declaredJavaRiceFunction.getFunctionName(), this.declaredJavaRiceFunction);
			}
			
			// clear tokens for reuse
			this.identifiedTokens.clearTokens(); 
		}
	}

}
