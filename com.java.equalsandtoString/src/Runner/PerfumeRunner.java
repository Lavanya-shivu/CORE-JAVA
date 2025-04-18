package Runner;

import internal.Perfume;

public class PerfumeRunner {
    public static void main(String[] args) {
        Perfume perfume1 = new Perfume("Rose", "AromaCo", 100, 1200);
        Perfume perfume2 = new Perfume("Lavender", "ScentX", 80, 950);
        Perfume perfume3 = new Perfume("Lavender", "ScentX", 80, 950);

        System.out.println(perfume1);
        System.out.println(perfume2);
        System.out.println(perfume3);

        boolean noMatch = perfume1.equals(perfume3);   // false
        boolean isMatch = perfume2.equals(perfume3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
