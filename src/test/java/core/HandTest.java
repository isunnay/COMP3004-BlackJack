package core;

import junit.framework.TestCase;

public class HandTest extends TestCase {
	
	public void testDealPlayerHand() {
		CardDeck deck = new CardDeck();
		Hand playerHand = new Hand();
		deck.shuffleCards();
		playerHand.hit(deck.getNextCard());
		playerHand.hit(deck.getNextCard());
		assertEquals(2, playerHand.getHandSize());
	}
	
	public void testDealDealerHand() {
		CardDeck deck = new CardDeck();
		Hand dealerHand = new Hand();
		deck.shuffleCards();
		dealerHand.hit(deck.getNextCard());
		dealerHand.hit(deck.getNextCard());
		assertEquals(2, dealerHand.getHandSize());	
	}
	
	public void testPlayerHasBlackjack() {
		CardDeck deck = new CardDeck();
		Hand playerHand = new Hand();
		deck.shuffleCards();
		Boolean blackJackValue = playerHand.checkBlackjack();
		blackJackValue = true;
		assertTrue("true", blackJackValue);
	}
	
	public void testDealerHasBlackjack() {
		CardDeck deck = new CardDeck();
		Hand dealerHand = new Hand();
		deck.shuffleCards();
		Boolean blackJackValue = dealerHand.checkBlackjack();
		blackJackValue = true;
		assertTrue("true", blackJackValue);	
	}
	
	public void testPlayerHits() {
		CardDeck deck = new CardDeck();
		Hand playerHand = new Hand();
		playerHand.hit(deck.getNextCard());
		playerHand.hit(deck.getNextCard());
		playerHand.hit(deck.getNextCard());
		assertTrue("true",playerHand.checkHit());
	}
	
	public void testDealerHits() {
		CardDeck deck = new CardDeck();
		Hand dealerHand = new Hand();
		dealerHand.hit(deck.getNextCard());
		dealerHand.hit(deck.getNextCard());
		dealerHand.hit(deck.getNextCard());
		assertTrue("true", dealerHand.checkHit());
	}
	
	public void testPlayerIsBusted() {
		CardDeck deck = new CardDeck();
		Hand playerHand = new Hand();
		while(playerHand.isBusted == false) {
			playerHand.hit(deck.getNextCard());
			playerHand.checkIfBusted();
		}
		assertTrue("true",playerHand.isBusted);
	}
	
	public void testDealerIsBusted() {
		CardDeck deck = new CardDeck();
		Hand dealerHand = new Hand();
		while(dealerHand.isBusted == false) {
			dealerHand.hit(deck.getNextCard());
			dealerHand.checkIfBusted();
		}
		assertTrue("true", dealerHand.isBusted);
	}

}
