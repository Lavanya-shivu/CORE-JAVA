package Runner;

import internal.GreetingCard;

public class GreetingCardRunner {
    public static void main(String[] args) {
        GreetingCard card1 = new GreetingCard("Happy Birthday!", "Alice", "Birthday", 50);
        GreetingCard card2 = new GreetingCard("Best Wishes", "Bob", "Graduation", 40);
        GreetingCard card3 = new GreetingCard("Best Wishes", "Bob", "Graduation", 40);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        boolean noMatch = card1.equals(card3);   // false
        boolean isMatch = card2.equals(card3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
