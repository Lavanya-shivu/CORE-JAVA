package internal;

import java.util.Objects;

public class Helmet {
    private String brand;
    private String color;
    private String size;
    private double price;

    public Helmet(String brand, String color, String size, double price) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Helmet{" + "brand='" + brand + ", color='" + color + ", size='" + size +", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Helmet) {
            Helmet helmet = (Helmet) obj;
            if (Objects.equals(this.brand, helmet.brand) &&
                    Objects.equals(this.color, helmet.color) &&
                    Objects.equals(this.size, helmet.size) &&
                    Objects.equals(this.price,helmet.price)) {
                System.out.println("Helmet is Matching");
                return true;
            }
            System.out.println("Helmet is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
