package Runner;

import External.Rectangle;

public class ShapeRunner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle("Blue", 5.0, 3.0);
        System.out.println("Original Rectangle:");
        rect1.displayDetails();

        Rectangle rect2 = new Rectangle(rect1);
        System.out.println("\nCopied Rectangle:");
        rect2.displayDetails();
    }
}
