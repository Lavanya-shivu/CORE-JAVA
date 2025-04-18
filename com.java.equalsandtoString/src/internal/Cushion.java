package internal;

import java.util.Objects;

public class Cushion {
    private String material;
    private String color;
    private String shape;
    private double price;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cushion{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cushion) {
            Cushion cushion = (Cushion) obj;
            if (Objects.equals(this.material, cushion.material) &&
                    Objects.equals(this.color, cushion.color) &&
                    Objects.equals(this.shape, cushion.shape) &&
                    Objects.equals(this.price,cushion.price)) {
                System.out.println("Cushion is Matching");
                return true;
            }
            System.out.println("Cushion is Not Matching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
