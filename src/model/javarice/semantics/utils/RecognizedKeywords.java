package model.javarice.semantics.utils;

public class RecognizedKeywords {
	
	public static String PRIMITIVE_TYPE_BOOLEAN = "_boolean";
	public static String PRIMITIVE_TYPE_CHAR = "_char";
	public static String PRIMITIVE_TYPE_INT = "_int";
	public static String PRIMITIVE_TYPE_BYTE = "_byte";
	public static String PRIMITIVE_TYPE_SHORT = "_short";
	public static String PRIMITIVE_TYPE_LONG = "_long";
	public static String PRIMITIVE_TYPE_FLOAT = "_float";
	public static String PRIMITIVE_TYPE_DOUBLE = "_double";
	public static String PRIMITIVE_TYPE_STRING = "_String";
	
	public static String BOOLEAN_TRUE = "true";
	public static String BOOLEAN_FALSE = "false";
	
	/*
	 * Returns true if the keywords match. This is case-sensitive
	 */
	public static boolean matchesKeyword(String keyword, String textToMatch) {
		return textToMatch.contains(keyword);
	}
}
