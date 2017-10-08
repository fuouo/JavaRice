// Generated from JavaRice.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaRiceParser}.
 */
public interface JavaRiceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declaration(@NotNull JavaRiceParser.Local_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declaration(@NotNull JavaRiceParser.Local_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#for_init}.
	 * @param ctx the parse tree
	 */
	void enterFor_init(@NotNull JavaRiceParser.For_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#for_init}.
	 * @param ctx the parse tree
	 */
	void exitFor_init(@NotNull JavaRiceParser.For_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment(@NotNull JavaRiceParser.Variable_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment(@NotNull JavaRiceParser.Variable_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull JavaRiceParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull JavaRiceParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMember_declaration(@NotNull JavaRiceParser.Member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMember_declaration(@NotNull JavaRiceParser.Member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#shortcut_for_control}.
	 * @param ctx the parse tree
	 */
	void enterShortcut_for_control(@NotNull JavaRiceParser.Shortcut_for_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#shortcut_for_control}.
	 * @param ctx the parse tree
	 */
	void exitShortcut_for_control(@NotNull JavaRiceParser.Shortcut_for_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#for_control}.
	 * @param ctx the parse tree
	 */
	void enterFor_control(@NotNull JavaRiceParser.For_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#for_control}.
	 * @param ctx the parse tree
	 */
	void exitFor_control(@NotNull JavaRiceParser.For_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#par_expression}.
	 * @param ctx the parse tree
	 */
	void enterPar_expression(@NotNull JavaRiceParser.Par_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#par_expression}.
	 * @param ctx the parse tree
	 */
	void exitPar_expression(@NotNull JavaRiceParser.Par_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(@NotNull JavaRiceParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(@NotNull JavaRiceParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull JavaRiceParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull JavaRiceParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(@NotNull JavaRiceParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(@NotNull JavaRiceParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull JavaRiceParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull JavaRiceParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#for_update}.
	 * @param ctx the parse tree
	 */
	void enterFor_update(@NotNull JavaRiceParser.For_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#for_update}.
	 * @param ctx the parse tree
	 */
	void exitFor_update(@NotNull JavaRiceParser.For_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(@NotNull JavaRiceParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(@NotNull JavaRiceParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#super_suffix}.
	 * @param ctx the parse tree
	 */
	void enterSuper_suffix(@NotNull JavaRiceParser.Super_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#super_suffix}.
	 * @param ctx the parse tree
	 */
	void exitSuper_suffix(@NotNull JavaRiceParser.Super_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#finally_block}.
	 * @param ctx the parse tree
	 */
	void enterFinally_block(@NotNull JavaRiceParser.Finally_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#finally_block}.
	 * @param ctx the parse tree
	 */
	void exitFinally_block(@NotNull JavaRiceParser.Finally_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void enterVariable_definition(@NotNull JavaRiceParser.Variable_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void exitVariable_definition(@NotNull JavaRiceParser.Variable_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clause(@NotNull JavaRiceParser.Catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clause(@NotNull JavaRiceParser.Catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(@NotNull JavaRiceParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(@NotNull JavaRiceParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull JavaRiceParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull JavaRiceParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(@NotNull JavaRiceParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(@NotNull JavaRiceParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(@NotNull JavaRiceParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(@NotNull JavaRiceParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#local_variable_declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declaration_statement(@NotNull JavaRiceParser.Local_variable_declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#local_variable_declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declaration_statement(@NotNull JavaRiceParser.Local_variable_declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull JavaRiceParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull JavaRiceParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameter_list(@NotNull JavaRiceParser.Formal_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameter_list(@NotNull JavaRiceParser.Formal_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#switch_block_statement_group}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_block_statement_group(@NotNull JavaRiceParser.Switch_block_statement_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#switch_block_statement_group}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_block_statement_group(@NotNull JavaRiceParser.Switch_block_statement_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variable_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_list(@NotNull JavaRiceParser.Variable_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variable_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_list(@NotNull JavaRiceParser.Variable_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull JavaRiceParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull JavaRiceParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#switch_label}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_label(@NotNull JavaRiceParser.Switch_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#switch_label}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_label(@NotNull JavaRiceParser.Switch_labelContext ctx);
}