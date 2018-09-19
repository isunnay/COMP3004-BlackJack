package core;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
	
	private ArrayList<Card> cardDeck;
	private int size;


	public CardDeck() {
		cardDeck = new ArrayList<Card>();
		generateDeck();
	}
	
	
	public void generateDeck() {
		for(int suit=0;suit<4;suit++) {
			for(int rank=0;rank<13;rank++) {
				Card card = new Card(suit,rank);
				cardDeck.add(card);
			}
		}
	}
	
	
	public int getDeckSize() {
		size = cardDeck.size();
		return size;
	}
	
	
	public Boolean doesEveryCardExist() {
		int counter = 0;
		for(int i=0;i<4;i++) {
			for(int x=0;x<13;x++){
				Card card = new Card(i,x);
				String aCardName = cardDeck.get(counter).getCardSuit()+ cardDeck.get(counter).getCardRank();
				Boolean bool = card.toString(i,x).equals(aCardName);
				if(bool == false) {
					return false;
				}
				counter++;
				}
			}
		return true;
		}
	
	
	public void shuffleCards() {
		Collections.shuffle(cardDeck);
	}
	
	
	public boolean isDeckShuffled() {
		int counter = 0;
		for(int i=0;i<4;i++) {
			for(int x=0;x<13;x++){
				Card card = new Card(i,x);
				String aCardName = cardDeck.get(counter).getCardSuit()+ cardDeck.get(counter).getCardRank();
				Boolean bool = card.toString(i,x).equals(aCardName);
				if(bool == false) {
					return false;
				}
				counter++;
				}
			}
		return true;
	}
	
	public Card getNextCard() {
		Card nextCard = cardDeck.get(getDeckSize()-1);
		cardDeck.remove(getDeckSize()-1);
		return nextCard;
	}



}
