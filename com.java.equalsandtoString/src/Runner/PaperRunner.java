package Runner;

import internal.Paper;

public class PaperRunner {
    public static void main(String[] args) {
        Paper p1 = new Paper();
        p1.setSize("A4");
        p1.setColor("White");
        p1.setIsCrumpled(false);
        p1.setMaterial("Premium");

        Paper p2 = new Paper();
        p2.setSize("A3");
        p2.setColor("Yellow");
        p2.setIsCrumpled(true);
        p2.setMaterial("Standard");

        Paper p3 = new Paper();
        p3.setSize("A4");
        p3.setColor("White");
        p3.setIsCrumpled(false);
        p3.setMaterial("Premium");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        boolean notMatch = p1.equals(p2);  // should be false (one is crumpled)
        boolean match = p1.equals(p3);     // should be true (they match)

        System.out.println("Match result: " + match);
        System.err.println("Not match result: " + notMatch);
    }
}
