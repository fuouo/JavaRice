package view;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;

import controller.JavaRiceCompiler;

import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;

public class LayoutOne extends JPanel {

	
	JavaRiceCompiler cmpController;
	
	JButton btnRun;
	JTextPane codeTextPane;
	JTextPane consoleTextPane;
	
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
		
		JTextPane consoleTextPane = new JTextPane();
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
		consoleScrollPane.setBackground(Color.WHITE);
		add(consoleScrollPane, BorderLayout.EAST);

		addActionListeners();
	}
	
	private void addActionListeners(){
		
		btnRun.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}
}
