package core;

public class Hand {
	
	private int count;
	private Card[] Hand;
	private int handValue;
	public boolean isBusted;
	private int numberOfAces;

	
	public Hand() {
		Hand = new Card[20];
		handValue = 0;
		count = 0;	
		isBusted = false;
		numberOfAces = 0;
	}
	
	public void hit(Card card) {
		Hand[count++] = card;	
	}
	
	public int getHandSize() {
		return this.count;
	}	
	
	public int getNumberOfAces() {
		return numberOfAces;
	}
	
	public int getHandValue() {
		handValue=0;
		this.findAce();
		
		for(int i=0;i<count;i++) {
			handValue += Hand[i].getValueOfCard();
			
			if(handValue>21 && numberOfAces!=0) {
				handValue = handValue - 10;
				numberOfAces = numberOfAces -1;	
			}
		}
		return handValue;
	}

	public boolean checkBlackjack() {
		if(this.handValue == 21 && this.getHandSize() == 2) {
			return true;
		}
		return false;
	}

	public boolean checkHit() {
		if(this.count>2) {
			return true;
		}
		return false;
	}
	
	public boolean checkIfBusted() {
		if(this.getHandValue()>21) {
			isBusted = true;
		}
		return false;
	}
	
	public void findAce() {
		for(int i=0;i<count;i++) {
			if(Hand[i].getCardRank() == "A") {
				numberOfAces++;
			}
		}
	}
	
	public String showTopCard() {
		return (Hand[0].toString(Hand[0].getCardSuitInt(), Hand[0].getCardRankInt()));	
	}
	
	public void showCards() {
		for(int i=0;i<count;i++) {
			System.out.println(Hand[i].toString(Hand[i].getCardSuitInt(), Hand[i].getCardRankInt()));	
		}
	}

}
