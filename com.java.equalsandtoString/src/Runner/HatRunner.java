package Runner;

import internal.Hat;

public class HatRunner {
    public static void main(String[] args) {
        Hat hat1 = new Hat("Black", "Wool", "M", 499);
        Hat hat2 = new Hat("Brown", "Cotton", "L", 399);
        Hat hat3 = new Hat("Brown", "Cotton", "L", 399);

        System.out.println(hat1);
        System.out.println(hat2);
        System.out.println(hat3);

        boolean noMatch = hat1.equals(hat3);   // false
        boolean isMatch = hat2.equals(hat3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
