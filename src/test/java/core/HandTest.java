package core;

import junit.framework.TestCase;

public class HandTest extends TestCase {
	
	public void testDealPlayerHand() {
		Hand playerHand = new Hand();
		assertEquals(2, playerHand.getHandSize());
	}
	
	public void testDealDealerHand() {
		Hand dealerHand = new Hand();
		assertEquals(2, dealerHand.getHandSize());	
	}
	
	public void testDealerHasBlackjack() {
		Hand dealerHand = new Hand();
		assertTrue("true", dealerHand.checkBlackjack());	
	}
	
	public void testPlayerHasBlackjack() {
		Hand playerHand = new Hand();
		assertTrue("true", playerHand.checkBlackjack());
	}
	
	public void testPlayerHits() {
		Hand PlayerHand = new Hand();
		playerHand.hit();
		assertTrue("true",playerHand.checkHit());
	}
	
	public void testDealerHits() {
		Hand dealerHand = new Hand();
		dealerHand.hit();
		assertTrue("true", dealerHand.checkHit());
	}
	
	public void testPlayerIsBusted() {
		Hand playerHand = new Hand();
		while(playerHand.isBusted == false) {
			playerHand.hit();
		}
		AssertEquals("true", playerHand.isBusted());
	}
	
	public void testDealerIsBusted() {
		Hand dealerHand = new Hand();
		while(dealerHand.isBusted == false) {
			dealerHand.hit();
		}
		AssertEquals("true", dealerHand.isBusted());
	}

}
