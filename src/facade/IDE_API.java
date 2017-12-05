package facade;

import controller.IDEController;
import model.JavaRiceCompiler;
import view.IDEView;

public class IDE_API {
	
	public IDEController controller;
	
	public IDE_API(){
		
		//insert model declaration here
		JavaRiceCompiler compiler = JavaRiceCompiler.getInstance();
		
		//insert view declaration here
		IDEView ideView = new IDEView();
		controller = new IDEController(compiler, ideView);
		//insert controller declaration here
		//controller must have model and view as paramters for constructor
	}
	
	public IDEController getController() {
		return controller;
	}

}
