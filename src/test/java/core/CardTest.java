package core;

import junit.framework.TestCase;

public class CardTest extends TestCase{
	
	public void GetSuitTest() {
		System.out.println("Testing Card Suit");
		Card card = new Card("H", 3);
		assertEquals("H", card.getCardSuit());
		
		Card card = new Card("S", 3);
		assertEquals("S", card.getCardSuit());
		
		Card card = new Card("C", 3);
		assertEquals("C", card.getCardSuit());
		
		Card card = new Card("D", 3);
		assertEquals("D", card.getCardSuit());
		}
	
	public void getRankTest() {
		for(int i=3; i<=10;i++) {
			Card card = new Card("H",i);
			assertEquals(i,card.getCardRank());
	}
		
		Card card = new Card("H","J");
		assertEquals("J",card.getCardRank());
		
		Card card = new Card("H","Q");
		assertEquals("Q",card.getCardRank());
		
		Card card = new Card("H","K");
		assertEquals("K",card.getCardRank());
		
		Card card = new Card("H","A");
		assertEquals("A",card.getCardRank());
		
	}
	
}