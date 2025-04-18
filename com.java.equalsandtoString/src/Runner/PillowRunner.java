package Runner;

import internal.Pillow;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow pillow1 = new Pillow("Cotton", "Square", "Medium", 299);
        Pillow pillow2 = new Pillow("Foam", "Rectangle", "Large", 399);
        Pillow pillow3 = new Pillow("Foam", "Rectangle", "Large", 399);

        System.out.println(pillow1);
        System.out.println(pillow2);
        System.out.println(pillow3);

        boolean noMatch = pillow1.equals(pillow3);   // false
        boolean isMatch = pillow2.equals(pillow3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
