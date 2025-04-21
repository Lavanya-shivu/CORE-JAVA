package Runner;

import External.Laptop;

public class DeviceRunner {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", 65, 8);
        System.out.println("Original Laptop:");
        laptop1.displayDetails();
        laptop1.start();
        laptop1.shutdown();

        System.out.println("\nCopied Laptop:");
        Laptop laptop2 = new Laptop(laptop1);
        laptop2.displayDetails();
        laptop2.start();
        laptop2.shutdown();
    }
}
