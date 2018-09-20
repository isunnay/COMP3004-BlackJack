package core;

import junit.framework.TestCase;

public class GameTest extends TestCase{
	
	public void testConsole() {
		Game game = new Game();
		Console console = new Console();
		int x = 21;int y = 2;
		assertTrue("true",game.isConsoleRunning(console,x,y));	
	}
	
	
	public void testStartGame() {
		Game game = new Game();
		assertTrue("true",game.isGameRunning(game));
		
	}
	

}
