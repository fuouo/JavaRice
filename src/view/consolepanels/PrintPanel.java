package view.consolepanels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import controller.ControllerInterface;
import view.factory.ConsoleType;
import view.factory.Panel;

public class PrintPanel extends Panel{
	
	private JTextPane messageTextPane;
	
	public PrintPanel(ConsoleType id, ControllerInterface controller){
		
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
	
	public void print(String message) {
		messageTextPane.setText(messageTextPane.getText() + message);
	}
	
	@Override
	public void displayItems(ArrayList<Object> list) {
		
	}

}
