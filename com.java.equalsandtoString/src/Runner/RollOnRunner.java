package Runner;

import internal.RollOn;

public class RollOnRunner {
    public static void main(String[] args) {
        RollOn rollOn1 = new RollOn("Dove", "Lavender", 50, 4.99);
        RollOn rollOn2 = new RollOn("Nivea", "Fresh", 75, 5.49);
        RollOn rollOn3 = new RollOn("Nivea", "Fresh", 75, 5.49);

        System.out.println(rollOn1);
        System.out.println(rollOn2);
        System.out.println(rollOn3);

        boolean noMatch = rollOn1.equals(rollOn3);   // false
        boolean isMatch = rollOn2.equals(rollOn3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
