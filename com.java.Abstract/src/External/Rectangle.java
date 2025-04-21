package External;

import internal.AbstractShape;

public class Rectangle extends AbstractShape {
    public double length;
    public double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle original) {
        super(original.color);
        this.length = original.length;
        this.width = original.width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    public void displayDetails() {
        displayColor();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}
