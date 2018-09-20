package core;

import junit.framework.TestCase;

public class ConsoleTest extends TestCase{
	
	public void testPlayerGameWinner() {
		Console console = new Console();
		assertTrue("true", isPlayerWinner());
		
	}
	
	public void testDealerGameWinner() {
		Console console = new Console();
		assertTrue("true", isDealerWinner());
		
	}
	
	public void testPush() {
		Console console = new Console();
		assertTrue("true", isItAPush());
		
	}
	
	
	public void testPlayerHit() {
		Console console = new Console();
		console.playerHit();
		assertEquals(3, console.playerDeck.getSize());
		
	}
	
	public void testDealerHit() {
		Console console = new Console();
		console.dealerHit();
		assertEquals(3, console.dealerDeck.getSize());
	}
	
	public void testPlayerStand() {
		Console console = new Console();
		console.playerStand();
		assertEquals(2, console.playerDeck.getSize());
		
		
	}

}
