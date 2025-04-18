package Runner;

import internal.Storm;

public class StromRunner {
    public static void main(String[] args) {
        Storm storm1 = new Storm("Cyclone Mocha", "Category 3", 150, 980);
        Storm storm2 = new Storm("Cyclone Biparjoy", "Category 2", 130, 990);
        Storm storm3 = new Storm("Cyclone Biparjoy", "Category 2", 130, 990);

        System.out.println(storm1);
        System.out.println(storm2);
        System.out.println(storm3);

        boolean noMatch = storm1.equals(storm3);   // false
        boolean isMatch = storm2.equals(storm3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
