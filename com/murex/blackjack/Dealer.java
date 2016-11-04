package com.murex.blackjack;

import java.util.Random;

public class Dealer extends Player{

	public Deck deck;
	
	public Dealer(Deck deck){
		super();
		this.deck = deck;
	}
	
	
	public Card dealCard(){
		Random number = new Random();
		int randomNumber = number.nextInt(51);
		return this.deck.getCards().get(randomNumber);
	}
	

}
