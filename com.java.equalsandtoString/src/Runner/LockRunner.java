package Runner;

import internal.Lock;

public class LockRunner {
    public static void main(String[] args) {
        Lock l1 = new Lock();
        l1.setBrand("Godrej");
        l1.setMaterial("Steel");
        l1.setType("Padlock");
        l1.setKeyCount(2);

        Lock l2 = new Lock();
        l2.setBrand("Hercules");
        l2.setMaterial("Brass");
        l2.setType("Door Lock");
        l2.setKeyCount(3);

        Lock l3 = new Lock();
        l3.setBrand("Hercules");
        l3.setMaterial("Brass");
        l3.setType("Door Lock");
        l3.setKeyCount(3);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        boolean notMatch = l1.equals(l2);  // should be false
        boolean match = l2.equals(l3);     // should be true

        System.out.println("Match result: " + match);
        System.err.println("Not match result: " + notMatch);
    }
}
