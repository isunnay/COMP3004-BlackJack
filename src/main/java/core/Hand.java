package core;

public class Hand {
	
	private int count;
	private Card[] Hand;
	private int handValue;
	public boolean isBusted;

	
	public Hand() {
		Hand = new Card[20];
		count = 0;	
		isBusted = false;
	}
	
	public void hit(Card card) {
		Hand[count++] = card;	
	}
	
	public int getHandSize() {
		return this.count;
	}	
	
	public int getHandValue() {
		for(int i=0;i<count;i++) {
			handValue += Hand[i].getValueOfCard();
		}
		return handValue;
	}

	public boolean checkBlackjack() {
		if(this.handValue == 21) {
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


}
