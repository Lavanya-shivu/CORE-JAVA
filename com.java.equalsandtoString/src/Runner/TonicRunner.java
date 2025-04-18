package Runner;

import internal.Tonic;

public class TonicRunner {
    public static void main(String[] args) {
        Tonic tonic1 = new Tonic("Energy Boost", "VitalPro", 200, 50);
        Tonic tonic2 = new Tonic("Immunity Plus", "HerboCare", 250, 60);
        Tonic tonic3 = new Tonic("Immunity Plus", "HerboCare", 250, 60);

        System.out.println(tonic1);
        System.out.println(tonic2);
        System.out.println(tonic3);

        boolean noMatch = tonic1.equals(tonic3);   // false
        boolean isMatch = tonic2.equals(tonic3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
