package Runner;

import internal.Fan;

public class FanRunner {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setBrand("Crompton");
        f1.setColor("White");
        f1.setType("Ceiling");
        f1.setSpeed(3);

        Fan f2 = new Fan();
        f2.setBrand("Bajaj");
        f2.setColor("Silver");
        f2.setType("Table");
        f2.setSpeed(2);

        Fan f3 = new Fan();
        f3.setBrand("Bajaj");
        f3.setColor("Silver");
        f3.setType("Table");
        f3.setSpeed(2);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        boolean notMatch = f1.equals(f2);  // should be false
        boolean match = f2.equals(f3);     // should be true

        System.out.println("Match result: " + match);
        System.err.println("Not match result: " + notMatch);
    }
}
