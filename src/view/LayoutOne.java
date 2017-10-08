package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.Utilities;

import controller.JavaRiceCompiler;
import model.symboltable.STRow;
import java.awt.Rectangle;

public class LayoutOne extends JPanel {
	JavaRiceCompiler cmpController;
	
	JButton btnRun;
	JTextPane codeTextPane;
	JTextPane consoleTextPane;
	JTextPane lineNumberPane;
	
	JPanel consolePanel;
	
	String code;
	
	/**
	 * Create the panel.
	 */
	public LayoutOne() {
		cmpController = new JavaRiceCompiler();
		
		setLayout(new BorderLayout(0, 0));
		
		consolePanel = new JPanel();
		consolePanel.setBackground(Color.WHITE);
		add(consolePanel, BorderLayout.SOUTH);
		consolePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel toolPanel = new JPanel();
		toolPanel.setBorder(new EmptyBorder(5, 5, 5, 100));
		toolPanel.setFont(new Font("Consolas", Font.PLAIN, 13));
		toolPanel.setBackground(Color.WHITE);
		consolePanel.add(toolPanel, BorderLayout.NORTH);
		toolPanel.setLayout(new BorderLayout(0, 0));
		
		btnRun = new JButton("\r\nRun");
		btnRun.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRun.setFont(new Font("Consolas", Font.PLAIN, 16));
		btnRun.setBackground(Color.WHITE);
		toolPanel.add(btnRun, BorderLayout.WEST);
		
		JLabel lblConsole = new JLabel("[Console]");
		lblConsole.setFont(new Font("Consolas", Font.PLAIN, 16));
		toolPanel.add(lblConsole);
		lblConsole.setBorder(new EmptyBorder(10, 10, 10, 100));
		lblConsole.setBackground(Color.WHITE);
		
		consoleTextPane = new JTextPane();
		consoleTextPane.setEditable(false);
		consoleTextPane.setForeground(Color.RED);
		consoleTextPane.setFont(new Font("Consolas", Font.PLAIN, 16));
		consoleTextPane.setBorder(new EmptyBorder(15, 15, 15, 15));
		consolePanel.add(consoleTextPane);
		
		JPanel codePanel = new JPanel();
		codePanel.setBackground(Color.WHITE);
		codePanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		add(codePanel, BorderLayout.CENTER);
		codePanel.setLayout(new BorderLayout(0, 0));
		
		codeTextPane = new JTextPane();
		codeTextPane.setFont(new Font("Consolas", Font.PLAIN, 16));
		codePanel.add(codeTextPane, BorderLayout.CENTER);
		codeTextPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		codeTextPane.setText("//Code by Best B*tches\r\n//Insert Code Here\r\n//");
		
		JScrollPane codeScrollPane = new JScrollPane(codePanel);
		
		lineNumberPane = new JTextPane();
		lineNumberPane.setBorder(new EmptyBorder(10, 3, 0, 3));
		lineNumberPane.setBackground(SystemColor.controlHighlight);
		lineNumberPane.setEditable(false);
		lineNumberPane.setText("1\r\n2\r\n3");
		lineNumberPane.setFont(new Font("Consolas", Font.PLAIN, 16));
		codePanel.add(lineNumberPane, BorderLayout.WEST);
		add(codeScrollPane, BorderLayout.CENTER);
		
		JScrollPane consoleScrollPane = new JScrollPane(consolePanel);
		consoleScrollPane.setBackground(Color.WHITE);
		add(consoleScrollPane, BorderLayout.EAST);

		addActionListeners();
	}
	
	private int getLineNumber(){
		return codeTextPane.getText().split("\n").length;
	}
	
	private void setLineNumber(){
		String lineNumbers = "";
		for(int i=0; i<getLineNumber(); i++){
			lineNumbers += (i+1) + "\r\n";
			
		}
		lineNumberPane.setText(lineNumbers);
	}
	
	private void addActionListeners(){
		
		codeTextPane.addKeyListener(new KeyListener(){
			
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				// TODO Auto-generated method stub
				if(key == KeyEvent.VK_ENTER || key == KeyEvent.VK_BACK_SPACE){
					setLineNumber();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btnRun.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				cmpController.compile(codeTextPane.getText());
				
				//setting console text
				
				String console = "Lexeme = Token\n---\n";
				consoleTextPane.setText(console);
				System.out.println("CONSOLE: " + console);
				ArrayList<STRow> symbolTable = cmpController.getSymbolTable();
				for(int i=0; i<symbolTable.size(); i++){
					console += symbolTable.get(i).getLexeme() + " = " + symbolTable.get(i).getTokenId();
					console+= "\n";
				}
				consoleTextPane.setText(console);
			}
			
		});
		
	}
}
