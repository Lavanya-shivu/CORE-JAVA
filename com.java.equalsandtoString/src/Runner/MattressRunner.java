package Runner;

import internal.Mattress;

public class MattressRunner {
    public static void main(String[] args) {
        Mattress m1 = new Mattress();
        m1.setBrand("SleepWell");
        m1.setType("Memory Foam");
        m1.setSize("Queen");
        m1.setPrice(12000);

        Mattress m2 = new Mattress();
        m2.setBrand("Peps");
        m2.setType("Spring");
        m2.setSize("King");
        m2.setPrice(15000);

        Mattress m3 = new Mattress();
        m3.setBrand("Peps");
        m3.setType("Spring");
        m3.setSize("King");
        m3.setPrice(15000);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        boolean notMatch = m1.equals(m2);
        boolean match = m2.equals(m3);

        System.out.println("Match result: " + match);
        System.err.println("Not match result: " + notMatch);
    }
}
