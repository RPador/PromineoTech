import java.util.ArrayList;
import java.util.List;

public class Player {	
	
	private String name;
	private int score;
	private List<Card> hand = new ArrayList<>();
	
	public Player(String name) {
		this.score = 0;
		this.name = name;
	}
	
	public void createPlayerHands(Deck deck, Player p1, Player p2) {
		for(int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.draw(deck);
			} else {
				p2.draw(deck);
			}
		}
	}

	public void getPlayersScores(Player p1, Player p2) {
		for (int i = 0; i < 25; i++) {
			Card c1 = p1.flip();
			Card c2 = p2.flip();
			if (c1.getCardPoints() > c2.getCardPoints()) {
				p1.incrementScore();
			} else if (c1.getCardPoints() < c2.getCardPoints()) {
				p2.incrementScore();
			}
		}
		if (p1.getScore() > p2.getScore()) {
			System.out.println(p1.getName() + " are the WINNER with the final score of: " + p1.getScore()
			+ ", while " + p2.getName() + "'s final score is: " + p2.getScore());
		} else if (p2.getScore() > p1.getScore()) {
			System.out.println(p1.getName() + " are the LOSER with the final score of: " + p1.getScore()
			+ ", while " + p2.getName() + "'s final score is: " + p2.getScore());
		} else {
			System.out.println("It's a DRAW with " + p1.getName() + "'s score: " + p1.getScore() + ", and " + p2.getName() + "'s score: " + p2.getScore());
		}
	}
	
	public void draw(Deck deck) {
		hand.add(deck.dealCard());
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void incrementScore() {
		score++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
