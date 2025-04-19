package Runner;

import internal.Comb;

public class CombRunner {
    public static void main(String[] args) {
        Comb comb1 = new Comb();
        comb1.setMaterial("Plastic");
        comb1.setColor("Black");
        comb1.setTeethcount(20);
        comb1.setFoldable(true);

        Comb comb2 = new Comb();
        comb2.setMaterial("Plastic");
        comb2.setColor("Black");
        comb2.setTeethcount(20);
        comb2.setFoldable(true);

        Comb comb3 = new Comb();
        comb3.setMaterial("Wood");
        comb3.setColor("Brown");
        comb3.setTeethcount(18);
        comb3.setFoldable(false);

        System.out.println(comb1);
        System.out.println(comb2);
        System.out.println(comb3);

        boolean match = comb1.equals(comb2);
        boolean notMatch = comb2.equals(comb3);

        System.out.println("Match result: " + match);
        System.err.println("Not match result: " + notMatch);
    }
}
