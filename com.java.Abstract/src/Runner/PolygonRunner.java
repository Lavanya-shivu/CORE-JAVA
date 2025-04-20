package Runner;

import internal.Polygon;
import internal.Rectangle;
import internal.Triangle;

public class PolygonRunner {
    public static void main(String[] args) {
        Polygon polygon = new Triangle();
        polygon.calculateArea();
        polygon.calculatePerimeter();
        polygon.getSides();
        polygon.displayType();
        polygon.draw();

        System.out.println("-----");

        Polygon polygon1 = new Rectangle();
        polygon1.calculateArea();
        polygon1.calculatePerimeter();
        polygon1.getSides();
        polygon1.displayType();
        polygon1.draw();
    }
}
