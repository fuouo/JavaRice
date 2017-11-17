package model.javarice.execution.commands.simple;

import model.javarice.execution.commands.ICommand;
import model.javarice.generatedexp.JavaRiceLexer;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.semantics.mapping.IValueMapper;
import model.javarice.semantics.mapping.IdentifierMapper;
import model.javarice.semantics.representations.JavaRiceValue;
import model.javarice.semantics.representations.JavaRiceValue.PrimitiveType;

public class IncDecCommand implements ICommand {
	
	private ExpressionContext expressionContext;
	private int tokenSign;
	
	public IncDecCommand(ExpressionContext expressionContext, int tokenSign) {
		this.expressionContext = expressionContext;
		this.tokenSign = tokenSign;
	}

	@Override
	public void execute() {
		
		IValueMapper leftHandMapper = new IdentifierMapper(this.expressionContext.getText());
		leftHandMapper.analyze(this.expressionContext);
		
		JavaRiceValue javaRiceValue = leftHandMapper.getJavaRiceValue();
		
		this.performOperation(javaRiceValue);
	}
	
	/*
	 * Attempts to perform an increment/decrement operation
	 */
	private void performOperation(JavaRiceValue javaRiceValue) {
		if(javaRiceValue.getPrimitiveType() == PrimitiveType.INT) {
			int value = Integer.valueOf(javaRiceValue.getValue().toString());
			
			if(this.tokenSign == JavaRiceLexer.INC) {
				value++;
			} else if(this.tokenSign == JavaRiceLexer.DEC) {
				value--;
			}

			javaRiceValue.setValue(String.valueOf(value));
		} else if(javaRiceValue.getPrimitiveType() == PrimitiveType.LONG) {
			long value = Long.valueOf(javaRiceValue.getValue().toString());
			
			if(this.tokenSign == JavaRiceLexer.INC) {
				value++;
			} else if(this.tokenSign == JavaRiceLexer.DEC) {
				value--;
			}

			javaRiceValue.setValue(String.valueOf(value));
		} else if(javaRiceValue.getPrimitiveType() == PrimitiveType.SHORT) {
			short value = Short.valueOf(javaRiceValue.getValue().toString());
			
			if(this.tokenSign == JavaRiceLexer.INC) {
				value++;
			} else if(this.tokenSign == JavaRiceLexer.DEC) {
				value--;
			}

			javaRiceValue.setValue(String.valueOf(value));
		} else if(javaRiceValue.getPrimitiveType() == PrimitiveType.FLOAT) {
			float value = Float.valueOf(javaRiceValue.getValue().toString());
			
			if(this.tokenSign == JavaRiceLexer.INC) {
				value++;
			} else if(this.tokenSign == JavaRiceLexer.DEC) {
				value--;
			}

			javaRiceValue.setValue(String.valueOf(value));
		} else if(javaRiceValue.getPrimitiveType() == PrimitiveType.DOUBLE) {
			double value = Double.valueOf(javaRiceValue.getValue().toString());
			
			if(this.tokenSign == JavaRiceLexer.INC) {
				value++;
			} else if(this.tokenSign == JavaRiceLexer.DEC) {
				value--;
			}

			javaRiceValue.setValue(String.valueOf(value));
		}
	}

}
