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
import model.javarice.execution.commands.evaluation.ArrayInitializeCommand;
import model.javarice.execution.commands.execeptionhandler.IAttemptCommand;
import model.javarice.generatedexp.JavaRiceParser.ArrayCreatorRestContext;
import model.javarice.generatedexp.JavaRiceParser.CreatedNameContext;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.PrimitiveTypeContext;
import model.javarice.generatedexp.JavaRiceParser.VariableDeclaratorIdContext;
import model.javarice.semantics.representations.JavaRiceArray;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;
import model.javarice.semantics.statements.StatementControlOverseer;
import model.javarice.semantics.symboltable.scopes.ClassScope;
import model.javarice.semantics.symboltable.scopes.LocalScope;
import model.javarice.semantics.utils.IdentifiedTokens;

public class ArrayAnalyzer implements ParseTreeListener {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
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
			
			MultipleVarDecChecker multipleDeclaredChecker = 
					new MultipleVarDecChecker(varDecIdCtx);
			multipleDeclaredChecker.verify();
			
			this.identifiedTokens.addToken(ARRAY_IDENTIFIER_KEY, varDecIdCtx.getText());
			
			this.analyzeArray();
		}
		else if(ctx instanceof CreatedNameContext) {
			CreatedNameContext createdNameCtx = (CreatedNameContext) ctx;
			Console.log(LogType.DEBUG, "Array created name: " +createdNameCtx.getText());
		}
		
		else if(ctx instanceof ArrayCreatorRestContext) {
			ArrayCreatorRestContext arrayCreatorCtx = (ArrayCreatorRestContext) ctx;
			
			ExpressionContext exprCtx = arrayCreatorCtx.expression(0);
			
			// dummy variable
			JavaRiceValue javaRiceValue = new JavaRiceValue(0, PrimitiveType.INT);
			
			TypeErrorChecker typeErrorChecker = new TypeErrorChecker(javaRiceValue, exprCtx);
			typeErrorChecker.verify();
			
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
				Console.log(LogType.DEBUG, TAG + 
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
				Console.log(LogType.DEBUG, TAG + 
						"Creating array with type " +arrayTypeString+ " variable " +arrayIdentifierString);
				
				this.identifiedTokens.clearTokens();
			}
		}
	}
	
	private void createInitializeCommand(ArrayCreatorRestContext arrayCreatorCtx) {
		ArrayInitializeCommand arrayInitializeCommand = new ArrayInitializeCommand(
				this.declaredArray, arrayCreatorCtx);
		
		StatementControlOverseer statementControl = StatementControlOverseer.getInstance();
		
		if(statementControl.isInConditionalCommand()) {
			IConditionalCommand conditionalCommand = (IConditionalCommand) statementControl.getActiveControlledCommand();
			
			if(statementControl.isInPositiveRule()) {
				conditionalCommand.addPositiveCommand(arrayInitializeCommand);
			} else {
				conditionalCommand.addNegativeCommand(arrayInitializeCommand);
			}
		}
		
		else if(statementControl.isInControlledCommand()) {
			IControlledCommand controlledCommand = (IControlledCommand) statementControl.getActiveControlledCommand();
			controlledCommand.addCommand(arrayInitializeCommand);
		} else if(statementControl.isAttemptCommand()) {
			IAttemptCommand attemptCommand = (IAttemptCommand) statementControl.getActiveControlledCommand();
			
			if(statementControl.isInTryBlock()) {
				attemptCommand.addTryCommand(arrayInitializeCommand);
			} else {
				attemptCommand.addCatchCommand(statementControl.getCurrCatchType(), arrayInitializeCommand);
			}
		}
		
		else {
			ExecutionManager.getInstance().addCommand(arrayInitializeCommand);
		}
	}

}
