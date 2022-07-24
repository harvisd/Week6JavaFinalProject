package warCardGame;

public class App {

	public static void main(String[] args) {
	Deck newDeck = new Deck();
	
	newDeck.shuffleCards();
	Player p1 = new Player("Harvey");
	Player p2 = new Player("Dee");
	
	
	for(int i = 1; i < 26; i++) {
		p1.hand.add(newDeck.draw());
		p2.hand.add(newDeck.draw());
	}
	
	p1.describe();
	p2.describe();
	
	for(int i = 1; i < 26; i++) {
		Card p1Card = p1.flip();
		Card p2Card = p2.flip();
		if(p1Card.getValue() > p2Card.getValue()) {
			p1.incrementScore();
		} else if(p2Card.getValue() > p1Card.getValue()) {
			p2.incrementScore();
		} 
				
	}
	if(p1.score > p2.score) {
		System.out.println(p1.name + " has a total score of " + p1.score);
		System.out.println(p2.name + " has a total score of " + p2.score);
		System.out.println("The winner today is " + p1.name + "!");
	} else if(p2.score > p1.score) {
		System.out.println(p2.name + " has a total score of " + p2.score);
		System.out.println(p1.name + " has a total score of " + p1.score);
		System.out.println("The winner today is " + p2.name + "!");
	} else {
		System.out.println(p1.name + " has a total score of " + p1.score);
		System.out.println(p2.name + " has a total score of " + p2.score);
		System.out.println("No one is a winner today, the final score is a Draw!");
	}
}
}
