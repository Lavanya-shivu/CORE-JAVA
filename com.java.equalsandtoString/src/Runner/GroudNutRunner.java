package Runner;

import internal.GroundNut;

public class GroudNutRunner {
    public static void main(String[] args) {
        GroundNut groundNut = new GroundNut("Roasted", "India", 2, 120);
        GroundNut groundNut1 = new GroundNut("Boiled", "India", 3, 100);
        GroundNut groundNut2 = new GroundNut("Boiled", "India", 3, 100);

        System.out.println(groundNut);
        System.out.println(groundNut1);
        System.out.println(groundNut2);

        boolean noMatch = groundNut.equals(groundNut2);
        boolean isMatch = groundNut1.equals(groundNut2);

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
