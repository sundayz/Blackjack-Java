package com.murex.blackjack;


import org.junit.Assert;
import org.junit.Test;


public class HandTest {

	@Test
	public void hand_has_2_cards() {
		DefaultHand hand = new DefaultHand();
		hand.addCard(new DefaultCard(10, Suit.CLUBS));
		hand.addCard(new DefaultCard(20, Suit.CLUBS));
		Assert.assertEquals(2, hand.getCards().size());
	}
	
	@Test
	public void value_of_hand_with_cards() {
		DefaultHand hand = new DefaultHand();
		hand.addCard(new DefaultCard(10, Suit.CLUBS));
		hand.addCard(new DefaultCard(20, Suit.CLUBS));
		Assert.assertEquals(30, hand.getValue());
	}
	
	@Test
	public void value_of_hand_with_other_cards() {
		DefaultHand hand = new DefaultHand();
		hand.addCard(new DefaultCard(10, Suit.CLUBS));
		hand.addCard(new DefaultCard(10, Suit.CLUBS));
		Assert.assertEquals(20, hand.getValue());
	}

}
