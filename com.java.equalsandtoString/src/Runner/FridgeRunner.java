package Runner;

import internal.Fridge;

public class FridgeRunner {
    public static void main(String[] args) {
        Fridge f1 = new Fridge();
        f1.setBrand("CoolMaster");
        f1.setColor("Silver");
        f1.setIsFull(true);
        f1.setTemperature(5);

        Fridge f2 = new Fridge();
        f2.setBrand("FreshKeep");
        f2.setColor("White");
        f2.setIsFull(false);
        f2.setTemperature(7);

        Fridge f3 = new Fridge();
        f3.setBrand("CoolMaster");
        f3.setColor("Silver");
        f3.setIsFull(true);
        f3.setTemperature(5);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        boolean notMatch = f1.equals(f2);  // should be false
        boolean match = f1.equals(f3);     // should be true

        System.out.println("Match result: " + match);
        System.err.println("Not match result: " + notMatch);
    }
}
