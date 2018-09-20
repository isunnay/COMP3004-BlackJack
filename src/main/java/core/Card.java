package core;

public class Card{
	private int suit;
	private int rank;
	
	private static final String[] suits = {"C", "D", "H", "S"};
    private static final String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
		
	}
	
	public String getCardSuit() {
		return suits[this.suit];
		
	}
	
	public String getCardRank() {
		return ranks[this.rank];
	}
	
	public int getCardSuitInt() {
		return this.suit;
	}
	
	public int getCardRankInt() {
		return this.rank;
	}
	
	
	
	public String getCardName() {
		String suitForName = String.valueOf(suit);
		String rankForName = String.valueOf(rank);
		return suitForName + rankForName;
	}
	
	public int getValueOfCard(){
		//returns the value of the Card

		if (this.rank==0){
			return 11;
		}

		else if (this.rank < 10){
			return rank + 1;
		}
		else if(this.rank >=10){
			return 10;
		}
		else{
			return 0;
		}
	}
	
	public String toString(int suit, int rank) {
		return suits[suit] + ranks[rank];
		
	}
	
}
