package Runner;

import internal.Magazine;

public class MagazineRunner {
    public static void main(String[] args) {
        Magazine magazine1 = new Magazine("Time", "Time Inc.", 2023, 5.99);
        Magazine magazine2 = new Magazine("National Geographic", "National Geographic Partners", 2024, 7.99);
        Magazine magazine3 = new Magazine("National Geographic", "National Geographic Partners", 2024, 7.99);

        System.out.println(magazine1);
        System.out.println(magazine2);
        System.out.println(magazine3);

        boolean noMatch = magazine1.equals(magazine3);   // false
        boolean isMatch = magazine2.equals(magazine3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
