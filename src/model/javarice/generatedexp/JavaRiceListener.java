package model.javarice.generatedexp;

// Generated from JavaRice.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaRiceParser}.
 */
public interface JavaRiceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaRiceParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaRiceParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaRiceParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaRiceParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaRiceParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaRiceParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaRiceParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaRiceParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaRiceParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaRiceParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(JavaRiceParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(JavaRiceParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JavaRiceParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JavaRiceParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaRiceParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaRiceParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JavaRiceParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JavaRiceParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JavaRiceParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JavaRiceParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JavaRiceParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JavaRiceParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JavaRiceParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JavaRiceParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(JavaRiceParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(JavaRiceParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JavaRiceParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JavaRiceParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JavaRiceParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JavaRiceParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaRiceParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaRiceParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(JavaRiceParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(JavaRiceParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaRiceParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaRiceParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JavaRiceParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JavaRiceParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaRiceParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaRiceParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(JavaRiceParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(JavaRiceParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaRiceParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaRiceParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(JavaRiceParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(JavaRiceParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(JavaRiceParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(JavaRiceParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaRiceParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaRiceParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(JavaRiceParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(JavaRiceParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaRiceParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaRiceParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(JavaRiceParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(JavaRiceParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JavaRiceParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JavaRiceParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(JavaRiceParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(JavaRiceParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(JavaRiceParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(JavaRiceParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JavaRiceParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JavaRiceParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(JavaRiceParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(JavaRiceParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JavaRiceParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JavaRiceParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaRiceParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaRiceParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaRiceParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaRiceParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaRiceParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaRiceParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JavaRiceParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JavaRiceParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(JavaRiceParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(JavaRiceParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(JavaRiceParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(JavaRiceParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaRiceParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaRiceParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaRiceParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaRiceParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JavaRiceParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JavaRiceParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JavaRiceParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JavaRiceParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(JavaRiceParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(JavaRiceParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JavaRiceParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JavaRiceParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JavaRiceParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JavaRiceParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaRiceParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaRiceParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JavaRiceParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JavaRiceParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaRiceParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaRiceParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JavaRiceParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JavaRiceParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JavaRiceParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JavaRiceParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaRiceParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaRiceParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaRiceParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaRiceParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(JavaRiceParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(JavaRiceParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(JavaRiceParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(JavaRiceParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JavaRiceParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JavaRiceParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JavaRiceParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JavaRiceParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JavaRiceParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JavaRiceParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JavaRiceParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JavaRiceParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JavaRiceParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JavaRiceParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JavaRiceParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JavaRiceParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(JavaRiceParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(JavaRiceParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(JavaRiceParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(JavaRiceParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(JavaRiceParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(JavaRiceParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(JavaRiceParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(JavaRiceParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JavaRiceParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JavaRiceParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaRiceParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaRiceParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaRiceParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaRiceParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JavaRiceParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JavaRiceParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaRiceParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaRiceParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaRiceParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaRiceParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JavaRiceParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JavaRiceParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JavaRiceParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JavaRiceParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(JavaRiceParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(JavaRiceParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JavaRiceParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JavaRiceParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(JavaRiceParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(JavaRiceParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JavaRiceParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JavaRiceParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JavaRiceParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JavaRiceParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JavaRiceParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JavaRiceParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(JavaRiceParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(JavaRiceParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaRiceParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaRiceParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(JavaRiceParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(JavaRiceParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JavaRiceParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JavaRiceParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JavaRiceParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JavaRiceParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JavaRiceParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JavaRiceParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JavaRiceParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JavaRiceParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(JavaRiceParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(JavaRiceParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaRiceParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaRiceParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JavaRiceParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JavaRiceParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(JavaRiceParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(JavaRiceParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(JavaRiceParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(JavaRiceParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(JavaRiceParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(JavaRiceParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(JavaRiceParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(JavaRiceParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(JavaRiceParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(JavaRiceParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(JavaRiceParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(JavaRiceParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(JavaRiceParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(JavaRiceParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JavaRiceParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JavaRiceParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(JavaRiceParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(JavaRiceParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(JavaRiceParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(JavaRiceParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(JavaRiceParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(JavaRiceParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JavaRiceParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JavaRiceParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRiceParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(JavaRiceParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRiceParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(JavaRiceParser.ScanContext ctx);
}