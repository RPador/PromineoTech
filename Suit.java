
public enum Suit {
	HEARTS("Hearts", "H"),
	SPADES("Spades", "S"),
	DIAMONDS("Diamonds", "D"),
	CLUBS("Clubs", "C");
		
	private final String suitName;
	private String symbol;
	
	Suit(String suitName, String symbol) {
		this.suitName = suitName;
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSuitName() {
		return suitName;
	}

	public String printSuit() {
		return suitName;
	}	
}
