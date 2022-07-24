package warCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	public static final String[] Suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	public static final String[] Ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	int value = 2;
	List<Card> deck = new ArrayList<Card>();
	
	//Constructor
	public Deck() {
		createDeck();
	}
	
	//method to build up a deck
	public void createDeck() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				this.deck.add(new Card(Ranks[j], Suits[i], value++));
			} value = 2;
		}
	}
	
	public void shuffleCards() {
		Collections.shuffle(this.deck);
	}
	
	public Card draw() {
		Card topCard = this.deck.get(0);
		deck.remove(0);
		return topCard;
	}
	
	public List<Card> getDeck(){
		return deck;
	}
	
	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
//	@Override
//	public String toString() {
//	    return Ranks + " of " + Suits;
//	}
}
