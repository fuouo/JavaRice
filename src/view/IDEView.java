package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.BadLocationException;

import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.CompletionProviderBase;
import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.autocomplete.ShorthandCompletion;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxScheme;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.folding.CurlyFoldParser;
import org.fife.ui.rsyntaxtextarea.folding.FoldParserManager;
import org.fife.ui.rtextarea.RTextScrollPane;

import controller.Console;
import controller.ControllerInterface;
import view.consolepanels.ErrorPanel;
import view.consolepanels.MessagePanel;
import view.consolepanels.PrintPanel;
import view.factory.ConsolePanelFactory;
import view.factory.ConsoleType;

public class IDEView extends ViewInterface{

	private final int FRAME_WIDTH = 1024;
	private final int FRAME_HEIGHT = 720;
	
	private view.factory.Panel consolePanel;
	private ConsolePanelFactory consoleFactory;
	private JPanel contentPane;
	
	private JFrame myView;

	private ControllerInterface controller;
	
	//INSERT AFTER THIS PART GLOBAL UI ELEMENTS
	JTextPane codeTextPane, lineNumberPane;
	RSyntaxTextArea codeTextArea;
	JTabbedPane consoleTabPane;
	/*
	 private static final String text = "public class ExampleSource {\n\n"
	         + "   // Check out the crazy modified styles!\n"
	         + "   public static void main(String[] args) {\n"
	         + "      System.out.println(\"Hello, world!\");\n" + "   }\n\n"
	         + "}\n";
	 */
	 private static final String text = "public class Main {"
	 		+ "\n\t\n"
	 		+ "}";
	
	 private final String cursorMarker = "{cursor}";
	 
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
				Console.getInstance().clear();
				controller.runCode(codeTextArea.getText());
				codeTextArea.removeAllLineHighlights();
				// Console.getInstance().UpdateConsolePanel();
				//call compiler from here
			}
		});
		headerPanel.add(btnRun);
		btnRun.setBounds(FRAME_WIDTH - 150, 20, 100, 30);
		
		
		//=========== RSyntaxTextAreaPane ============= //
		codeTextArea = new RSyntaxTextArea(20, 60);
		//codeTextArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
	
		// === Syntax Highlighting === //
		AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory)TokenMakerFactory.getDefaultInstance();
		atmf.putMapping("text/javaRice", "model.javarice.token.JavaRiceTokenMaker");
		codeTextArea.setSyntaxEditingStyle("text/javaRice");
		FoldParserManager.get().addFoldParserMapping("text/javaRice", new CurlyFoldParser());
		//changeStyleProgrammatically();
		codeTextArea.setCodeFoldingEnabled(true);
		
		SyntaxScheme scheme = codeTextArea.getSyntaxScheme();
		scheme.getStyle(Token.RESERVED_WORD).foreground = scheme.getStyle(Token.RESERVED_WORD).foreground = scheme.getStyle(Token.RESERVED_WORD).foreground;
		// === SyntaxHighlighting === //
		
		// === Code Templates === //    
	    CompletionProvider provider = createCompletionProvider();
	    ((CompletionProviderBase) provider).setAutoActivationRules(true, null);
	    AutoCompletion ac = new AutoCompletion(provider);
	    ac.setAutoActivationEnabled(true); //removes the need to input ctrl+space for autocomplete
	    ac.setAutoCompleteSingleChoices(false); //single choices are not automatically inputted
	    ac.setAutoActivationDelay(0); //no delay

	    ac.install(codeTextArea);
	  
	    
	    codeTextArea.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyReleased(KeyEvent e) {
	        	
	        	try{
	        		codeTextArea.setCaretPosition(codeTextArea.getText().indexOf(cursorMarker));
	        		int caretPos = codeTextArea.getCaretPosition();
	        		String start = codeTextArea.getText().substring(0, codeTextArea.getCaretPosition());
	        		String end = codeTextArea.getText().substring(codeTextArea.getCaretPosition() + cursorMarker.length(),codeTextArea.getText().length());
	        		codeTextArea.setText(start + end);
	        		codeTextArea.setCaretPosition(caretPos);
	        	}
	        	catch(Exception ex){
	        		
	        	}
	        	
	        	/*
	        	if(e.getKeyChar() == '(' || e.getKeyChar() == '"' || e.getKeyChar() == '\''){
	        		String ch = e.getKeyChar() + "";
	        		if(ch.equals("("))
	        			ch = ")";
	        		int caretPos = codeTextArea.getCaretPosition();
	        		String start = codeTextArea.getText().substring(0, codeTextArea.getCaretPosition());
	        		String end = codeTextArea.getText().substring(codeTextArea.getCaretPosition()+1, codeTextArea.getText().length());
	        		codeTextArea.setText(start + ch + "\n" + end);
	        		codeTextArea.setCaretPosition(caretPos);
	        	}
	        	*/
	        	if(e.getKeyChar() == '~'){
	        		//TODO: This is for debug. Please remove this after :) 
	        		ac.doCompletion();
	        	}
	        }
	     });
	    
	    ac.setTriggerKey(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, InputEvent.CTRL_DOWN_MASK));
	    
	    
	    // === END of Code Templates === //
		
		codeTextArea.setHighlightCurrentLine(false);
		
		//customize RSyntaxTextArea
		codeTextArea.setText(text);
		codeTextArea.setFont(new Font("Consolas", Font.PLAIN, 16));
		codeTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
		codeTextArea.setBounds(0, 0, 800, FRAME_HEIGHT);
						
		//add RSyntaxTextArea to Scroll
		RTextScrollPane sp = new RTextScrollPane(codeTextArea);
		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setBounds(5, 75, FRAME_WIDTH-15, FRAME_HEIGHT/2);
		sp.setBorder(null);
		contentPane.add(sp);
		
		
		//=========== CONSOLE PANEL ========== //
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(0, FRAME_HEIGHT/2 + 80, FRAME_WIDTH, FRAME_HEIGHT/2 - 80);
		contentPane.add(bottomPanel);
		bottomPanel.setLayout(new GridLayout(1, 1));
		bottomPanel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));

		
		//=========== TABS FOR CONSOLE ========//
		consoleTabPane = new JTabbedPane();
		consoleTabPane.setBorder(new EmptyBorder(2, 20, 50, 20));
		MessagePanel messagePanel = new MessagePanel(ConsoleType.TOKENS, controller);
		JComponent messageTab = (JComponent) messagePanel;
		consoleTabPane.addTab("DEBUG", messageTab);
		ErrorPanel errorPanel = new ErrorPanel(ConsoleType.ERRORS, controller);
		JComponent errorTab = (JComponent) errorPanel;
		consoleTabPane.addTab("ERRORS", errorTab);
		PrintPanel printPanel = new PrintPanel(ConsoleType.PRINT, controller);
		JComponent printTab = (JComponent) printPanel;
		consoleTabPane.addTab("PRINT", printTab);
		bottomPanel.add(consoleTabPane);
	
		//NO MORE CODE AFTER HERE PLEASE :)
		Console.getInstance().setConsoleTabPane(consoleTabPane);
		Console.getInstance().setMessagePanel(messagePanel);
		Console.getInstance().setErrorPanel(errorPanel);
		Console.getInstance().setPrintPanel(printPanel);
		myView.setVisible(true);
		myView.setResizable(false);
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
	
	
	public void moveCareToLine(int line){
		try {
			int index = codeTextArea.getLineStartOffset(line-1);
			codeTextArea.setCaretPosition(index);
			codeTextArea.requestFocus();
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void highlightLine(int line, Color color){
		try {
			codeTextArea.addLineHighlight(line-1, color);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clearLineHighlights() {
		codeTextArea.removeAllLineHighlights();
	}
	
	
	
	/**
    * Create a simple provider that adds some Java-related completions.
    */
   private CompletionProvider createCompletionProvider() {

      // A DefaultCompletionProvider is the simplest concrete implementation
      // of CompletionProvider. This provider has no understanding of
      // language semantics. It simply checks the text entered up to the
      // caret position for a match against known completions. This is all
      // that is needed in the majority of cases.
      DefaultCompletionProvider provider = new DefaultCompletionProvider();

      // Add completions for all Java keywords. A BasicCompletion is just
      // a straightforward word completion.
      
      //PRIMITIVE TYPES
      provider.addCompletion(new BasicCompletion(provider, "_boolean"));
      provider.addCompletion(new BasicCompletion(provider, "_char"));
      provider.addCompletion(new BasicCompletion(provider, "_byte"));
      provider.addCompletion(new BasicCompletion(provider, "_short"));
      provider.addCompletion(new BasicCompletion(provider, "_int"));
      provider.addCompletion(new BasicCompletion(provider, "_long"));
      provider.addCompletion(new BasicCompletion(provider, "_float"));
      provider.addCompletion(new BasicCompletion(provider, "_double"));
      provider.addCompletion(new BasicCompletion(provider, "_String"));
      // ... etc ...
     
      // Add a couple of "shorthand" completions. These completions don't
      // require the input text to be the same thing as the replacement text.
      provider.addCompletion(new ShorthandCompletion(provider, "wf", "write(" + cursorMarker + ");","write();"));
      provider.addCompletion(new ShorthandCompletion(provider, "wlnf", "writeln(" + cursorMarker + ");","writeln();"));
      provider.addCompletion(new ShorthandCompletion(provider, "rf", "read(" + cursorMarker + ");","read();"));
      provider.addCompletion(new ShorthandCompletion(provider, "mainf", "public _void main(){\n\t\t" + cursorMarker + "\n\t}", "\tpublic _void main(){}"));
      provider.addCompletion(new ShorthandCompletion(provider, "floop", "for (_int i = 0; i < " + cursorMarker + "; i ++){\n\t\t\t\n\t\t}", "for (_int i=0; i< %_int%; i++){}"));

      return provider;

   }
}
