package Runner;

import internal.Gloves;

public class GlovesRunner {
    public static void main(String[] args) {
        Gloves gloves1 = new Gloves("Leather", "Black", "M", 799);
        Gloves gloves2 = new Gloves("Cotton", "White", "L", 499);
        Gloves gloves3 = new Gloves("Cotton", "White", "L", 499);

        System.out.println(gloves1);
        System.out.println(gloves2);
        System.out.println(gloves3);

        boolean noMatch = gloves1.equals(gloves3);   // false
        boolean isMatch = gloves2.equals(gloves3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
