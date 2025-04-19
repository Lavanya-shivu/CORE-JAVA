package Runner;

import internal.Dark;

public class DarkRunner {
    public static void main(String[] args) {
        Dark dark = new Dark();
        dark.setShade("Deep Black");
        dark.setIntensity("High");
        dark.setDuration(5);
        dark.setScary(true);

        Dark dark1 = new Dark();
        dark1.setShade("Grey");
        dark1.setIntensity("Medium");
        dark.setDuration(3);
        dark1.setScary(false);

        Dark dark2 = new Dark();
        dark2.setShade("Grey");
        dark2.setIntensity("Medium");
        dark2.setDuration(3);
        dark2.setScary(false);

        System.out.println(dark);
        System.out.println(dark2);
        System.out.println(dark1);

        boolean match = dark2.equals(dark3);
        boolean noMatch = dark1.equals(dark3);

        System.out.println("Match result: " + match);
        System.err.println("No match result: " + noMatch);
    }
}
