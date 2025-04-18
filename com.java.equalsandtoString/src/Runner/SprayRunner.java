package Runner;

import internal.Spray;

public class SprayRunner {
    public static void main(String[] args) {
        Spray spray1 = new Spray("Axe", "Citrus", 150, 6.99);
        Spray spray2 = new Spray("Dove", "Floral", 200, 8.49);
        Spray spray3 = new Spray("Dove", "Floral", 200, 8.49);

        System.out.println(spray1);
        System.out.println(spray2);
        System.out.println(spray3);

        boolean noMatch = spray1.equals(spray3);   // false
        boolean isMatch = spray2.equals(spray3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
