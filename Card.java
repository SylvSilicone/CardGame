public class Card {
    public int rank;
    public String suit;
    public Card(int rank, String suit)
    {
        rank = this.rank;
        suit = this.suit;
    }

    public int getRank()
    {
        return rank;
    }
    public String getSuit()
    {
        return suit;
    }
    public String toString()
    {
        String returningRank = "";
        if(returningRank.equals("Jack"))
        {
            rank = 11;
        }
        if(returningRank.equals("Queen"))
        {
            rank = 12;
        }
        if(returningRank.equals("King"))
        {
            rank = 13;
        }
        if(returningRank.equals("Ace"))
        {
            rank = 14;
        }
        return "Card with rank " + rank + " and suit " + suit;
    }
}
