package model.javarice.semantics.analyzers;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
import model.javarice.builder.ParserHandler;
import model.javarice.error.errorcheckers.ClassNameChecker;
import model.javarice.generatedexp.JavaRiceLexer;
import model.javarice.generatedexp.JavaRiceParser.ClassDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.ClassOrInterfaceModifierContext;
import model.javarice.generatedexp.JavaRiceParser.ClassOrInterfaceTypeContext;
import model.javarice.generatedexp.JavaRiceParser.FieldDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.PrimitiveTypeContext;
import model.javarice.generatedexp.JavaRiceParser.TypeTypeContext;
import model.javarice.semantics.symboltable.SymbolTableManager;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.utils.IdentifiedTokens;
import model.javarice.semantics.utils.RecognizedKeywords;

public class ClassAnalyzer implements ParseTreeListener {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	private ClassScope declaredClassScope;
	private IdentifiedTokens identifiedTokens;
	
	public final static String ACCESS_CONTROL_KEY = "ACCESS_CONTROL_KEY";
	public final static String CONST_CONTROL_KEY = "CONST_CONSTROL_KEY";
	public final static String STATIC_CONTROL_KEY = "STATIC_CONTROL_KEY";
	public final static String PRIMITIVE_TYPE_KEY = "PRIMITIVE_TYPE_KEY";
	public final static String IDENTIFIER_KEY = "IDENTIFIER_KEY";
	public final static String IDENTIFIER_VALUE_KEY = "IDENTIFIER_VALUE_KEY";
	
	public ClassAnalyzer() {
		
	}
	
	public void analyze(ClassDeclarationContext ctx) {
		String className = ctx.Identifier().getText();
		
		Console.log(LogType.DEBUG, TAG + "Class name is " +className);
		
		ParserHandler.getInstance().setCurrentClassName(className);
		
		ClassNameChecker classNameChecker = new ClassNameChecker(className);
		classNameChecker.verify();
		
		this.declaredClassScope = new ClassScope(classNameChecker.correctClassName());
		this.identifiedTokens = new IdentifiedTokens();
		
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, ctx);
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		if(ctx instanceof ClassDeclarationContext) {
			SymbolTableManager.getInstance().addClassScope(
					this.declaredClassScope.getClassName(), this.declaredClassScope);
		}
		
		this.analyzeClassMembers(ctx);
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
	
	private void analyzeClassMembers(ParserRuleContext ctx) {
		if(ctx instanceof ClassOrInterfaceModifierContext) {			
			ClassOrInterfaceModifierContext classModifierCtx = (ClassOrInterfaceModifierContext) ctx;
			this.analyzeModifier(classModifierCtx);
		} else if(ctx instanceof FieldDeclarationContext) {
			FieldDeclarationContext fieldCtx = (FieldDeclarationContext) ctx;
			
			if(fieldCtx.typeType() != null) {
				TypeTypeContext typeCtx = fieldCtx.typeType();
				
				// check if its a primitive type
				if(ClassAnalyzer.isPrimitiveDeclaration(typeCtx)) {
					PrimitiveTypeContext primitiveTypeCtx = typeCtx.primitiveType();
					this.identifiedTokens.addToken(PRIMITIVE_TYPE_KEY, primitiveTypeCtx.getText());
					
					Console.log(LogType.DEBUG, TAG + "Primitive field declaration: " + fieldCtx.getText());
					
					// create a field analyzer to walk through declarations
					FieldAnalyzer fieldAnalyzer = new FieldAnalyzer(this.identifiedTokens, this.declaredClassScope);
					fieldAnalyzer.analyze(fieldCtx.variableDeclarators());
					
					// clear tokens for reuse
					this.identifiedTokens.clearTokens();	
				} //check if its array declaration
				else if(ClassAnalyzer.isPrimitiveArrayDeclaration(typeCtx)) {
					Console.log(LogType.DEBUG, TAG + "Primitive array declaration: " + fieldCtx.getText());
					ArrayAnalyzer arrayAnalyzer = new ArrayAnalyzer(this.identifiedTokens, this.declaredClassScope);
					arrayAnalyzer.analyze(fieldCtx);
				} //this is for class type ctx
				else {
					//a string identified
					if(typeCtx.classOrInterfaceType().getText().contains(RecognizedKeywords.PRIMITIVE_TYPE_STRING)) {
						ClassOrInterfaceTypeContext classInterfaceCtx = typeCtx.classOrInterfaceType();
						this.identifiedTokens.addToken(PRIMITIVE_TYPE_KEY, classInterfaceCtx.getText());
					}
					
					//create a field analyzer to walk through declarations
					FieldAnalyzer fieldAnalyzer = new FieldAnalyzer(this.identifiedTokens, this.declaredClassScope);
					fieldAnalyzer.analyze(fieldCtx.variableDeclarators());
					
					//clear tokens for reuse
					this.identifiedTokens.clearTokens();
				}
			}
		}
	}
	
	public static boolean isPrimitiveDeclaration(TypeTypeContext typeCtx) {
		if(typeCtx.primitiveType() != null) {
			List<TerminalNode> lBrackToken = typeCtx.getTokens(JavaRiceLexer.LBRACK);
			List<TerminalNode> rBrackToken = typeCtx.getTokens(JavaRiceLexer.RBRACK);
			
			return (lBrackToken.size() == 0 && rBrackToken.size() == 0);
		}
		
		return false;
	}
	
	public static boolean isPrimitiveArrayDeclaration(TypeTypeContext typeCtx) {
		if(typeCtx.primitiveType() != null) {
			List<TerminalNode> lBrackToken = typeCtx.getTokens(JavaRiceLexer.LBRACK);
			List<TerminalNode> rBrackToken = typeCtx.getTokens(JavaRiceLexer.RBRACK);
			
			return (lBrackToken.size() > 0 && rBrackToken.size() > 0);
		}
		
		return false;
	}
	
	private void analyzeModifier(ClassOrInterfaceModifierContext ctx) {
		if(ctx.getTokens(JavaRiceLexer.PUBLIC).size() > 0 || ctx.getTokens(JavaRiceLexer.PRIVATE).size() > 0
				|| ctx.getTokens(JavaRiceLexer.PROTECTED).size() > 0) {
			Console.log(LogType.DEBUG, TAG + "Detected accessor: " +ctx.getText());
			this.identifiedTokens.addToken(ACCESS_CONTROL_KEY, ctx.getText());
		}
		else if(ctx.getTokens(JavaRiceLexer.FINAL).size() > 0) {
			Console.log(LogType.DEBUG, TAG + "Detected const: " +ctx.getText());
			this.identifiedTokens.addToken(CONST_CONTROL_KEY, ctx.getText());
		}
		else if(ctx.getTokens(JavaRiceLexer.STATIC).size() > 0) {
			Console.log(LogType.DEBUG, TAG + "Detected static: " +ctx.getText());
			this.identifiedTokens.addToken(STATIC_CONTROL_KEY, ctx.getText());
		}
	}

}
