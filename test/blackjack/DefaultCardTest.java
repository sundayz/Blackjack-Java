package test.blackjack;

import org.junit.Assert;
import org.junit.Test;

import com.murex.blackjack.DefaultCard;
import com.murex.blackjack.Suit;


public class DefaultCardTest {

	@Test
	public void card_has_value_and_suit() {
		DefaultCard card = new DefaultCard(1, Suit.CLUBS);
		Assert.assertEquals(Suit.CLUBS, card.getSuit());
		Assert.assertEquals(1, card.getValue());
	}

}
