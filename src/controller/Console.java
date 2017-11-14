package controller;

import java.util.ArrayList;

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.JavaRiceCompiler;
import model.javarice.error.Error;
import model.symboltable.STRow;
import view.consolepanels.ErrorPanel;
import view.consolepanels.MessagePanel;
import view.factory.ConsoleType;

public class Console {

	// ====== SINGLETON ====== //
	private static Console instance;
	private Console(){}
	public static Console getInstance(){
		if(instance == null){
			instance = new Console();
		}
		return instance;
	}
	// ====== SINGLETON ====== //
	
	private JTabbedPane consoleTabPane;
	private MessagePanel messagePanel;
	private ErrorPanel errorPanel;
	
	public void setConsoleTabPane(JTabbedPane consoleTabPane){
		this.consoleTabPane = consoleTabPane;

		this.consoleTabPane.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				UpdateConsolePanel();
			}
		});
	}

	public void setMessagePanel(MessagePanel messagePanel) {
		this.messagePanel = messagePanel;
	}

	public void setErrorPanel(ErrorPanel errorPanel) {
		this.errorPanel = errorPanel;
	}
	
	public ArrayList<Object> getErrors(String code) {
		JavaRiceCompiler cmp = JavaRiceCompiler.getInstance();
		
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

	public ArrayList<Object> getMessages(String code) {
		JavaRiceCompiler cmp = JavaRiceCompiler.getInstance();
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
	
	public void UpdateConsolePanel(){
		view.factory.Panel activePanel = (view.factory.Panel)consoleTabPane.getSelectedComponent();
		
		ArrayList<Object> list = null;
		if(activePanel.getId() == ConsoleType.TOKENS){
			System.out.println("SHOWING TOKENS");
			list = getMessages("");
		}else if(activePanel.getId() == ConsoleType.ERRORS){
			System.out.println("SHOWING ERRORS");
			list = getErrors("");
		}
		activePanel.displayItems(list);
		
		/*
		messagePanel.displayItems(getMessages(""));
		errorPanel.displayItems(getErrors(""));
		*/
	}
	
	
}
