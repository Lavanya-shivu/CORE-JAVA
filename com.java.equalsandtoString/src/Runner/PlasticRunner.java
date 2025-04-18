package Runner;

import internal.Plastic;

public class PlasticRunner {
    public static void main(String[] args) {
        Plastic plastic = new Plastic("Polyethylene", "White", 200,"A");
        Plastic plastic1 = new Plastic("Polyethylene", "Black", 270,"B");
        Plastic plastic2 =  new Plastic("Polyethylene", "Black" ,270,"B");

        System.out.println("plastic");
        System.out.println("plastic1");
        System.out.println("plastic2");

        boolean match = plastic1.equals(plastic2);
        boolean nomatch = plastic.equals(plastic2);

        System.out.println("Match result:" + match);
        System.out.println("Not Matching result:" +nomatch);

    }
}
