package Runner;

import internal.Sponge;

public class SpongeRunner {
    public static void main(String[] args) {
        Sponge s1 = new Sponge();
        s1.setShape("Rectangle");
        s1.setColor("Yellow");
        s1.setIsWet(true);
        s1.setMaterial("Foam");

        Sponge s2 = new Sponge();
        s2.setShape("Rectangle");
        s2.setColor("Yellow");
        s2.setIsWet(true);
        s2.setMaterial("Foam");

        Sponge s3 = new Sponge();
        s3.setShape("Circle");
        s3.setColor("Blue");
        s3.setIsWet(false);
        s3.setMaterial("Sponge");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        boolean match = s1.equals(s2);     // should return true
        boolean notMatch = s2.equals(s3);  // should return false

        System.out.println("Sponges match result: " + match);
        System.err.println("Sponges not match result: " + notMatch);
    }
}
