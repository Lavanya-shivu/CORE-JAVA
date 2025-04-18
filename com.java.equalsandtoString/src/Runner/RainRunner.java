package Runner;

import internal.Rain;

public class RainRunner {
    public static void main(String[] args) {
        Rain rain1 = new Rain("Heavy", "Mumbai", 60, 80);
        Rain rain2 = new Rain("Light", "Pune", 30, 20);
        Rain rain3 = new Rain("Light", "Pune", 30, 20);

        System.out.println(rain1);
        System.out.println(rain2);
        System.out.println(rain3);

        boolean noMatch = rain1.equals(rain3);   // false
        boolean isMatch = rain2.equals(rain3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
