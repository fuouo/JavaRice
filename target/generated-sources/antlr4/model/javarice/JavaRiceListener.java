// Generated from JavaRice.g4 by ANTLR 4.4
package model.javarice;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaRiceParser}.
 */
public interface JavaRiceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(@NotNull JavaRiceParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(@NotNull JavaRiceParser.MemberDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link JavaRiceParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(@NotNull JavaRiceParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(@NotNull JavaRiceParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(@NotNull JavaRiceParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(@NotNull JavaRiceParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull JavaRiceParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull JavaRiceParser.ClassBodyDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link JavaRiceParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull JavaRiceParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull JavaRiceParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull JavaRiceParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull JavaRiceParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(@NotNull JavaRiceParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(@NotNull JavaRiceParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(@NotNull JavaRiceParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(@NotNull JavaRiceParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull JavaRiceParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull JavaRiceParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull JavaRiceParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull JavaRiceParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull JavaRiceParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull JavaRiceParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(@NotNull JavaRiceParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(@NotNull JavaRiceParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull JavaRiceParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull JavaRiceParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(@NotNull JavaRiceParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(@NotNull JavaRiceParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull JavaRiceParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull JavaRiceParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull JavaRiceParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull JavaRiceParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull JavaRiceParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull JavaRiceParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull JavaRiceParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull JavaRiceParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(@NotNull JavaRiceParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(@NotNull JavaRiceParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(@NotNull JavaRiceParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(@NotNull JavaRiceParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull JavaRiceParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull JavaRiceParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull JavaRiceParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull JavaRiceParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull JavaRiceParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull JavaRiceParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull JavaRiceParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull JavaRiceParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull JavaRiceParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull JavaRiceParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull JavaRiceParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull JavaRiceParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(@NotNull JavaRiceParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(@NotNull JavaRiceParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(@NotNull JavaRiceParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(@NotNull JavaRiceParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull JavaRiceParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull JavaRiceParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(@NotNull JavaRiceParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(@NotNull JavaRiceParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull JavaRiceParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull JavaRiceParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull JavaRiceParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull JavaRiceParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull JavaRiceParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull JavaRiceParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull JavaRiceParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull JavaRiceParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull JavaRiceParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull JavaRiceParser.TypeListContext ctx);
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
	 * Enter a parse tree produced by {@link JavaRiceParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull JavaRiceParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull JavaRiceParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(@NotNull JavaRiceParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(@NotNull JavaRiceParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull JavaRiceParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull JavaRiceParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull JavaRiceParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull JavaRiceParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull JavaRiceParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull JavaRiceParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull JavaRiceParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull JavaRiceParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull JavaRiceParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull JavaRiceParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull JavaRiceParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull JavaRiceParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(@NotNull JavaRiceParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(@NotNull JavaRiceParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(@NotNull JavaRiceParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(@NotNull JavaRiceParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull JavaRiceParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull JavaRiceParser.BlockStatementContext ctx);
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
	 * Enter a parse tree produced by {@link JavaRiceParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull JavaRiceParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull JavaRiceParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(@NotNull JavaRiceParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(@NotNull JavaRiceParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(@NotNull JavaRiceParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(@NotNull JavaRiceParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(@NotNull JavaRiceParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(@NotNull JavaRiceParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull JavaRiceParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull JavaRiceParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull JavaRiceParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull JavaRiceParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull JavaRiceParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull JavaRiceParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull JavaRiceParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull JavaRiceParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull JavaRiceParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull JavaRiceParser.LocalVariableDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link JavaRiceParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(@NotNull JavaRiceParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(@NotNull JavaRiceParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull JavaRiceParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull JavaRiceParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull JavaRiceParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull JavaRiceParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull JavaRiceParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull JavaRiceParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(@NotNull JavaRiceParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(@NotNull JavaRiceParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull JavaRiceParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull JavaRiceParser.FormalParametersContext ctx);
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
	 * Enter a parse tree produced by {@link JavaRiceParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(@NotNull JavaRiceParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(@NotNull JavaRiceParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(@NotNull JavaRiceParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(@NotNull JavaRiceParser.ClassOrInterfaceModifierContext ctx);
}