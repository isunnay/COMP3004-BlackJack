package core;

import junit.framework.TestCase;

public class ConsoleTest extends TestCase{
	
	public void testPlayerGameWinner() {
		Console console = new Console();
		Hand playerHand = new Hand();
		Hand dealerHand = new Hand();
		Card playerCard1 = new Card(0,11);
		Card playerCard2 = new Card(0,12);
		playerHand.hit(playerCard1);
		playerHand.hit(playerCard2);
		Card dealerCard1 = new Card(0,5);
		Card dealerCard2 = new Card(0,6);
		dealerHand.hit(dealerCard1);
		dealerHand.hit(dealerCard2);
		int playerHandValue = playerHand.getHandValue();
		int dealerHandValue = dealerHand.getHandValue();
		
		assertTrue("true", console.isPlayerWinner(playerHandValue,dealerHandValue));
		
	}
	
	public void testDealerBlackJack() {
		Console console = new Console();
		Hand dealerHand = new Hand();
		Card dealerCard1 = new Card(0,0);
		Card dealerCard2 = new Card(0,12);
		dealerHand.hit(dealerCard1);
		dealerHand.hit(dealerCard2);
		int value = dealerHand.getHandValue();
		int number = dealerHand.getHandSize();
		assertTrue("true", console.isBlackJack(value, number));
	}
	
	public void testDealerGameWinner() {
		Console console = new Console();
		CardDeck deck = new CardDeck();
		Hand playerHand = new Hand();
		Hand dealerHand = new Hand();
		Card dealerCard1 = new Card(0,11);
		Card dealerCard2 = new Card(0,12);
		playerHand.hit(dealerCard1);
		playerHand.hit(dealerCard2);
		Card playerCard1 = new Card(0,5);
		Card playerCard2 = new Card(0,6);
		dealerHand.hit(playerCard1);
		dealerHand.hit(playerCard2);
		int playerHandValue = playerHand.getHandValue();
		int dealerHandValue = dealerHand.getHandValue();
		assertTrue("true", console.isPlayerWinner(playerHandValue,dealerHandValue));
	}
	
	public void testPush() {
		Console console = new Console();
		Hand playerHand = new Hand();
		Hand dealerHand = new Hand();
		Card dealerCard1 = new Card(0,4);
		Card dealerCard2 = new Card(0,4);
		playerHand.hit(dealerCard1);
		playerHand.hit(dealerCard2);
		Card playerCard1 = new Card(0,4);
		Card playerCard2 = new Card(0,4);
		dealerHand.hit(playerCard1);
		dealerHand.hit(playerCard2);
		int playerHandValue = playerHand.getHandValue();
		int dealerHandValue = dealerHand.getHandValue();
		assertTrue("true", console.isPush(playerHandValue, dealerHandValue));
		
	}
	
	
	
	public void testDealerHit() {
		Console console = new Console();
		Hand dealerHand = new Hand();
		Card dealerCard1 = new Card(0,4);
		Card dealerCard2 = new Card(0,4);
		Card dealerCard3 = new Card(0,4);
		dealerHand.hit(dealerCard1);
		dealerHand.hit(dealerCard2);
		dealerHand.hit(dealerCard3);
		
		assertEquals(3, console.getDealerSize(dealerHand));
	}
	
	public void testPlayerStand() {
		Console console = new Console();
		Hand playerHand = new Hand();
		Hand dealerHand = new Hand();
		Card dealerCard1 = new Card(0,11);
		Card dealerCard2 = new Card(0,12);
		Card dealerCard3 = new Card(0,1);
		playerHand.hit(dealerCard1);
		playerHand.hit(dealerCard2);
		Card playerCard1 = new Card(0,5);
		Card playerCard2 = new Card(0,6);
		dealerHand.hit(playerCard1);
		dealerHand.hit(playerCard2);
		dealerHand.hit(dealerCard3);
		assertTrue("true", console.checkPlayerStand(playerHand, dealerHand));
	}

}
