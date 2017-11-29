package model.javarice.builder;

import java.util.ArrayList;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import controller.Console;
import controller.Console.LogType;
import model.javarice.generatedexp.JavaRiceLexer;
import model.javarice.generatedexp.JavaRiceParser;
import model.javarice.semantics.implementors.JavaRiceBaseImplementor;

public class ParserHandler {
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	
	private static ParserHandler sharedInstance = null;
	
	public static ParserHandler getInstance() {
		if(sharedInstance == null) {
			sharedInstance = new ParserHandler();
		}
		
		return sharedInstance;
	}
	
	//This is for debug environment (watch & breakpoints)
	private ArrayList<String> lines;
	private ArrayList<Integer> breakpoints;
	
	private JavaRiceLexer sharedLexer;
	private JavaRiceParser sharedParser;
	
	private String currentClassName; //the current class being parsed
	
	private ParserHandler() {
		
	}
	
	public void parseText(String textToParse) {		
		
		lines = new ArrayList<String>();
		breakpoints = new ArrayList<Integer>();
		breakpoints.add(3);
		
		this.sharedLexer = new JavaRiceLexer(new ANTLRInputStream(textToParse));
		CommonTokenStream tokens = new CommonTokenStream(this.sharedLexer);
		this.sharedParser = new JavaRiceParser(tokens);
		this.sharedParser.removeErrorListeners();
		this.sharedParser.addErrorListener(BuildChecker.getInstance());
		
		ParserRuleContext parserRuleContext = this.sharedParser.compilationUnit();
		//Console.log(LogType.DEBUG, TAG + parserRuleContext.toStringTree(this.sharedParser));
		
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(new JavaRiceBaseImplementor(), parserRuleContext);

		Console.log(LogType.VERBOSE, TAG + "Finished parsing. Compiled executables. Click RUN to execute");

		//TODO: for Debug. Please remove after. This shows the parsetree
		Trees.inspect(parserRuleContext, this.sharedParser);
	}
	
	/*
	 * Sets the class name being parsed
	 */
	public void setCurrentClassName(String className) {
		this.currentClassName = className;
	}
	
	/*
	 * Returns the class name being parsed
	 */
	public String getCurrentClassName() {
		return this.currentClassName;
	}
	
	public ArrayList<String> getLineCode(){
		return lines;
	}
	
	public void addLineCode(String code){
		lines.add(code);
	}
	
	public ArrayList<Integer> getBreakpoints(){
		return breakpoints;
	}

}
