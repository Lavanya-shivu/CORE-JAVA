package internal;

import java.util.Objects;

public class Hat {
    private String color;
    private String material;
    private String size;
    private double price;

    public Hat(String color, String material, String size, double price) {
        this.color = color;
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hat{" + "color='" + color + ", material='" + material + ", size='" + size +", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Hat) {
            Hat hat = (Hat) obj;
            if (Objects.equals(this.color, hat.color) &&
                    Objects.equals(this.material, hat.material) &&
                    Objects.equals(this.size, hat.size) &&
                    Objects.equals(this.price,hat.price)){
                System.out.println("Hat is Matching");
                return true;
            }
            System.out.println("Hat is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
