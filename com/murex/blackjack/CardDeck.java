package com.murex.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck implements Deck {

	private List<Card> cards;

	public CardDeck(){
		cards = buildCards();
	}
	
	private List<Card> buildCards() {
		List<Card> cards = new ArrayList<>();
		Suit[] suits = Suit.values();
		CardFace[] cardFace = CardFace.values();
		for (Suit suit : suits) {
			for (CardFace face : cardFace) {
				Card card = new DefaultCard(face, suit);
				cards.add(card);
			}
		}
		return cards;
	}

	@Override
	public List<Card> getCards() {
		return cards;
	}

}
