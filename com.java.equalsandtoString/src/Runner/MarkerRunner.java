package Runner;

import internal.Marker;

public class MarkerRunner {
    public static void main(String[] args) {
        Marker m1 = new Marker();
        m1.setColor("Blue");
        m1.setBrand("Camlin");
        m1.setIsRefillable(true);
        m1.setTipType("Chisel");

        Marker m2 = new Marker();
        m2.setColor("Blue");
        m2.setBrand("Camlin");
        m2.setIsRefillable(true);
        m2.setTipType("Chisel");

        Marker m3 = new Marker();
        m3.setColor("Red");
        m3.setBrand("Luxor");
        m3.setIsRefillable(false);
        m3.setTipType("Bullet");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        boolean match = m1.equals(m2);     // should be true
        boolean notMatch = m2.equals(m3);  // should be false

        System.out.println("Markers match result: " + match);
        System.err.println("Markers not match result: " + notMatch);
    }
}
