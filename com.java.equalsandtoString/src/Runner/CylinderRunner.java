package Runner;

import internal.Cylinder;

public class CylinderRunner {
    public static void main(String args[]){
        Cylinder cylinder = new Cylinder();
        cylinder.setMaterial("Steel");
        cylinder.setColor("Red");
        cylinder.setHeight(20);
        cylinder.setRadius(5);

        Cylinder cylinder1 = new Cylinder();
        cylinder1.setMaterial("Steel");
        cylinder1.setColor("Blue");
        cylinder1.setHeight(21);
        cylinder1.setRadius(4);

        Cylinder cylinder2 = new Cylinder();
        cylinder2.setMaterial("Steel");
        cylinder2.setColor("Red");
        cylinder2.setHeight(20);
        cylinder2.setRadius(5);

        System.out.println(cylinder);
        System.out.println(cylinder1);
        System.out.println(cylinder2);

        boolean match = cylinder.equals(cylinder2);
        boolean nomatch = cylinder.equals(cylinder1);

        System.out.println("Match result:" +match);
        System.out.println("No match results:" +nomatch);
    }
}
