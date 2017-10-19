package controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.ModelInterface;
import view.ViewInterface;

abstract public class ControllerInterface {
	protected ModelInterface model;
	protected ArrayList<ViewInterface> views;
	
	protected Calendar date;
	
	
	public ControllerInterface(ModelInterface model, ViewInterface view){
		this.model = model;
		views = new ArrayList<ViewInterface>();
		views.add(view);
		view.setController(this);
		resetView(view);
	}
	
	public void addView(ViewInterface v){
		views.add(v);
		resetView(v);
	}
	
	public void removeView(ViewInterface view){
		int i = views.indexOf(view);
		if (i >= 0) {
			views.remove(i);
		}
	}
	
	public void update(){
		for(int i = 0; i < views.size(); i++) {
			((ViewInterface) views.get(i)).update();
		}
	}
	
	
	public abstract void runCode(String code);
	public abstract ArrayList<Object> getErrors(String code);
	public abstract ArrayList<Object> getMessages(String code);
	
	abstract public void resetView(ViewInterface v);
}
