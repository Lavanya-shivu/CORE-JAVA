package Runner;

import internal.Blanket;

public class BlanketRunner {
    public static void main(String[] args) {
        Blanket blanket1 = new Blanket("Cotton", "Blue", "Queen", 1200);
        Blanket blanket2 = new Blanket("Wool", "Red", "Single", 900);
        Blanket blanket3 = new Blanket("Wool", "Red", "Single", 900);

        System.out.println(blanket1);
        System.out.println(blanket2);
        System.out.println(blanket3);

        boolean noMatch = blanket1.equals(blanket3);   // false
        boolean isMatch = blanket2.equals(blanket3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
