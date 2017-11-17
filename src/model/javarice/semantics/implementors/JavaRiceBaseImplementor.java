package model.javarice.semantics.implementors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import model.javarice.generatedexp.JavaRiceListener;
import model.javarice.generatedexp.JavaRiceParser.ArgumentsContext;
import model.javarice.generatedexp.JavaRiceParser.ArrayCreatorRestContext;
import model.javarice.generatedexp.JavaRiceParser.ArrayInitializerContext;
import model.javarice.generatedexp.JavaRiceParser.BlockContext;
import model.javarice.generatedexp.JavaRiceParser.BlockStatementContext;
import model.javarice.generatedexp.JavaRiceParser.CatchClauseContext;
import model.javarice.generatedexp.JavaRiceParser.CatchTypeContext;
import model.javarice.generatedexp.JavaRiceParser.ClassBodyContext;
import model.javarice.generatedexp.JavaRiceParser.ClassBodyDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.ClassCreatorRestContext;
import model.javarice.generatedexp.JavaRiceParser.ClassDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.ClassOrInterfaceModifierContext;
import model.javarice.generatedexp.JavaRiceParser.ClassOrInterfaceTypeContext;
import model.javarice.generatedexp.JavaRiceParser.ConstDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.ConstantDeclaratorContext;
import model.javarice.generatedexp.JavaRiceParser.ConstantExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.CreatedNameContext;
import model.javarice.generatedexp.JavaRiceParser.CreatorContext;
import model.javarice.generatedexp.JavaRiceParser.EnhancedForControlContext;
import model.javarice.generatedexp.JavaRiceParser.ExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.ExpressionListContext;
import model.javarice.generatedexp.JavaRiceParser.FinallyBlockContext;
import model.javarice.generatedexp.JavaRiceParser.ForControlContext;
import model.javarice.generatedexp.JavaRiceParser.ForInitContext;
import model.javarice.generatedexp.JavaRiceParser.ForUpdateContext;
import model.javarice.generatedexp.JavaRiceParser.FormalParameterContext;
import model.javarice.generatedexp.JavaRiceParser.FormalParameterListContext;
import model.javarice.generatedexp.JavaRiceParser.FormalParametersContext;
import model.javarice.generatedexp.JavaRiceParser.ImportDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.InnerCreatorContext;
import model.javarice.generatedexp.JavaRiceParser.LastFormalParameterContext;
import model.javarice.generatedexp.JavaRiceParser.LiteralContext;
import model.javarice.generatedexp.JavaRiceParser.LocalVariableDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.LocalVariableDeclarationStatementContext;
import model.javarice.generatedexp.JavaRiceParser.MainDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.MemberDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.MethodBodyContext;
import model.javarice.generatedexp.JavaRiceParser.MethodDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.NonWildcardTypeArgumentsContext;
import model.javarice.generatedexp.JavaRiceParser.NonWildcardTypeArgumentsOrDiamondContext;
import model.javarice.generatedexp.JavaRiceParser.PackageDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.ParExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.PrimaryContext;
import model.javarice.generatedexp.JavaRiceParser.PrimitiveTypeContext;
import model.javarice.generatedexp.JavaRiceParser.ProgramContext;
import model.javarice.generatedexp.JavaRiceParser.QualifiedNameContext;
import model.javarice.generatedexp.JavaRiceParser.QualifiedNameListContext;
import model.javarice.generatedexp.JavaRiceParser.ResourceContext;
import model.javarice.generatedexp.JavaRiceParser.ResourceSpecificationContext;
import model.javarice.generatedexp.JavaRiceParser.ResourcesContext;
import model.javarice.generatedexp.JavaRiceParser.ScanContext;
import model.javarice.generatedexp.JavaRiceParser.StatementContext;
import model.javarice.generatedexp.JavaRiceParser.StatementExpressionContext;
import model.javarice.generatedexp.JavaRiceParser.SwitchBlockStatementGroupContext;
import model.javarice.generatedexp.JavaRiceParser.SwitchLabelContext;
import model.javarice.generatedexp.JavaRiceParser.TypeArgumentContext;
import model.javarice.generatedexp.JavaRiceParser.TypeArgumentsContext;
import model.javarice.generatedexp.JavaRiceParser.TypeArgumentsOrDiamondContext;
import model.javarice.generatedexp.JavaRiceParser.TypeListContext;
import model.javarice.generatedexp.JavaRiceParser.TypeParameterContext;
import model.javarice.generatedexp.JavaRiceParser.TypeParametersContext;
import model.javarice.generatedexp.JavaRiceParser.TypeTypeContext;
import model.javarice.generatedexp.JavaRiceParser.VariableDeclarationContext;
import model.javarice.generatedexp.JavaRiceParser.VariableDeclaratorContext;
import model.javarice.generatedexp.JavaRiceParser.VariableDeclaratorIdContext;
import model.javarice.generatedexp.JavaRiceParser.VariableDeclaratorsContext;
import model.javarice.generatedexp.JavaRiceParser.VariableInitializerContext;
import model.javarice.generatedexp.JavaRiceParser.VariableModifierContext;
import model.javarice.semantics.analyzers.ClassAnalyzer;
import model.javarice.semantics.analyzers.MainAnalyzer;

public class JavaRiceBaseImplementor implements JavaRiceListener {

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
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

	@Override
	public void enterProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPackageDeclaration(PackageDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPackageDeclaration(PackageDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterImportDeclaration(ImportDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitImportDeclaration(ImportDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassOrInterfaceModifier(ClassOrInterfaceModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassOrInterfaceModifier(ClassOrInterfaceModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableModifier(VariableModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableModifier(VariableModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassDeclaration(ClassDeclarationContext ctx) {
		// TODO Auto-generated method stub
		ClassAnalyzer classAnalyzer = new ClassAnalyzer();
		classAnalyzer.analyze(ctx);
	}

	@Override
	public void exitClassDeclaration(ClassDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeParameters(TypeParametersContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeParameters(TypeParametersContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeParameter(TypeParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeParameter(TypeParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeList(TypeListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeList(TypeListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassBody(ClassBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassBody(ClassBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassBodyDeclaration(ClassBodyDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassBodyDeclaration(ClassBodyDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMemberDeclaration(MemberDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMemberDeclaration(MemberDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodDeclaration(MethodDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodDeclaration(MethodDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMainDeclaration(MainDeclarationContext ctx) {
		// TODO Auto-generated method stub
		MainAnalyzer mainAnalyzer = new MainAnalyzer();
		mainAnalyzer.analyze(ctx);
	}

	@Override
	public void exitMainDeclaration(MainDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableDeclaration(VariableDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableDeclaration(VariableDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConstDeclaration(ConstDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConstDeclaration(ConstDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConstantDeclarator(ConstantDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConstantDeclarator(ConstantDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableDeclarators(VariableDeclaratorsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableDeclarators(VariableDeclaratorsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableDeclarator(VariableDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableDeclarator(VariableDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableInitializer(VariableInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableInitializer(VariableInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArrayInitializer(ArrayInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArrayInitializer(ArrayInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeType(TypeTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeType(TypeTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimitiveType(PrimitiveTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimitiveType(PrimitiveTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeArguments(TypeArgumentsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeArguments(TypeArgumentsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeArgument(TypeArgumentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeArgument(TypeArgumentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterQualifiedNameList(QualifiedNameListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitQualifiedNameList(QualifiedNameListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFormalParameters(FormalParametersContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFormalParameters(FormalParametersContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFormalParameterList(FormalParameterListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFormalParameterList(FormalParameterListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFormalParameter(FormalParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFormalParameter(FormalParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLastFormalParameter(LastFormalParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLastFormalParameter(LastFormalParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodBody(MethodBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodBody(MethodBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterQualifiedName(QualifiedNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitQualifiedName(QualifiedNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLiteral(LiteralContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLiteral(LiteralContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBlockStatement(BlockStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBlockStatement(BlockStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLocalVariableDeclarationStatement(LocalVariableDeclarationStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLocalVariableDeclarationStatement(LocalVariableDeclarationStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCatchClause(CatchClauseContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCatchClause(CatchClauseContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCatchType(CatchTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCatchType(CatchTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFinallyBlock(FinallyBlockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFinallyBlock(FinallyBlockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterResourceSpecification(ResourceSpecificationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitResourceSpecification(ResourceSpecificationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterResources(ResourcesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitResources(ResourcesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterResource(ResourceContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitResource(ResourceContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSwitchLabel(SwitchLabelContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSwitchLabel(SwitchLabelContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterForControl(ForControlContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitForControl(ForControlContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterForInit(ForInitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitForInit(ForInitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnhancedForControl(EnhancedForControlContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnhancedForControl(EnhancedForControlContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterForUpdate(ForUpdateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitForUpdate(ForUpdateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterParExpression(ParExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitParExpression(ParExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExpressionList(ExpressionListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExpressionList(ExpressionListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementExpression(StatementExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementExpression(StatementExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConstantExpression(ConstantExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConstantExpression(ConstantExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExpression(ExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExpression(ExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimary(PrimaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimary(PrimaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCreator(CreatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCreator(CreatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCreatedName(CreatedNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCreatedName(CreatedNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInnerCreator(InnerCreatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInnerCreator(InnerCreatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNonWildcardTypeArguments(NonWildcardTypeArgumentsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNonWildcardTypeArguments(NonWildcardTypeArgumentsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNonWildcardTypeArgumentsOrDiamond(NonWildcardTypeArgumentsOrDiamondContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNonWildcardTypeArgumentsOrDiamond(NonWildcardTypeArgumentsOrDiamondContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArrayCreatorRest(ArrayCreatorRestContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArrayCreatorRest(ArrayCreatorRestContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassCreatorRest(ClassCreatorRestContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassCreatorRest(ClassCreatorRestContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArguments(ArgumentsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArguments(ArgumentsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterScan(ScanContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitScan(ScanContext ctx) {
		// TODO Auto-generated method stub
		
	}

}
