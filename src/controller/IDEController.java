package controller;

import java.awt.Color;
import java.util.ArrayList;

import model.JavaRiceCompiler;
import model.ModelInterface;
import model.javarice.builder.BuildChecker;
import model.javarice.builder.ParserHandler;
import model.javarice.error.Error;
import model.javarice.execution.ExecutionManager;
import model.javarice.execution.FunctionTracker;
import model.javarice.semantics.statements.StatementControlOverseer;
import model.javarice.semantics.symboltable.SymbolTableManager;
import model.javarice.semantics.symboltable.scopes.LocalScopeCreator;
import model.symboltable.STRow;
import view.IDEView;
import view.ViewInterface;

public class IDEController extends ControllerInterface{
	
	public IDEController(ModelInterface model, ViewInterface view) {
		super(model, view);
		this.initializeComponents();
	}

	@Override
	public void resetView(ViewInterface v) {
		
	}
	
	public void goToLine(int line){
		IDEView v = (IDEView)views.get(0);
		
		Color errorHighlight = new Color(255, 147, 147);

		v.moveCareToLine(line);
		v.highlightLine(line, errorHighlight);
	}
	
	public void clearLineHighlights() {
		IDEView v = (IDEView)views.get(0);
		v.clearLineHighlights();
	}
	
	@Override
	public void runCode(String code){
//		JavaRiceCompiler cmp = (JavaRiceCompiler) model;
//		cmp.compile(code);
		
		// reset components
		this.performResetComponents();
		
		ParserHandler.getInstance().parseText(code);
	}

	@Override
	public ArrayList<Object> getErrors(String code) {
		JavaRiceCompiler cmp = (JavaRiceCompiler) model;
		
		try{
			ArrayList<Error> temp = cmp.getErrors();
			ArrayList<Object> errors = new ArrayList<Object>();
			for(int i=0; i<temp.size(); i++){
				errors.add((Object) temp.get(i));
			}
			return errors;
		}catch(Exception e){}
		return null;
	}

	@Override
	public ArrayList<Object> getMessages(String code) {
		JavaRiceCompiler cmp = (JavaRiceCompiler) model;
		try{
			ArrayList<STRow> temp = cmp.getSymbolTable();
			ArrayList<Object> messages = new ArrayList<Object>();
			for(int i=0; i<temp.size(); i++){
				messages.add((Object) temp.get(i));
			}
			
			return messages;
		}catch(Exception e){}
		
		return null;
	}
	
	private void initializeComponents() {
		SymbolTableManager.initialize();
		BuildChecker.initialize();
		ExecutionManager.initialize();
		LocalScopeCreator.initialize();
		StatementControlOverseer.initialize();
		FunctionTracker.initialize();
	}
	
	private void performResetComponents() {
		ExecutionManager.reset();
		LocalScopeCreator.reset();
		SymbolTableManager.reset();
		BuildChecker.reset();
		StatementControlOverseer.reset();
		FunctionTracker.reset();
	}

}
