package Runner;

import internal.Toothpaste;

public class ToothpasteRunner {
    public static void main(String[] args) {
        Toothpaste paste1 = new Toothpaste();
        paste1.setBrand("Colgate");
        paste1.setFlavor("Mint");
        paste1.setWeight(100);
        paste1.setWhitening(true);

        Toothpaste paste2 = new Toothpaste();
        paste2.setBrand("Colgate");
        paste2.setFlavor("Mint");
        paste2.setWeight(100);
        paste2.setWhitening(true);

        Toothpaste paste3 = new Toothpaste();
        paste3.setBrand("Pepsodent");
        paste3.setFlavor("Clove");
        paste3.setWeight(120);
        paste3.setWhitening(false);

        System.out.println(paste1);
        System.out.println(paste2);
        System.out.println(paste3);

        boolean match = paste1.equals(paste2);
        boolean notMatch = paste2.equals(paste3);

        System.out.println("Match result: " + match);
        System.err.println("Not match result: " + notMatch);
    }
}
