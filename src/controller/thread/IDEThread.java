package controller.thread;

import java.util.Timer;
import java.util.TimerTask;

import controller.IDEController;

public class IDEThread extends Thread {

	public IDEController controller;
	private int TIMEOUT = 1000;
	private boolean isBuilding = false;
	
	public IDEThread(IDEController controller)
	{
		this.controller = controller;
		this.start();
	}
    public void run() {
    	
        System.out.println("Hello from a thread!");
        
        while(!isBuilding)
        {
        	try {
        		//controller.build();
        		System.out.println("THREAD RUNNING");
				Thread.sleep(TIMEOUT);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
		
    }
    
    public void setIsBuilding(boolean b)
    {
    	isBuilding = b;
    }
	
}