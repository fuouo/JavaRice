import java.io.IOException;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

import view.LayoutOne;
import view.MainFrame;

public class Main {
	
	public static void traverseTree( ParseTree tree, Parser parser) {
		
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

		///////////////////////////////
		//Generates the PARSER TREE UI
		//Trees.inspect(tree, parser);
		
		//UI
		MainFrame mf= new MainFrame();
		mf.setPane(new LayoutOne());
		
	}

}
