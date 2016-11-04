package test.blackjack;


import org.junit.Assert;
import org.junit.Test;

import com.murex.blackjack.CardFace;
import com.murex.blackjack.DefaultCard;
import com.murex.blackjack.DefaultHand;
import com.murex.blackjack.Suit;


public class HandTest {

	@Test
	public void hand_has_2_cards() {
		DefaultHand hand = new DefaultHand();
		hand.addCard(new DefaultCard(CardFace.TEN, Suit.CLUBS));
		hand.addCard(new DefaultCard(CardFace.JACK, Suit.CLUBS));
		Assert.assertEquals(2, hand.getCards().size());
	}
	
	@Test
	public void value_of_hand_with_cards() {
		DefaultHand hand = new DefaultHand();
		hand.addCard(new DefaultCard(CardFace.FIVE, Suit.CLUBS));
		hand.addCard(new DefaultCard(CardFace.THREE, Suit.CLUBS));
		Assert.assertEquals(8, hand.getValue());
	}
	
	@Test
	public void value_of_hand_with_other_cards() {
		DefaultHand hand = new DefaultHand();
		hand.addCard(new DefaultCard(CardFace.QUEEN, Suit.CLUBS));
		hand.addCard(new DefaultCard(CardFace.ACE, Suit.CLUBS));
		Assert.assertEquals(21, hand.getValue());
	}

}
