package Runner;

import internal.Door;

public class DoorRunner {
    public static void main(String[] args) {
        Door d1 = new Door();
        d1.setMaterial("Wood");
        d1.setColor("Brown");
        d1.setType("Sliding");
        d1.setHeight(200);

        Door d2 = new Door();
        d2.setMaterial("Steel");
        d2.setColor("White");
        d2.setType("Swing");
        d2.setHeight(210);

        Door d3 = new Door();
        d3.setMaterial("Steel");
        d3.setColor("White");
        d3.setType("Swing");
        d3.setHeight(210);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        boolean notMatch = d1.equals(d2);  // should be false
        boolean match = d2.equals(d3);     // should be true

        System.out.println("Match result: " + match);
        System.err.println("Not match result: " + notMatch);
    }
}
