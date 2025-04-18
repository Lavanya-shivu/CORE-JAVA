package internal;

import java.util.Objects;

public class Balloon {
    private String color;
    private String shape;
    private int size;      // in inches
    private int price;

    public Balloon(String color, String shape, int size, int price) {
        this.color = color;
        this.shape = shape;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{Balloon" + "color=" +color+ "shape=" +shape+ "size=" + size + "price=" +price+ '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Balloon) {
            Balloon balloon = (Balloon) obj;
            if (Objects.equals(this.color, balloon.color) &&
                    Objects.equals(this.shape, balloon.shape) &&
                    Objects.equals(this.size, balloon.size) &&
            Objects.equals(this.price, balloon.price)) {

                System.out.println("Balloon is Matching");
                return true;
            }
            System.out.println("Balloon is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
