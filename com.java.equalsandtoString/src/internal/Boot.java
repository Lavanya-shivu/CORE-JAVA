package internal;

import java.util.Objects;

public class Boot {
    private String brand;
    private String color;
    private String size;
    private double price;

    public Boot(String brand, String color, String size, double price) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Boot{" + "brand='" + brand + ", color='" + color + ", size='" + size + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Boot) {
            Boot price = (Boot) obj;
            if (Objects.equals(this.brand, price.brand) &&
                    Objects.equals(this.color, price.color) &&
                    Objects.equals(this.size, price.size) &&
                    Objects.equals(this.price,price.price)) {
                System.out.println("Boot is Matching");
                return true;
            }
            System.out.println("Boot is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
