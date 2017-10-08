package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controller.JavaRiceCompiler;
import model.symboltable.STRow;
import javax.swing.ScrollPaneConstants;

public class LayoutOne extends JPanel {
	JavaRiceCompiler cmpController;
	
	JButton btnRun;
	JTextPane codeTextPane;
	JTextPane consoleTextPane;
	
	String code;
	
	/**
	 * Create the panel.
	 */
	public LayoutOne() {
		cmpController = new JavaRiceCompiler();
		
		setLayout(new BorderLayout(0, 0));
		
		JPanel consolePanel = new JPanel();
		consolePanel.setBackground(Color.WHITE);
		add(consolePanel, BorderLayout.SOUTH);
		consolePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel toolPanel = new JPanel();
		toolPanel.setFont(new Font("Consolas", Font.PLAIN, 13));
		toolPanel.setBackground(Color.WHITE);
		consolePanel.add(toolPanel, BorderLayout.NORTH);
		toolPanel.setLayout(new BorderLayout(0, 0));
		
		btnRun = new JButton("\r\nRun Code\r\n");
		btnRun.setFont(new Font("Consolas", Font.PLAIN, 16));
		btnRun.setBackground(Color.WHITE);
		btnRun.setMinimumSize(new Dimension(50, 25));
		btnRun.setMaximumSize(new Dimension(50, 25));
		btnRun.setPreferredSize(new Dimension(50, 50));
		toolPanel.add(btnRun, BorderLayout.NORTH);
		
		JLabel lblConsole = new JLabel("[Console]");
		lblConsole.setFont(new Font("Consolas", Font.PLAIN, 16));
		toolPanel.add(lblConsole, BorderLayout.CENTER);
		lblConsole.setBorder(new EmptyBorder(20, 10, 20, 200));
		lblConsole.setBackground(Color.WHITE);
		
		consoleTextPane = new JTextPane();
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
		codePanel.add(codeTextPane, BorderLayout.NORTH);
		codeTextPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		codeTextPane.setText("//Insert Code Here");
		
		JScrollPane codeScrollPane = new JScrollPane(codePanel);
		add(codeScrollPane, BorderLayout.CENTER);
		
		JScrollPane consoleScrollPane = new JScrollPane(consolePanel);
		consoleScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		consoleScrollPane.setBackground(Color.WHITE);
		add(consoleScrollPane, BorderLayout.EAST);

		addActionListeners();
	}
	
	private void addActionListeners(){
		
		btnRun.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				cmpController.compile(codeTextPane.getText());
				
				//setting console text
				consoleTextPane.setText("");
				String console = "Lexeme = Token\n---\n";
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
