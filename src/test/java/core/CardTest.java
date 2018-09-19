package core;

import junit.framework.TestCase;

public class CardTest extends TestCase{
	
	public void testGetSuit() {
		Card card = new Card(0, 3);
		assertEquals("C", card.getCardSuit());
		
		card = new Card(1, 3);
		assertEquals("D", card.getCardSuit());
		
		card = new Card(2, 3);
		assertEquals("H", card.getCardSuit());
		
		card = new Card(3, 3);
		assertEquals("S", card.getCardSuit());
		}
	
	public void testGetRank() {
		for(int i=1; i<10;i++) {
			Card card = new Card(2,i);
			assertEquals(String.valueOf(i+1),card.getCardRank());
	}
		
		Card card = new Card(2,10);
		assertEquals("J",card.getCardRank());
		
		card = new Card(2,11);
		assertEquals("Q",card.getCardRank());
		
		card = new Card(2,12);
		assertEquals("K",card.getCardRank());
		
		card = new Card(2,0);
		assertEquals("A",card.getCardRank());
	}
	
	public void testGetValueOfCard() {
		for(int i=1;i<10;i++) {
			Card card = new Card(2,i);
			assertEquals(i+1,card.getValueOfCard());
		}
		
		Card card = new Card(2,10);
		assertEquals(10,card.getValueOfCard());
		
		card = new Card(2,11);
		assertEquals(10,card.getValueOfCard());
		
		card = new Card(2,12);
		assertEquals(10,card.getValueOfCard());
		
		
		card = new Card(2,0);
		assertEquals(11,card.getValueOfCard());
	}
	
	
}