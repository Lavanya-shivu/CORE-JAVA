package internal;

import java.util.Objects;

public class Pillow {
    private String material;
    private String shape;
    private String size;
    private double price;

    public Pillow(String material, String shape, String size, double price) {
        this.material = material;
        this.shape = shape;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pillow{" + "material='" + material + ", shape='" + shape + ", size='" + size + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pillow) {
            Pillow pillow = (Pillow) obj;
            if (Objects.equals(this.material, pillow.material) &&
                    Objects.equals(this.shape, pillow.shape) &&
                    Objects.equals(this.size, pillow.size) &&
                    Objects.equals(this.price,pillow.price)) {
                System.out.println("Pillow is Matching");
                return true;
            }
            System.out.println("Pillow is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return
    }
