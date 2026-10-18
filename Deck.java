
import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
    private ArrayList<Card> cards;
    private int nextCard;

    public Deck()
    {
        cards = new ArrayList<Card>();
        nextCard = 0;

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (String suit : suits)
        {
            for (int rank = 2; rank <= 14; rank++)
            {
                cards.add(new Card(rank, suit));
            }
        }

        shuffle();
    }

    public void shuffle()
    {
        Collections.shuffle(cards);
        nextCard = 0;
    }

    public Card dealCard()
    {
        if (nextCard >= cards.size())
        {
            return null;
        }

        return cards.get(nextCard++);
    }

    public int cardsRemaining()
    {
        return cards.size() - nextCard;
    }
}
