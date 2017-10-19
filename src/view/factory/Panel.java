package view.factory;
import java.util.ArrayList;

import javax.swing.JPanel;

import controller.ControllerInterface;

public abstract class Panel extends JPanel {
	
	private ConsoleType id;
	
	public abstract void update(ControllerInterface controller);
	public abstract void displayItems(ArrayList<Object> list);
	public ConsoleType getId() {
		return id;
	}
	public void setId(ConsoleType id) {
		this.id = id;
	}
	
}
