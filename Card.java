
public class Card
{
    private int rank;
    private String suit;

    public Card(int rank, String suit)
    {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank()
    {
        return rank;
    }

    public String getSuit()
    {
        return suit;
    }

    public static String rankName(int rank)
    {
        if (rank == 11)
            return "Jack";
        if (rank == 12)
            return "Queen";
        if (rank == 13)
            return "King";
        if (rank == 14)
            return "Ace";

        return "" + rank;
    }

    public String toString()
    {
        return rankName(rank) + " of " + suit;
    }
}
