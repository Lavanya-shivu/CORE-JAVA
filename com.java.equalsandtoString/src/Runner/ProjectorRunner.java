package Runner;

import internal.Projector;

public class ProjectorRunner {
    public static void main(String[] args) {
        Projector p1 = new Projector();
        p1.setBrand("Epson");
        p1.setResolution("1080p");
        p1.setBrightness(3000);
        p1.setIsPortable(true);

        Projector p2 = new Projector();
        p2.setBrand("Epson");
        p2.setResolution("1080p");
        p2.setBrightness(3000);
        p2.setIsPortable(true);

        Projector p3 = new Projector();
        p3.setBrand("BenQ");
        p3.setResolution("4K");
        p3.setBrightness(4000);
        p3.setIsPortable(false);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        boolean match = p1.equals(p2);      // true
        boolean notMatch = p2.equals(p3);   // false

        System.out.println("Projector match result: " + match);
        System.err.println("Projector not match result: " + notMatch);
    }
}

