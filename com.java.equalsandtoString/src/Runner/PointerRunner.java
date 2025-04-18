package Runner;

import internal.Pointer;

public class PointerRunner {
    public static void main(String[] args) {
        Pointer pointer1 = new Pointer();
        pointer1.setType("Laser");
        pointer1.setColor("Red");
        pointer1.setLength(15);
        pointer1.setisLaser(true);

        Pointer pointer2 = new Pointer();
        pointer2.setType("Laser");
        pointer2.setColor("Red");
        pointer2.setLength(15);
        pointer2.setisLaser(true);

        Pointer pointer3 = new Pointer();
        pointer3.setType("Stick");
        pointer3.setColor("Black");
        pointer3.setLength(30);
        pointer3.setisLaser(false);

        System.out.println(pointer1);
        System.out.println(pointer2);
        System.out.println(pointer3);

        boolean match = pointer1.equals(pointer2);      // true
        boolean notMatch = pointer2.equals(pointer3);   // false

        System.out.println("Pointer match result: " + match);
        System.err.println("Pointer not match result: " + notMatch);
    }
}
