package Runner;

import internal.Helmet;

public class HelmetRunner {
    public static void main(String[] args) {
        Helmet helmet1 = new Helmet("Vega", "Black", "M", 1200);
        Helmet helmet2 = new Helmet("Studds", "Red", "L", 1500);
        Helmet helmet3 = new Helmet("Studds", "Red", "L", 1500);

        System.out.println(helmet1);
        System.out.println(helmet2);
        System.out.println(helmet3);

        boolean noMatch = helmet1.equals(helmet3);   // false
        boolean isMatch = helmet2.equals(helmet3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
