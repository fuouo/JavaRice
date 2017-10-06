import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
	
	public static void traverseTree( ParseTree tree, ExprParser parser) {
		
		// traverse children
		int childcount = tree.getChildCount();
		if(childcount == 0) {
			// leaf node, we're done
			System.out.println(tree.getText());
		} else {
			for( int i = 0; i < childcount; i ++ ) {
				ParseTree child = tree.getChild(i);
				traverseTree(child, parser);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//EXPR 
		/*
		CharStream firstInput = new ANTLRInputStream("100+2*34\n");
		
		ExprLexer lexer = new ExprLexer( firstInput);
	    CommonTokenStream tokens = new CommonTokenStream( lexer );
	    ExprParser parser = new ExprParser( tokens );
	    ParseTree tree = parser.prog();
	    ParseTreeWalker walker = new ParseTreeWalker();
	    walker.walk( new AntlrExprListener(), tree );
		*/
		
		
		//MALAPIT NAAAAAAAAAAAAA
		// Create an input stream that receives text from the terminal
		ANTLRInputStream input = new ANTLRInputStream(System.in);

		// Create an Lexer that receives the char stream
		ExprLexer lexer = new ExprLexer(input);

		// Create a token stream from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Create a parser that receives the token stream
		ExprParser parser = new ExprParser(tokens);
		parser.setBuildParseTree(true);
		
		// Create a parser tree starting from the first rule
		ExprParser.ProgContext tree = parser.prog();

		//print all words encountered
		traverseTree(tree, parser);
		
		System.out.println("Token: ");
		for(int i=0; i<parser.getVocabulary().getMaxTokenType(); i++){
			System.out.println("[" + i + "]" + parser.getVocabulary().getDisplayName(i));
		}
		
		//print all tokens
		MyTokenFactory factory = new MyTokenFactory(input);
		lexer.setTokenFactory(factory);
		tokens.fill();
		List<Token> alltokens = tokens.getTokens();
		for(int i=0; i<alltokens.size(); i++){
			Token t = alltokens.get(i);
			System.out.print(t.toString() + " = " + "\n");
			
		}
			/*
		for (Token t : alltokens){
			System.out.print(t.toString());
			System.out.println(" - " + parser.getTokenNames());
			for(int j=0; j<parser.getTokenNames())
		}*/
		
		parser.setTokenFactory(factory);
		ParseTree t = parser.prog();

		System.out.println(tree.toStringTree(parser));
		System.out.println(t.toStringTree(parser));
		
		
		
		
		
		///////////////////////////////100
		//Generates the PARSER TREE UI
		//Trees.inspect(tree, parser);
		
		//UI
		//MainFrame mf= new MainFrame();
		//mf.setPane(new LayoutOne());
		
	}

}
