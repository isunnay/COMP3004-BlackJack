package core;

public class Card{
	private String suit;
	private String rank;
	
	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
		
	}
	
	public String getCardSuit() {
		return this.suit;
		
	}
	
	public String getCardRank() {
		return this.rank;
		
	}

}
