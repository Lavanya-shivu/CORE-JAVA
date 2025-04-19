package Runner;

import internal.Shampoo;

public class ShampooRunner {
    public static void main(String[] args) {
        Shampoo shampoo1 = new Shampoo();
        shampoo1.setBrand("Pantene");
        shampoo1.setType("Anti-dandruff");
        shampoo1.setVolume(180);
        shampoo1.setHerbal(false);

        Shampoo shampoo2 = new Shampoo();
        shampoo2.setBrand("Pantene");
        shampoo2.setType("Anti-dandruff");
        shampoo2.setVolume(180);
        shampoo2.setHerbal(false);
        Shampoo shampoo3 = new Shampoo();
        shampoo3.setBrand("Himalaya");
        shampoo3.setType("Herbal");
        shampoo3.setVolume(200);
        shampoo3.setHerbal(true);

        System.out.println(shampoo1);
        System.out.println(shampoo2);
        System.out.println(shampoo3);

        boolean match = shampoo1.equals(shampoo2);
        boolean notMatch = shampoo1.equals(shampoo3);

        System.out.println("Match result: " + match);
        System.err.println("Not match result: " + notMatch);
    }
}
