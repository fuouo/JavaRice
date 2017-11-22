package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.BadLocationException;

import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.autocomplete.ShorthandCompletion;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.CodeTemplateManager;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.folding.CurlyFoldParser;
import org.fife.ui.rsyntaxtextarea.folding.FoldParserManager;
import org.fife.ui.rsyntaxtextarea.templates.CodeTemplate;
import org.fife.ui.rsyntaxtextarea.templates.StaticCodeTemplate;
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
	 private static final String text = "//Code by Best B*tches\n"
	 		+ "//Insert Code Here\n\n"
	 		+ "public class Main{"
	 		+ "\n//insert code here\n"
	 		+ "}";
	
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
		// === SyntaxHighlighting === //
		
		// === Code Templates === //
		RSyntaxTextArea.setTemplatesEnabled(true);
		CodeTemplateManager ctm = RSyntaxTextArea.getCodeTemplateManager();
		CodeTemplate ct = new StaticCodeTemplate("wr", "write(",");");
	    ctm.addTemplate(ct);
	    
	    // A CompletionProvider is what knows of all possible completions, and
	    // analyzes the contents of the text area at the caret position to
	    // determine what completion choices should be presented. Most instances
	    // of CompletionProvider (such as DefaultCompletionProvider) are designed
	    // so that they can be shared among multiple text components.
	    CompletionProvider provider = createCompletionProvider();

	    // An AutoCompletion acts as a "middle-man" between a text component
	    // and a CompletionProvider. It manages any options associated with
	    // the auto-completion (the popup trigger key, whether to display a
	    // documentation window along with completion choices, etc.). Unlike
	    // CompletionProviders, instances of AutoCompletion cannot be shared
	    // among multiple text components.
	    AutoCompletion ac = new AutoCompletion(provider);
	    ac.install(codeTextArea);
	    
	 // === Code Templates === //
		
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
	      provider.addCompletion(new BasicCompletion(provider, "abstract"));
	      provider.addCompletion(new BasicCompletion(provider, "assert"));
	      provider.addCompletion(new BasicCompletion(provider, "break"));
	      provider.addCompletion(new BasicCompletion(provider, "case"));
	      // ... etc ...
	      provider.addCompletion(new BasicCompletion(provider, "transient"));
	      provider.addCompletion(new BasicCompletion(provider, "try"));
	      provider.addCompletion(new BasicCompletion(provider, "void"));
	      provider.addCompletion(new BasicCompletion(provider, "volatile"));
	      provider.addCompletion(new BasicCompletion(provider, "while"));

	      // Add a couple of "shorthand" completions. These completions don't
	      // require the input text to be the same thing as the replacement text.
	      provider.addCompletion(new ShorthandCompletion(provider, "sysout",
	            "System.out.println(", "System.out.println("));
	      provider.addCompletion(new ShorthandCompletion(provider, "syserr",
	            "System.err.println(", "System.err.println("));

	      return provider;

	   }
}
