
public enum Rank {
	TWO(2, "Two"), THREE(3, "Three"),FOUR(4, "Four"), FIVE(5, "Five"), 
	SIX(6, "Six"), SEVEN(7, "Seven"),EIGHT(8, "Eight"), NINE(9, "Nine"), TEN(10, "Ten"),
	JACK(11, "Jack"), QUEEN(12, "Queen"), KING(13, "King"), ACE(14, "Ace");
	
	private final int rankValue;
	private final String rankString;
	
	private Rank(int rankValue, String rankString) { 
		this.rankValue = rankValue;
		this.rankString = rankString;
	}
	
	public String printRank() {
		return rankString;
	}
	
	public int getRank() {
		return rankValue;
	}

	public int getRankValue() {
		return rankValue;
	}

	public String getRankString() {
		return rankString;
	}
	
	@Override
	public String toString() {
		if(this.getRankValue() > 10) {
			return this.getRankString().substring(0, 1);
		}
		return String.valueOf(this.getRankValue());
	}

}
