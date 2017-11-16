package model.javarice.error.errorcheckers;

import org.antlr.v4.runtime.Token;

import model.javarice.JavaRiceParser.MethodDeclarationContext;
import model.javarice.semantics.representations.JavaRiceFunction;
import model.javarice.semantics.symboltable.scopes.ClassScope;

public class MultipleFuncDecChecker implements IErrorChecker {
	
	private MethodDeclarationContext methodDecCtx;
	private int lineNumber;

	public MultipleFuncDecChecker(MethodDeclarationContext methodDecCtx) {
		this.methodDecCtx = methodDecCtx;
		
		Token firstToken = methodDecCtx.getStart();
		this.lineNumber = firstToken.getLine();
	}
	
	@Override
	public void verify() {
		// TODO Auto-generated method stub
		this.verifyFunctionCall(this.methodDecCtx.Identifier().getText());
	}
	
	private void verifyFunctionCall(String identifierString) {
		// parser handler shit here
		ClassScope classScope = null;
		JavaRiceFunction javaRiceFunction = classScope.searchFunction(identifierString);
		
		if(javaRiceFunction != null) {
			// report error here
			// BuildChecker.reportCustomError(ErrorRepository.MULTIPLE_FUNCTION, "", identifierString, this.lineNumber);
		}
	}

}
