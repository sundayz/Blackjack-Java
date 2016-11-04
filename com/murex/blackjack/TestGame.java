package com.murex.blackjack;
import java.util.Scanner;

public class TestGame {
	
	private static Scanner scanner;
	
	public static void main(String[] args){

		int PlayerScore;
		int DealerScore;
		boolean Continue = true;
		
		while(Continue == true) {
			
			Deck deck = new CardDeck();
			Dealer dealer = new Dealer(deck);
			Player player = new Player();
			
			
			player.addCard(dealer.dealCard());
			dealer.addCard(dealer.dealCard());
			
			player.addCard(dealer.dealCard());
			dealer.addCard(dealer.dealCard());
			
			for(Card card : player.getHand().getCards()){
				System.out.println("Player got " + card);
			}
			
			for(Card card : dealer.getHand().getCards()){
				System.out.println("Dealer got " + card);
			}
			
			PlayerScore = player.getHand().getValue();
			DealerScore = dealer.getHand().getValue();
			
			if (PlayerScore == 21) {
				System.out.println("Player wins with a Blackjack.");
			} else if (PlayerScore > 21) {
				System.out.println("Dealer wins, player loses.");
			} else if (PlayerScore > DealerScore) {			
				System.out.printf("Player wins %d points to %d.%n", PlayerScore, DealerScore);
			} else {
				System.out.printf("Dealer wins %d points to %d.%n", DealerScore, PlayerScore);
			}
			
			scanner = new Scanner(System.in);
			System.out.println("Do you want to play again? y/n");
			String x = scanner.nextLine();
			 if (x.toLowerCase().equals("y")) {
				Continue = true;
			} else if (x.toLowerCase().equals("n")) {
				Continue = false;
			}

		}
		System.exit(0);
	}

}
