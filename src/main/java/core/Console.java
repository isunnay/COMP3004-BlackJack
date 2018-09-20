package core;

import java.util.Scanner;

public class Console {

	private Hand playerHand = new Hand();
	private Hand dealerHand = new Hand();
	private CardDeck deck = new CardDeck();
	private static Scanner scanner = new Scanner(System.in);

	public Console() {
		// CardDeck deck = new CardDeck();
		deck.shuffleCards();
		// Hand playerHand = new Hand();
		playerHand.hit(deck.getNextCard());
		playerHand.hit(deck.getNextCard());
		// Hand dealerHand = new Hand();
		dealerHand.hit(deck.getNextCard());
		dealerHand.hit(deck.getNextCard());
	}

	public void showDealerTopCard() {
		System.out.println("This is the dealer's Top Card:");
		System.out.println(dealerHand.showTopCard());
	}

	public void showDealerCards() {
		System.out.println("These are the dealer's cards: ");
		dealerHand.showCards();
		System.out.println("Dealers current points are: " + dealerHand.getHandValue());
	}

	public void showPlayerCards() {
		System.out.println("These are your cards: ");
		playerHand.showCards();
		System.out.println("Your current points are: " + playerHand.getHandValue());
	}

	public void menuOptions() {
		playerMenu();
	}

	public void playerMenu() {
		while (true) {
			playerHand.getHandValue();
			dealerHand.getHandValue();
			if (dealerHand.checkBlackjack() == true) {
				System.out.println("Dealer got Blackjack. Dealer Wins. Please try again.");
				showDealerCards();
				break;
			}
			if (playerHand.checkBlackjack() == true) {
				System.out.println("Player got Blackjack. Dealer Wins. Please try again.");
				showDealerCards();
				break;
			}
			playerHand.checkIfBusted();
			if (playerHand.isBusted == true) {
				System.out.println("You busted! Dealer wins. Please Try again.");
				break;
			}
			System.out.println("What would you like to do?");
			System.out.println("Hit (H) or Stand (S)|| Type exit to quit.");
			System.out.println("Please type the corresponding letter: ");
			String input = scanner.nextLine();
			gameLogic(input);
		}
	}

	public void gameLogic(String i) {
		if (i.toUpperCase().equals("H")) {
			playerHand.hit(deck.getNextCard());
			showPlayerCards();

		} else if (i.toUpperCase().equals("S")) {
			showDealerCards();
			while (dealerHand.getHandValue() <= 17) {
				if (dealerHand.getHandValue() == 17 && dealerHand.getNumberOfAces() == 0) {
					System.out.println("Dealer Busts with a soft 17 and No Aces. You win!");
					System.exit(0);
				}
				dealerHand.hit(deck.getNextCard());
				dealerHand.getHandValue();
				showDealerCards();
			}
			if (dealerHand.getHandValue() <= 21) {
				checkWinner();
			} else {
				System.out.println("Dealer busts. You win!");
				System.exit(0);
			}
		} else if (i.toUpperCase().equals("EXIT")) {
			System.out.println("Goodbye!");
			System.exit(0);
		} else {
			System.out.println("Please enter a valid option.");
		}
	}

	public void checkWinner() {
		if (playerHand.getHandValue() > dealerHand.getHandValue()) {
			System.out.println("You win!");
			System.exit(0);
		} else if (dealerHand.getHandValue() > playerHand.getHandValue()) {
			System.out.println("Dealer Wins! Please play again.");
			System.exit(0);
		} else {
			System.out.println("You pushed. Please play again.");
			System.exit(0);
		}
	}


	
	public boolean isPlayerWinner(int player, int dealer) {
		if(player>dealer) {
			return true;
		}
		else {
			return false;}
	}
	
	public boolean isDealerWinner(int player, int dealer) {
		if(dealer>player) {
			return true;
		}
		else {
			return false;}
	}
	
	public boolean isBlackJack(int x, int y) {
		if(x == 21 && y == 2) {
			return true;
		}
		return false;
	}
	
	public boolean isPush(int x, int y) {
		if(x==y) {
			return true;
		}
		else
			return false;
	}
	
	public int getDealerSize(Hand hand) {
		return hand.getHandSize();
	}
	
	public boolean checkPlayerStand(Hand playerHand, Hand dealerHand) {
		if(playerHand.getHandSize()<dealerHand.getHandSize()) {
			return true;
		}
		else
			return false;
	}
		



public static void main(String args[]) {
	Console console = new Console();
	console.showDealerTopCard();
	console.showPlayerCards();
	console.menuOptions();
}
}
