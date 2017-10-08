package model.symboltable;

public class STRow {

	private String tokenId;
	private String lexeme;
	
	public STRow(){
	}
	
	public STRow(String tokenId, String lexeme){
		this.tokenId = tokenId;
		this.lexeme = lexeme;	
	}
	
	public String getTokenId() {
		return tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	public String getLexeme() {
		return lexeme;
	}
	public void setLexeme(String lexeme) {
		this.lexeme = lexeme;
	}
	
	
	
}
