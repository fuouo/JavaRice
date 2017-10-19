package view;

import java.util.List;

import controller.ControllerInterface;

abstract public class ViewInterface {
	
	abstract public void initGUI();
	abstract public void setController(ControllerInterface c);
	abstract public void update();
}
