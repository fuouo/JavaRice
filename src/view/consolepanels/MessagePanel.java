package view.consolepanels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import controller.ControllerInterface;
import model.symboltable.STRow;
import view.factory.ConsoleType;
import view.factory.Panel;

public class MessagePanel extends Panel {

	private JTextPane messageTextPane;
	
	public MessagePanel(ConsoleType id, ControllerInterface controller){
		
		this.setId(id);
		
		setLayout(new BorderLayout());
		setBackground(Color.black);
		
		messageTextPane = new JTextPane();
		
		JScrollPane scrollPane = new JScrollPane(messageTextPane);
			
		add(scrollPane, BorderLayout.CENTER);
		
	}


	@Override
	public void update(ControllerInterface controller) {
		
	}

	
	
	public void clearMessage(){
		messageTextPane.setText("");
	}
	
	@Override
	public void displayItems(ArrayList<Object> list) {
		clearMessage();
		
		if(list==null)
			return;
		
		
		String console = "";
		for(int i=0; i<list.size(); i++){
			STRow symbol = ((STRow)list.get(i));
			console += symbol.getLexeme() + " = " + symbol.getTokenId();
			console+= "\n";
		}
		
		messageTextPane.setText(console);
		
		
		
	}
	
}
