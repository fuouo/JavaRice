package controller;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import model.MyTokenFactory;
import model.javarice.JavaRiceLexer;
import model.javarice.JavaRiceParser;
import model.symboltable.STRow;

public class JavaRiceCompiler {
	
	private ArrayList<STRow> symbolTable;
	
	public ArrayList<STRow> getSymbolTable() {
		return symbolTable;
	}

	public void setSymbolTable(ArrayList<STRow> symbolTable) {
		this.symbolTable = symbolTable;
	}

	public JavaRiceCompiler(){
		symbolTable = new ArrayList<STRow>();
	}
	
	public void compile(String code){
		symbolTable = new ArrayList<STRow>();
		walkCode(code);
	}
	
	void walkCode(String code){
		//Code
		ANTLRInputStream input = new ANTLRInputStream(code);
		
		// Create an Lexer that receives the char stream
		JavaRiceLexer lexer = new JavaRiceLexer(input);
	
		// Create a token stream from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
	
		// Create a parser that receives the token stream
		JavaRiceParser parser = new JavaRiceParser(tokens);
		parser.setBuildParseTree(true);
		
		// Create a parser tree starting from the first rule
		JavaRiceParser.ProgramContext tree = parser.program();
		
		//print all tokens of the input
		MyTokenFactory factory = new MyTokenFactory(input);
		lexer.setTokenFactory(factory);
		tokens.fill();
		List<Token> alltokens = tokens.getTokens();
		for(int i=0; i<alltokens.size(); i++){
			STRow stRow = new STRow();
			
			Token t = alltokens.get(i); //get token of input
			System.out.print(t.getText() + " = "); //print code word
			stRow.setLexeme(t.getText());
			
			//Getting token index
			String str[] = t.toString().split(",<"); 
			String temp[] = str[1].split(">");
			int index = Integer.parseInt(temp[0]);
			
			
			//Getting token name 
			String tok = parser.getVocabulary().getDisplayName(index);
			if(tok.contains("'"));
				tok = parser.getVocabulary().getSymbolicName (index);
			stRow.setTokenId(tok);
			
			System.out.println("Token: " + tok); //print code word respective token
			
			symbolTable.add(stRow);
		}
		
		System.out.println(tree.toStringTree(parser));
		
	}
	
	void PrintAllTokens(JavaRiceParser parser){
		//print all tokens of the grammar (just for reference)
		System.out.println("Token: ");
		for(int i=0; i<parser.getVocabulary().getMaxTokenType(); i++){
			System.out.println("[" + i + "]" + parser.getVocabulary().getLiteralName(i) + " / " + parser.getVocabulary().getSymbolicName(i));
		}
	}
	
}
