
import java.util.Scanner;

public class InBetween
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();

        int chips = 100;

        System.out.println("=== IN-BETWEEN ===");
        System.out.println("You start with 100 chips.");

        while (chips > 0 && deck.cardsRemaining() >= 3)
        {
            System.out.println("\nChips: " + chips);

            int wager = 0;

            while (wager < 1 || wager > chips)
            {
                System.out.print("How many chips do you want to wager? ");

                if (input.hasNextInt())
                {
                    wager = input.nextInt();

                    if (wager < 1 || wager > chips)
                    {
                        System.out.println("Invalid wager.");
                    }
                }
                else
                {
                    input.next();
                    System.out.println("Enter a whole number.");
                }
            }

            Card first = deck.dealCard();
            Card second = deck.dealCard();

            System.out.println("First card: " + first);
            System.out.println("Second card: " + second);

            if (first.getRank() == second.getRank())
            {
                chips += 2;
                System.out.println("Same rank! You win 2 chips.");
                continue;
            }

            int low = Math.min(first.getRank(), second.getRank());
            int high = Math.max(first.getRank(), second.getRank());

            System.out.println(
                "The third card must be between "
                + Card.rankName(low) + " and "
                + Card.rankName(high) + "."
            );

            if (wager * 2 <= chips)
            {
                System.out.print("Double your wager? (y/n): ");

                if (input.next().equalsIgnoreCase("y"))
                {
                    wager *= 2;
                }
            }

            Card third = deck.dealCard();
            System.out.println("Third card: " + third);

            if (third.getRank() > low && third.getRank() < high)
            {
                chips += wager;
                System.out.println("You win " + wager + " chips!");
            }
            else
            {
                chips -= wager;
                System.out.println("You lose " + wager + " chips.");
            }
        }

        System.out.println("\nGame over!");
        System.out.println("Final chips: " + chips);

        input.close();
    }
}
