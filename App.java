
public class App {
public static void main(String[] args) {
	
	Card c1, c2;
	c1 = new Card(Rank.FIVE, Suit.CLUBS);
	System.out.println(c1.describe() + "has the value of: " + c1.getCardPoints() + "\n");
	
	System.out.println("*******WAR GAME********");
	Player p1 = new Player("You");
	Player p2 = new Player("Jim");
	Deck d1 = new Deck();
	d1.shuffle();
	
	System.out.println("Both players will start off with the score: " + "\n" + p1.getName() + ":" + p1.getScore() + "\n" + p2.getName() + ":" + p2.getScore());
	System.out.println("\nThese are the cards in play: " + d1.toString());
	System.out.println("WAR will now begin:");
	p1.createPlayerHands(d1, p1, p2);
	System.out.println("\n");
	p1.getPlayersScores(p1, p2);
	
	
}
}
