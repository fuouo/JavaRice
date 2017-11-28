package model.javarice.execution.commands.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import controller.Console;
import controller.Console.LogType;
import model.javarice.error.errorcheckers.UndeclaredChecker;
import model.javarice.execution.commands.ICommand;
import model.javarice.execution.commands.evaluation.EvaluationCommand;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.LiteralContext;
import model.javarice.generatedexp.JavaRiceParser.PrimaryContext;
import model.javarice.generatedexp.JavaRiceParser.StatementContext;
import model.javarice.semantics.representations.JavaRiceArray;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;
import model.javarice.semantics.representations.JavaRiceValueSearcher;
import model.javarice.semantics.utils.Expression;
import model.javarice.semantics.utils.StringUtils;

public class PrintCommand implements ICommand, ParseTreeListener{
	
	private final String TAG = this.getClass().getSimpleName() + ": ";
	private final Pattern functionPattern = Pattern.compile("([a-zA-Z0-9]+)\\(([ ,.a-zA-Z0-9]*)\\)");
	private final Pattern arrayPattern = Pattern.compile("([a-zA-Z0-9]+)\\[([ ,.+a-zA-Z0-9]*)\\]");
	
	private ExpressionContext expressionContext;
	
	private String strToPrint = "";
	private boolean complexExpr = false;
	private boolean arrayAccess = false;
	private boolean isLN = false;

	private List<Object> printExpr = new ArrayList<>();
	
	public PrintCommand(StatementContext sCtx) {
		
		isLN = sCtx.WRITELN() != null;
		
		this.expressionContext = sCtx.expression(0);
		
		UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.expressionContext);
		undeclaredChecker.verify();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, expressionContext);

		if(isLN) {
			this.strToPrint += "\n";
		}
		
		// log to console
		Console.log(LogType.VERBOSE, this.strToPrint);
		Console.log(LogType.PRINT, this.strToPrint);
		
		// rest statement to print
		this.strToPrint = "";
	}

	@Override
	public void enterEveryRule(ParserRuleContext context) {
		// TODO Auto-generated method stub
		
		if(context instanceof LiteralContext) {
			
			Console.log(LogType.DEBUG, TAG + "Literal detected!");
			
			LiteralContext literalContext = (LiteralContext) context;
			
			if(literalContext.StringLiteral() != null) {
				String quotedString = literalContext.StringLiteral().getText();
				
				this.strToPrint += StringUtils.removeQuotes(quotedString);
			}

			else if (literalContext.IntegerLiteral() != null) {
				ParserRuleContext prCtx = literalContext;

				// if it belongs to complex
				while(!(prCtx instanceof StatementContext)) {
					prCtx = prCtx.getParent();
					
					// if function
					if ( (prCtx.getText().startsWith("(") && prCtx.getText().endsWith(")") ) ||
                            functionPattern.matcher(prCtx.getText()).matches()) {
						break;
					}
					
					// if inside array
					if ( arrayPattern.matcher(prCtx.getText()).matches()) {
						break;
					}
				}

				// if it does not belong to complex
				if(prCtx instanceof StatementContext) {
					int value = Integer.parseInt(literalContext.IntegerLiteral().getText());
					this.strToPrint += value;

				}
			}

			else if (literalContext.FloatingPointLiteral() != null) {
				float value = Float.parseFloat(literalContext.FloatingPointLiteral().getText());
				this.strToPrint += value;
			}

			else if (literalContext.BooleanLiteral() != null) {
				this.strToPrint += literalContext.BooleanLiteral().getText();
			}

			else if (literalContext.CharacterLiteral() != null) {
				this.strToPrint += literalContext.CharacterLiteral().getText();
			}
		}

		else if(context instanceof ExpressionContext) {
			
			Console.log(LogType.DEBUG, TAG + "Expression detected!");
			
			try {
                Integer.parseInt(context.getText());
                return;
            }catch (NumberFormatException ex) {

            }
			
			ExpressionContext exprCtx = (ExpressionContext) context;
			
			ParserRuleContext prCtx = context;

			while(!(prCtx instanceof StatementContext)) {
				prCtx = prCtx.getParent();
				
				// if inside function
				if(prCtx.getText().endsWith("]") || functionPattern.matcher(prCtx.getText()).matches()) {
					break;
				}
				// if inside array
				if ( arrayPattern.matcher(prCtx.getText()).matches()) {
					break;
				}
			}

			if(prCtx instanceof StatementContext && 
					!context.getText().contains(("\"")) &&
					functionPattern.matcher(context.getText()).matches()) {
				try {
					EvaluationCommand evalComm = new EvaluationCommand(exprCtx);
					evalComm.execute();

					this.strToPrint += evalComm.getStringResult();
				} catch(ClassCastException | Expression.ExpressionException ex) {
					
				}
			}
		}
		
		else if(context instanceof PrimaryContext) {
			PrimaryContext primaryContext = (PrimaryContext) context;
			
			Console.log(LogType.DEBUG, TAG + "Primary detected!");
			
			if(primaryContext.expression() != null && !primaryContext.getText().contains("\"")) {				

				ParserRuleContext prCtx = primaryContext;

				// if it belongs to complex
				while(!(prCtx instanceof StatementContext) || prCtx.getText().equals(context.getText())) {

					if((prCtx.getText().startsWith("(") && prCtx.getText().endsWith(")")) &&
							!(prCtx.getText().equals(context.getText())))
						break;

					prCtx = prCtx.getParent();
				}	

				if(prCtx instanceof StatementContext || prCtx.getParent() instanceof StatementContext) {
					ExpressionContext expCtx = primaryContext.expression();

					this.complexExpr = true;
					Console.log(LogType.DEBUG, TAG + "Complex expression detected: " + expCtx.getText());

					EvaluationCommand evalComm = new EvaluationCommand(expCtx);
					evalComm.execute();

					this.strToPrint += evalComm.getStringResult();
				}
				
			}
			
			else if(primaryContext.Identifier() != null && !this.complexExpr) {
				String identifier = primaryContext.getText();
				
				JavaRiceValue value = JavaRiceValueSearcher.searchJavaRiceValue(identifier);
				
				if(value != null) {
					if(value.getPrimitiveType() == PrimitiveType.ARRAY) {
						this.arrayAccess = true;
						this.evaluateArrayPrint(value, primaryContext);
					} else if(this.arrayAccess == false) {
						this.strToPrint += value.getValue();
						printExpr.add(value.getValue());
					}
				}
				
			}

			else {
				this.complexExpr = false;
			}
			
		}
	}

	@Override
	public void exitEveryRule(ParserRuleContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}	
	
	public void evaluateArrayPrint(JavaRiceValue javaRiceValue, PrimaryContext primaryContext) {
		
		// move up and determine expression contexts
		ExpressionContext parentExpressionContext = (ExpressionContext) primaryContext.getParent().getParent();
		ExpressionContext arrayIndexExpressionContext = parentExpressionContext.expression(1);
		
		EvaluationCommand evaluationCommand = new EvaluationCommand(arrayIndexExpressionContext);
		evaluationCommand.execute();
		
		JavaRiceArray javaRiceArray = (JavaRiceArray) javaRiceValue.getValue();
		JavaRiceValue arrayJavaRiceValue = javaRiceArray.getValueAt(evaluationCommand.getResult().intValue());
		
		this.strToPrint += arrayJavaRiceValue.getValue().toString();
	}
	
	public String getStatementToPrint() {
		return this.strToPrint;
	}

}
