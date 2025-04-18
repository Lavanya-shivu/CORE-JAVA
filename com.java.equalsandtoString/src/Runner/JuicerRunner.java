package Runner;

import internal.Juicer;

public class JuicerRunner {
    public static void main(String[] args) {
        Juicer juicer1 = new Juicer("Philips", "White", 600, 4500);
        Juicer juicer2 = new Juicer("Prestige", "Silver", 500, 3000);
        Juicer juicer3 = new Juicer("Prestige", "Silver", 500, 3000);

        System.out.println(juicer1);
        System.out.println(juicer2);
        System.out.println(juicer3);

        boolean noMatch = juicer1.equals(juicer3);   // false
        boolean isMatch = juicer2.equals(juicer3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
