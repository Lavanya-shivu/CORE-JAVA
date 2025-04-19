package Runner;

import internal.Suitcase;

public class SuitcaseRunner {
    public static void main(String[] args) {
        Suitcase suitcase = new Suitcase();
        suitcase.setMaterial("Fiber");
        suitcase.setColor("Blue");
        suitcase.setBrand("Sky Bag");
        suitcase.setSize("L");

        Suitcase suitcase1 = new Suitcase();
        suitcase1.setMaterial("Cloth");
        suitcase1.setColor("Green");
        suitcase1.setBrand("VIP");
        suitcase1.setSize("M");

        Suitcase suitcase2 = new Suitcase();
        suitcase2.setMaterial("Fiber");
        suitcase2.setColor("Blue");
        suitcase2.setBrand("Sky Bag");
        suitcase2.setSize("L");

        System.out.println(suitcase);
        System.out.println(suitcase1);
        System.out.println(suitcase2);

        boolean match = suitcase.equals(suitcase2);
        boolean nomatch = suitcase2.equals(suitcase1);

        System.out.println("Suitcases are matching");
        System.err.println("Suitcases are not matching");
    }
}
