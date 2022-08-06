public class Card {

	private Suit suit;
	private Rank rank;
	public boolean isFaceUp; 
	private String card;
	 Card(Rank rank, Suit suit) {
		 if (rank == null || suit == null) {
			 throw new NullPointerException();
		 }
		this.rank = rank;
		this.suit = suit;
		isFaceUp = true;
		this.card = String.format("%S%S",  rank.toString(), suit.getSymbol());
	}

	public String describe() {
		String str = "";
			str += rank.printRank() + " of " + suit.printSuit() + " ";
			return str;
	} 

	public void flipCard() {
		isFaceUp = !isFaceUp;
	}

	public Suit getSuit() {
		return suit;
	}
	
	public String getSuitLetter() {
		return this.suit.getSymbol();
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	public String getRankLetter() {
		return this.rank.toString();
	}
	
	public Integer getCardPoints() {
		return this.rank.getRankValue();
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}
	
	public int compareTo(Card other) {
		return this.getCardPoints().compareTo(other.getCardPoints());
		}
	
	public boolean isSameSuit(Card other) {
		return this.suit.equals(other.suit);
		}
	
	public boolean isSameRank(Card other) {
		return this.rank.equals(other.rank);
		}

@Override
	public boolean equals(Object obj) {
	if(obj == null) {
		return false;
	}
	if (!Card.class.isAssignableFrom(getClass())) {
		return false;
	}
	final Card other = (Card) obj;
	return this.suit == other.suit && this.rank == other.rank;
	}

@Override
	public String toString() {
	return this.rank.getRankString() + " of " + this.suit.getSuitName();
}
}
