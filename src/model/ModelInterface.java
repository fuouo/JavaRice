package model;

import java.util.ArrayList;

import controller.ControllerInterface;

public class ModelInterface {
	protected ArrayList<ControllerInterface> controllers;
	
	public ModelInterface(){
		controllers = new ArrayList<ControllerInterface>();
	}

	public void registerObserver(ControllerInterface o) {
		controllers.add(o);
	}

	public void removeObserver(ControllerInterface o) {
		int i = controllers.indexOf(o);
		if (i >= 0) {
			controllers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for(int i = 0; i < controllers.size(); i++) {
			ControllerInterface observer = (ControllerInterface)controllers.get(i);
			observer.update();
		}
	}
}
