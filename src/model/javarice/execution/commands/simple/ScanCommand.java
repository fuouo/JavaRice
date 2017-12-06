package model.javarice.execution.commands.simple;

import controller.Console;
import controller.Console.LogType;
import model.javarice.error.errorcheckers.ConstChecker;
import model.javarice.error.errorcheckers.UndeclaredChecker;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.evaluation.EvaluationCommand;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.ScanContext;
import model.javarice.semantics.representations.JavaRiceArray;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.representations.JavaRiceValueSearcher;
import view.ScanDialog;

public class ScanCommand implements ICommand {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	private ExpressionContext exprCtx;
	
	private boolean isArray = false;
	
	public ScanCommand(ScanContext scanCtx) {
		this.exprCtx = scanCtx.expression();
		
		// check for undeclared and constant variables
		if(this.exprCtx.primary() != null) {
			// for variables
			UndeclaredChecker.verifyVarOrConstForScan(this.exprCtx.primary().getText(), scanCtx);
			
			// for constant variables
			ConstChecker.verifyConstForScan(this.exprCtx.primary().getText(), scanCtx);
			
		} else if(this.exprCtx.expression(0).primary() != null) {
			// for arrays
			UndeclaredChecker.verifyVarOrConstForScan(this.exprCtx.expression(0).primary().getText(), scanCtx);
			isArray = true;
		}
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		// halt execution until we get input from user
		ExecutionManager.getInstance().blockExecution();
		
		// open dialog box here
		new ScanDialog(this).setVisible(true);
	}
	
	/*
	 * called when dialog box is dismissed
	 */
	public void acquireInputFromUser(String input) {	
		
		// print to console
		Console.log(LogType.PRINT, input);
		
		ExecutionManager.getInstance().setCurrLineNumber(this.exprCtx.getStart().getLine());
		
		// create java rice value
		
		// if variable
		if(!isArray) {
			JavaRiceValue javaRiceValue = JavaRiceValueSearcher.searchJavaRiceValue(this.exprCtx.primary().getText());
			javaRiceValue.setScanning(true);
			javaRiceValue.setValue(input);			
			javaRiceValue.setScanning(false);
		} 
		
		// if in array
		else {
			
			// get identifier
			JavaRiceValue javaRiceValue = JavaRiceValueSearcher.searchJavaRiceValue(
					this.exprCtx.expression(0).primary().getText());
			
			// get the array index expression
			ExpressionContext arrayIndexExprCtx = this.exprCtx.expression(1);
			
			EvaluationCommand evalComm = new EvaluationCommand(arrayIndexExprCtx);
			evalComm.execute();
			
			JavaRiceArray javaRiceArray = (JavaRiceArray) javaRiceValue.getValue();
			JavaRiceValue arrayJavaRiceValue = javaRiceArray.getValueAt(evalComm.getResult().intValue());
			
			arrayJavaRiceValue.setScanning(true);
			arrayJavaRiceValue.setValue(input);
			arrayJavaRiceValue.setScanning(false);
		}
		
		
		
		// resume execution
		ExecutionManager.getInstance().resumeExecution();
	}

}
