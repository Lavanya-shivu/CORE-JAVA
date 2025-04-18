package Runner;

import internal.Boot;

public class BootRunner {
    public static void main(String[] args) {
        Boot boot1 = new Boot("Woodland", "Brown", "9", 3500);
        Boot boot2 = new Boot("Puma", "Black", "8", 3200);
        Boot boot3 = new Boot("Puma", "Black", "8", 3200);

        System.out.println(boot1);
        System.out.println(boot2);
        System.out.println(boot3);

        boolean noMatch = boot1.equals(boot3);   // false
        boolean isMatch = boot2.equals(boot3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
