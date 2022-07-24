package warCardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name) {
		this.score = 0;
		this.name = name;
}
	public void describe() {
		System.out.println(name + " " + "has a score of " + score + "!");
			for(Card card : hand) {
				card.describe();
			}
	}	

	public Card flip() {
		Card topCard = this.hand.get(0);
		hand.remove(0);
		return topCard;
	} 
	
	public void draw(Deck deck) {
		this.hand.add(deck.draw());
	}
	
	public void incrementScore() {
		this.score++;
	}
}