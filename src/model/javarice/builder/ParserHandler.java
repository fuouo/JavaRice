package model.javarice.builder;

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
	
	private static ParserHandler sharedInstance = null;
	
	public static ParserHandler getInstance() {
		if(sharedInstance == null) {
			sharedInstance = new ParserHandler();
		}
		
		return sharedInstance;
	}
	
	private JavaRiceLexer sharedLexer;
	private JavaRiceParser sharedParser;
	
	private String currentClassName; //the current class being parsed
	
	private ParserHandler() {
		
	}
	
	public void parseText(String className, String textToParse) {		
		this.sharedLexer = new JavaRiceLexer(new ANTLRInputStream(textToParse));
		CommonTokenStream tokens = new CommonTokenStream(this.sharedLexer);
		this.sharedParser = new JavaRiceParser(tokens);
		this.sharedParser.removeErrorListeners();
		this.sharedParser.addErrorListener(BuildChecker.getInstance());
		
		ParserRuleContext parserRuleContext = this.sharedParser.program();
		Console.log(LogType.DEBUG, parserRuleContext.toStringTree(this.sharedParser));
		
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(new JavaRiceBaseImplementor(), parserRuleContext);

		Console.log(LogType.VERBOSE, "Finished parsing. Compiled executables. Click RUN to execute");
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

}
