package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultHighlighter;

import controller.ControllerInterface;
import view.consolepanels.ErrorPanel;
import view.consolepanels.MessagePanel;
import view.factory.ConsolePanelFactory;
import view.factory.ConsoleType;
import view.factory.Panel;

public class IDEView extends ViewInterface{

	private final int FRAME_WIDTH = 1024;
	private final int FRAME_HEIGHT = 1024;
	
	private view.factory.Panel consolePanel;
	private ConsolePanelFactory consoleFactory;
	private JPanel contentPane;
	
	private JFrame myView;

	private ControllerInterface controller;
	
	//INSERT AFTER THIS PART GLOBAL UI ELEMENTS
	JTextPane codeTextPane, lineNumberPane;
	JTabbedPane consoleTabPane;
	
	public IDEView(){
	}
	@Override
	public void initGUI() {
		
		myView = new JFrame("JavaRice - <FileName> - BestBtches IDE");
		myView.setBounds(100, 0, FRAME_WIDTH, FRAME_HEIGHT);
		myView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		myView.setContentPane(contentPane);
		contentPane.setLayout(null);

		
		
		//=========== PANEL FOR HEADER (FOR BUTTONS) ==========
		JPanel headerPanel = new JPanel();
		headerPanel.setBounds(0, 0, FRAME_WIDTH, 70);
		contentPane.add(headerPanel);
		headerPanel.setLayout(null);
		headerPanel.setBackground(Color.WHITE);
		headerPanel.setBorder(new MatteBorder(0, 0, 1, 0,
				(Color) Color.LIGHT_GRAY));
		
		//=========== BUTTON FOR RUNNING THE CODE ========== //
		JButton btnRun = new JButton("RUN");
		btnRun.setBackground(new Color(20, 200, 30));
		btnRun.setForeground(Color.white);
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("[MAIN] ... Running the code!!");
				
				highlightLine(0, codeTextPane.getText().length(), Color.white);
				controller.runCode(codeTextPane.getText());
				UpdateConsolePanel();
				//call compiler from here
			}
		});
		headerPanel.add(btnRun);
		btnRun.setBounds(FRAME_WIDTH - 150, 20, 100, 30);
		
		
		//=========== TEXT PANE FOR CODE ========== //
		codeTextPane = new JTextPane();
		codeTextPane.setFont(new Font("Consolas", Font.PLAIN, 16));
		codeTextPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		codeTextPane.setText("//Code by Best B*tches\r\n//Insert Code Here\r\n\r\npublic class Main{\r\n//insert code here\r\n}");
		codeTextPane.setBounds(0, 0, 800, FRAME_HEIGHT);
		
		JScrollPane codeScrollPane = new JScrollPane(codeTextPane);
		codeScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		codeScrollPane.setBounds(50, 75, FRAME_WIDTH-70, FRAME_HEIGHT/2);
		codeScrollPane.setBorder(null);
		contentPane.add(codeScrollPane);

		lineNumberPane = new JTextPane();
		lineNumberPane.setBorder(new EmptyBorder(10, 3, 0, 3));
		lineNumberPane.setBackground(Color.white);
		lineNumberPane.setEditable(false);
		lineNumberPane.setText("1\r\n2\r\n3");
		lineNumberPane.setFont(new Font("Consolas", Font.PLAIN, 16));
		lineNumberPane.setBounds(25, 75, 25, FRAME_HEIGHT/2);
		//contentPane.add(lineNumberPane);
		
		JScrollPane lineNumberScrollPane = new JScrollPane(lineNumberPane);
		lineNumberScrollPane.setBounds(25, 75, 25, FRAME_HEIGHT/2);
		lineNumberScrollPane.setBorder(null);
		lineNumberScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		lineNumberScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		contentPane.add(lineNumberScrollPane);
		
		
		
		//=========== CONSOLE PANEL ========== //
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(0, FRAME_HEIGHT/2 + 80, FRAME_WIDTH, FRAME_HEIGHT/2 - 80);
		contentPane.add(bottomPanel);
		bottomPanel.setLayout(new GridLayout(1, 1));
		bottomPanel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		//insert more ui elements here
		
		//=========== TABS FOR CONSOLE ========//
		consoleTabPane = new JTabbedPane();
		consoleTabPane.setBorder(new EmptyBorder(2, 20, 50, 20));
		JComponent messageTab = (JComponent) new MessagePanel(ConsoleType.TOKENS, controller);
		consoleTabPane.addTab("Console", messageTab);
		JComponent errorTab = (JComponent) new ErrorPanel(ConsoleType.ERRORS, controller);
		consoleTabPane.addTab("Error/s", errorTab);
		bottomPanel.add(consoleTabPane);
		
		consoleTabPane.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				UpdateConsolePanel();
			}
			
		});
	
		//NO MORE CODE AFTER HERE PLEASE :)
		//setPanel(ConsoleType.ERRORS);
		UpdateConsolePanel();
		addActionListeners();
		myView.setVisible(true);
		myView.setResizable(false);
	}

	public void UpdateConsolePanel(){
		view.factory.Panel activePanel = (view.factory.Panel)consoleTabPane.getSelectedComponent();
		
		ArrayList<Object> list = null;
		if(activePanel.getId() == ConsoleType.TOKENS){
			System.out.println("SHOWING TOKENS");
			list = controller.getMessages("");
		}else if(activePanel.getId() == ConsoleType.ERRORS){
			System.out.println("SHOWING ERRORS");
			list = controller.getErrors("");
		}
		System.out.println(list);
		
		activePanel.displayItems(list);
	}
	
	@Override
	public void update() {
		
	}
	
	
	@Override
	public void setController(ControllerInterface c) {
		controller = c;
		initGUI();
	}

	public void setPanel(ConsoleType prev) {
		try {
			if (consolePanel != null)
				contentPane.remove(consolePanel);
			// contentPane.remove(previewPanel);
			consolePanel = consoleFactory.choosePanel(prev, controller, this);
			consolePanel.setBounds(244, 43, 550, 550);
			contentPane.add(consolePanel);
			consolePanel.setBackground(Color.white);
			consolePanel.revalidate();
			consolePanel.repaint();

			consolePanel.printAll(consolePanel.getGraphics());
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "error");
		}
		update();
	}
	
	private void addActionListeners(){
	
		codeTextPane.addKeyListener(new KeyListener(){
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				setLineNumber();
				// TODO Auto-generated method stub
				//if(key == KeyEvent.VK_ENTER || key == KeyEvent.VK_BACK_SPACE){
				//	
				//}
				DefaultCaret caret = (DefaultCaret)lineNumberPane.getCaret();
				caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
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
		
		Panel errorPanel = ((Panel)consoleTabPane.getComponent(1));
		JScrollPane scrollErrorPanel = (JScrollPane)errorPanel.getComponent(0);
		
	}
	
	public void highlightLine(int start, int end, Color color){
		
		DefaultHighlighter.DefaultHighlightPainter highlightPainter = 
		        new DefaultHighlighter.DefaultHighlightPainter(color);
		    try {
		    	
		    	System.out.println(start + " = " + end);
		    	
				lineNumberPane.getHighlighter().addHighlight(start, end, highlightPainter);
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
	

}
