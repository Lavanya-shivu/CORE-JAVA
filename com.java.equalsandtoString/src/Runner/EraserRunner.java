package Runner;

import internal.Eraser;

public class EraserRunner {
    public static void main(String[] args) {
        Eraser e1 = new Eraser();
        e1.setColor("White");
        e1.setShape("Rectangle");
        e1.setBrand("Apsara");
        e1.setIsDustFree(true);

        Eraser e2 = new Eraser();
        e2.setColor("White");
        e2.setShape("Rectangle");
        e2.setBrand("Apsara");
        e2.setIsDustFree(true);

        Eraser e3 = new Eraser();
        e3.setColor("Pink");
        e3.setShape("Oval");
        e3.setBrand("Natraj");
        e3.setIsDustFree(false);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        boolean match = e1.equals(e2);      // expected true
        boolean notMatch = e2.equals(e3);   // expected false

        System.out.println("Eraser match result: " + match);
        System.err.println("Eraser not match result: " + notMatch);
    }
}
