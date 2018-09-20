package core;

import junit.framework.TestCase;

public class GameTest extends TestCase{
	
	public void testConsole() {
		Game game = new Game();
		game.startConsole();
		assertTrue("true",game.isConsoleRunning());
		
	}
	
	public void testFileInput() {
		Game game = new Game();
		game.startFileInput();
		assertTrue("True",game.isFileInputRunning());
		
	}
	
	public void testStartGame() {
		Game game = new Game();
		assertTrue("true",game.isGameRunning());
		
	}
	

}
