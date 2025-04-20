package internal;

public class Triangle extends Polygon{

    @Override
    public void calculateArea(){
        System.out.println("Area of Triangle");
    }
    @Override
    public void calculatePerimeter(){
        System.out.println("Perimeter of Triangle");
    }
    @Override
    public void getSides(){
        System.out.println("Triangle has 3 sides");
    }
    @Override
    public void displayType(){
       System.out.println("This is a Triangle");
    }
    @Override
    public void draw(){
        System.out.println("Draw a Triangle");
    }
}
