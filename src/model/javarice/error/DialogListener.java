package model.javarice.error;

import java.awt.Color;
import java.awt.Container;
import java.util.Collections;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class DialogListener extends BaseErrorListener {
	
	public static final DialogListener INSTANCE = new DialogListener();
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		// TODO Auto-generated method stub
		
		List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
		Collections.reverse(stack);
		StringBuilder buf = new StringBuilder();
		buf.append("rule stack: " + stack);
		buf.append("line " + line + ":" + charPositionInLine + " at " + offendingSymbol + ": " + msg);
		
		JDialog dialog = new JDialog();
		Container contentpane = dialog.getContentPane();
		contentpane.add(new JLabel(buf.toString()));
		contentpane.setBackground(Color.white); 
		dialog.setTitle("Syntax error"); 
		dialog.pack(); 
		dialog.setLocationRelativeTo(null); 
		dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		dialog.setVisible(true);

	}

}
