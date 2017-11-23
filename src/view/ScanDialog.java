package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.javarice.execution.commands.simple.ScanCommand;

public class ScanDialog extends JDialog implements ActionListener,
	PropertyChangeListener{
	
	private static final long serialVersionUID = 1L;

	private JTextField txtFldInput;
	
	private JOptionPane optionPane;
	
	private String typedText;
	private String btnEnterString = "Enter";
	
	private ScanCommand sc;
	
	public ScanDialog(ScanCommand sc) {
		setSize(400, 150);
		setTitle("Scan");
		txtFldInput = new JTextField(10);
		this.sc = sc;
		
		//Create an array of the text and components to be displayed.
		Object[] array = {txtFldInput};
		
		//Create an array specifying the number of dialog buttons
        //and their text.
		Object[] options = {btnEnterString};
		
		//Create the JOptionPane.
		optionPane = new JOptionPane(array, 
									JOptionPane.QUESTION_MESSAGE, 
									JOptionPane.YES_OPTION,
									null,
									options,
									options[0]);
		
		//Make this dialog display it.
		setContentPane(optionPane);
		
		//Ensure the text field always gets the first focus.
        addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent ce) {
                txtFldInput.requestFocusInWindow();
            }
        });
        
		//Handle window closing correctly.
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		//Register an event handler that puts the text into the option pane.
        txtFldInput.addActionListener(this);
        
        //Register an event handler that reacts to option pane state changes.
        optionPane.addPropertyChangeListener(this);
	}

	/** This method handles events for the text field. */
	@Override
    public void actionPerformed(ActionEvent e) {
        optionPane.setValue(btnEnterString);
    }

	@Override
	public void propertyChange(PropertyChangeEvent e) {
		// TODO Auto-generated method stub
		 String prop = e.getPropertyName();
		 
	        if (isVisible()
	         && (e.getSource() == optionPane)
	         && (JOptionPane.VALUE_PROPERTY.equals(prop) ||
	             JOptionPane.INPUT_VALUE_PROPERTY.equals(prop))) {
	            Object value = optionPane.getValue();
	 
	            if (value == JOptionPane.UNINITIALIZED_VALUE) {
	                //ignore reset
	                return;
	            }
	 
	            //Reset the JOptionPane's value.
	            //If you don't do this, then if the user
	            //presses the same button next time, no
	            //property change event will be fired.
	            optionPane.setValue(
	                    JOptionPane.UNINITIALIZED_VALUE);
	 
	            if (btnEnterString.equals(value)) {
	                    typedText = txtFldInput.getText();
	                String inputString = typedText.toUpperCase();
	                
	                if(inputString.isEmpty()) {
	                	//text was invalid
	                    txtFldInput.selectAll();
	                    JOptionPane.showMessageDialog(
	                                    ScanDialog.this,
	                                    "Sorry, an empty string "
	                                    + "isn't a valid response.\n",
	                                    "Try again.",
	                                    JOptionPane.ERROR_MESSAGE);
	                    typedText = null;
	                    txtFldInput.requestFocusInWindow();
	                } else {
	                	// text was valid
	                	txtFldInput.setText(null);
	                    setVisible(false);
	                    
	                    // scan command
	                    sc.acquireInputFromUser(typedText);
	                }
	            }
	        }
	}

}
