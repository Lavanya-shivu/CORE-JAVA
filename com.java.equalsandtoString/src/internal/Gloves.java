package internal;

import java.util.Objects;

public class Gloves {
    private String material;
    private String color;
    private String size;
    private double price;

    public Gloves(String material, String color, String size, double price) {
        this.material = material;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gloves{" + "material='" + material + ", color='" + color + ", size='" + size + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Gloves) {
            Gloves gloves = (Gloves) obj;
            if (Objects.equals(this.material, gloves.material) &&
                    Objects.equals(this.color, gloves.color) &&
                    Objects.equals(this.size, gloves.size) &&
                    Objects.equals(this.price,gloves.price)) {
                System.out.println("Gloves are Matching");
                return true;
            }
            System.out.println("Gloves are NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
