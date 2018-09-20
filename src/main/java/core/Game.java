package core;

import java.util.Scanner;

public class Game {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public Game() {
		
	}
	
	public void startConsole() {
		Console console = new Console();
		console.start();
	}
	
	public void startFileInput() {
		System.out.println("File input is still a work in progress");
		return;
	}
	
	public void checkSelection(String input) {
		 
			if (input.toUpperCase().equals("C")) {
				startConsole();
			}
			else if(input.toUpperCase().equals("F")) {
				startFileInput();
			}
			else if(input.toUpperCase().equals("EXIT")) {
				System.exit(0);
			}
			else {
				System.out.println("Please choose a valid option");
			}

	}
	
	public boolean isGameRunning(Game game) {
		if(this.equals(game)) {
			return true;
		}
		return false;
	}
	
	public boolean isConsoleRunning(Console console, int x, int y) {
		if(console.isBlackJack(x, y)) {
			return true;
			}
		return false;
		}
	
	public static void main(String args[]) {
		Game game = new Game();
		
		while(true) {
			System.out.println("--------Welcome to Elvin's COMP3004 Blackjack Assignment-------");
			System.out.println("Would you like to use the console (c) or file input (f)? type 'exit' to quit at any time");
			System.out.println("Please enter an option: ");
			String input = scanner.nextLine();
			game.checkSelection(input);
		}

	}

}
