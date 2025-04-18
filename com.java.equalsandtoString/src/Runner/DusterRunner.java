package Runner;

import internal.Duster;

public class DusterRunner {
    public static void main(String[] args) {
        Duster d1 = new Duster();
        d1.setBrand("CleanMaster");
        d1.setColor("Blue");
        d1.setIsDusty(false);
        d1.setMaterial("Microfiber");

        Duster d2 = new Duster();
        d2.setBrand("DustAway");
        d2.setColor("Yellow");
        d2.setIsDusty(true);
        d2.setMaterial("Cotton");

        Duster d3 = new Duster();
        d3.setBrand("CleanMaster");
        d3.setColor("Blue");
        d3.setIsDusty(false);
        d3.setMaterial("Microfiber");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        boolean match = d1.equals(d3);     // should return true
        boolean notMatch = d2.equals(d3);  // should return false

        System.out.println("Matching result: " + match);
        System.err.println("Not Matching result: " + notMatch);
    }
}
