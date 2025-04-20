package internal;

public class Rectangle extends Polygon{

    @Override
    public void calculateArea(){
        System.out.println("Area of Rectangle");
    }
    @Override
    public void calculatePerimeter(){
        System.out.println("Perimeter of Rectangle");
    }
    @Override
    public void getSides(){
        System.out.println("Rectangle has 4 sides");
    }
    @Override
    public void displayType(){
        System.out.println("This is a Rectangle");
    }
    @Override
    public void draw(){
        System.out.println("Draw a Rectangle");
    }

}
