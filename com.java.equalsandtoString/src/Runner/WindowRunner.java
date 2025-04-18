package Runner;

import internal.Window;
public class WindowRunner {
    public static void main(String[] args) {
        Window w1 = new Window();
        w1.setMaterial("Wood");
        w1.setColor("Brown");
        w1.setType("Sliding");
        w1.setHeight(120);

        Window w2 = new Window();
        w2.setMaterial("Aluminum");
        w2.setColor("White");
        w2.setType("Casement");
        w2.setHeight(150);

        Window w3 = new Window();
        w3.setMaterial("Aluminum");
        w3.setColor("White");
        w3.setType("Casement");
        w3.setHeight(150);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);

        boolean notMatch = w1.equals(w3);  // false
        boolean match = w2.equals(w3);     // true

        System.out.println("Match result: " + match);
        System.err.println("Not match result: " + notMatch);
    }
}
