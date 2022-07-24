package warCardGame;

public class Card {
	
	private String name;
	private String ranks;
	private int value;
	
	//Constructor
	public Card(String name, String ranks, int value) {
		this.name = name;
		this.ranks = ranks;
		this.value = value;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getRank() {
		return ranks;
	}


	public void setRank(String rank) {
		this.ranks = rank;
	}
	
	//toString to allow me to print the values
	@Override
	public String toString() {
	    return name + " of " + ranks;
	}
	
	public String describe() {
		return this.toString();
	}
}
