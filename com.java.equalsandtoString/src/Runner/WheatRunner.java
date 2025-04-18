package Runner;

import internal.Wheat;

public class WheatRunner {
    public static void main(String[] args) {
        Wheat wheat1 = new Wheat("Durum", "Punjab", 100, 2500);
        Wheat wheat2 = new Wheat("Emmer", "UP", 80, 2000);
        Wheat wheat3 = new Wheat("Emmer", "UP", 80, 2000);

        System.out.println(wheat1);
        System.out.println(wheat2);
        System.out.println(wheat3);

        boolean noMatch = wheat1.equals(wheat3);   // false
        boolean isMatch = wheat2.equals(wheat3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
