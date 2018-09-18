package core;

import junit.framework.TestCase;

public class CardTest extends TestCase{
	
	public void testGetSuit() {
		System.out.println("Testing Card Suit");
		Card card = new Card("H", "3");
		assertEquals("H", card.getCardSuit());
		
		card = new Card("S", "3");
		assertEquals("S", card.getCardSuit());
		
		card = new Card("C", "3");
		assertEquals("C", card.getCardSuit());
		
		card = new Card("D", "3");
		assertEquals("D", card.getCardSuit());
		}
	
	public void testGetRank() {
		for(int i=3; i<=10;i++) {
			Card card = new Card("H",String.valueOf(i));
			assertEquals(String.valueOf(i),card.getCardRank());
	}
		
		Card card = new Card("H","J");
		assertEquals("J",card.getCardRank());
		
		card = new Card("H","Q");
		assertEquals("Q",card.getCardRank());
		
		card = new Card("H","K");
		assertEquals("K",card.getCardRank());
		
		card = new Card("H","A");
		assertEquals("A",card.getCardRank());
		
	}
	
}