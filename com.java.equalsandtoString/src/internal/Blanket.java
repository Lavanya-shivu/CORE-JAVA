package internal;

import java.util.Objects;

public class Blanket {
    private String material;
    private String color;
    private String size;
    private double price;

    public Blanket(String material, String color, String size, double price) {
        this.material = material;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Blanket{" + "material='" + material +", color='" + color + ", size='" + size + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Blanket) {
            Blanket price = (Blanket) obj;
            if (Objects.equals(this.material, price.material) &&
                    Objects.equals(this.color, price.color) &&
                    Objects.equals(this.size, price.size) &&
                    Objects.equals(this.price,price.price)) {
                System.out.println("Blanket is Matching");
                return true;
            }
            System.out.println("Blanket is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
