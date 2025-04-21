package internal;
// Declare an abstract class with one abstract method and one concrete method and extend it by a subclass. Create copy of subclass
public abstract class AbstractShape {
    public String color;
    public AbstractShape(String color) {
        this.color = color;
    }


    public void displayColor() {
        System.out.println("Color: " + color);
    }

    public abstract double calculateArea();
}
