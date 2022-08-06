import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Deck {
	
	List<Card> cards = new ArrayList<Card>();
	
	Deck() {
		createDeck();
	}

	private void createDeck() {
	for (Suit s : Suit.values()) {
		for (Rank r : Rank.values()) {
			cards.add(new Card(r, s));
		}
	}
}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public List<Card> getCards() {
		return this.cards;
	}
	
	public int getCardsCount() {
		return this.cards.size();
	}
	
	public Card dealCard() {
		return this.cards.remove(this.cards.size() - 1);
	}
	
	public void addCard(Card c) {
		this.cards.add(0, c);
	}
	
	@Override
	public String toString() {
		return this.cards.toString();
	}
	}

