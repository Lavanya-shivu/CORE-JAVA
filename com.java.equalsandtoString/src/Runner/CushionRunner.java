package Runner;

import internal.Cushion;

public class CushionRunner {
    public static void main(String[] args) {
        Cushion c1 = new Cushion();
        c1.setMaterial("Cotton");
        c1.setColor("Blue");
        c1.setShape("Square");
        c1.setPrice(250);

        Cushion c2 = new Cushion();
        c2.setMaterial("Silk");
        c2.setColor("Red");
        c2.setShape("Round");
        c2.setPrice(300);

        Cushion c3 = new Cushion();
        c3.setMaterial("Silk");
        c3.setColor("Red");
        c3.setShape("Round");
        c3.setPrice(300);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        boolean noMatch = c1.equals(c3);  // should be false
        boolean match = c2.equals(c3);    // should be true

        System.out.println("Match result: " + match);
        System.err.println("Not match result: " + noMatch);
    }
}
