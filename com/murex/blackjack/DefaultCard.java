package com.murex.blackjack;

public class DefaultCard implements Card {

	private CardFace cardFace;
	private Suit suitType;
	
	/* Constructor */
	public DefaultCard(CardFace cardFace, Suit suit) {
		this.cardFace = cardFace;
		this.suitType = suit;
	}

	@Override
	public int getValue() {
		return cardFace.getValue();
	}

	@Override
	public Suit getSuit() {
		return suitType;
	}
	
	@Override
	public String toString() {
		return cardFace.toString() + " of " + suitType.toString();
	}
	
}
