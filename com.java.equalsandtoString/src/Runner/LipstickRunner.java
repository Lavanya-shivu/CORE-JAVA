package Runner;

import internal.Lipstick;

public class LipstickRunner {
    public static void main(String[] args) {
        Lipstick lipstick1 = new Lipstick("Ruby Red", "LuxeBeauty", 5, 399);
        Lipstick lipstick2 = new Lipstick("Nude Pink", "GlamPro", 4, 349);
        Lipstick lipstick3 = new Lipstick("Nude Pink", "GlamPro", 4, 349);

        System.out.println(lipstick1);
        System.out.println(lipstick2);
        System.out.println(lipstick3);

        boolean noMatch = lipstick1.equals(lipstick3);  // false
        boolean isMatch = lipstick2.equals(lipstick3);  // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
