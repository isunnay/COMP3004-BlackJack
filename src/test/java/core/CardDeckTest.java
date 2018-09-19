package core;

import junit.framework.TestCase;

public class CardDeckTest extends TestCase{
	
	public void testNumberOfCards(){
		CardDeck deck = new CardDeck();
		assertEquals(52, deck.getDeckSize());
	}
	
	
	public void testEveryCardExists(){
		CardDeck deck = new CardDeck();
		assertTrue("true",deck.doesEveryCardExist());		
	}
	
	
	public void testIsDeckShuffled() {
		CardDeck deck = new CardDeck();
		deck.shuffleCards();
		assertFalse("false",deck.isDeckShuffled());
		
	}

}
