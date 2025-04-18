package Runner;

import internal.Balloon;

public class BalloonRunner {
    public static void main(String[] args) {
        Balloon balloon1 = new Balloon("Red", "Heart", 12, 10);
        Balloon balloon2 = new Balloon("Blue", "Round", 10, 8);
        Balloon balloon3 = new Balloon("Blue", "Round", 10, 8);

        System.out.println(balloon1);
        System.out.println(balloon2);
        System.out.println(balloon3);

        boolean noMatch = balloon1.equals(balloon3);   // false
        boolean isMatch = balloon2.equals(balloon3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
