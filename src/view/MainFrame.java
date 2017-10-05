package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class MainFrame {

	JFrame frmMain = new JFrame("JavaRice IDE");
	static Container pane;
	static JPanel panel;
	
	public MainFrame(){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    }
		catch (Exception e) {}
	            
		frmMain = new JFrame ("JavaRice IDE");
		pane = frmMain.getContentPane();
		pane.setLayout(new BorderLayout());

		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmMain.setVisible(true);
		frmMain.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	public static void setPane(JPanel newPanel){
			
			try{
				if(panel != null)
					pane.remove(panel);
				panel = newPanel;
				pane.add(panel);
				panel.revalidate();
				panel.repaint();
				panel.printAll(panel.getGraphics());
				System.out.println(panel);
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "error");
				}
		
			
		}
	
	
}
