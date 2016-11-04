package com.murex.blackjack;

public class DefaultCard implements Card {

	int cardValue;
	Suit suitType;
	
	/* Constructor */
	public DefaultCard(int value, Suit suit) {
		cardValue = value;
		suitType = suit;
	}

	@Override
	public int getValue() {
		return cardValue;
	}

	@Override
	public Suit getSuit() {
		return suitType;
	}
	
}
