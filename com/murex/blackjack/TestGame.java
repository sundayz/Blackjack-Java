package com.murex.blackjack;

public class TestGame {
	
	public static void main(String[] args){
		Deck deck = new CardDeck();
		
		Dealer dealer = new Dealer(deck);
		
		Player player = new Player();
		
		
		player.addCard(dealer.dealCard());
		dealer.addCard(dealer.dealCard());
		
		player.addCard(dealer.dealCard());
		dealer.addCard(dealer.dealCard());
		
		player.getHand().getValue();
		dealer.getHand().getValue();
		
		for(Card card : player.getHand().getCards()){
			System.out.println(card);
		}
		
		for(Card card : dealer.getHand().getCards()){
			System.out.println(card);
		}
		
	}

}
