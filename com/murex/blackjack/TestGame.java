package com.murex.blackjack;

public class TestGame {
	
	public static void main(String[] args){
		
		int PlayerScore;
		int DealerScore;
		
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
		
		if (PlayerScore > DealerScore) {
			System.out.printf("Player wins %d points to %d.", PlayerScore, DealerScore);
		} else {
			System.out.printf("Dealer wins %d points to %d.", DealerScore, PlayerScore);
		}

		
	}

}
