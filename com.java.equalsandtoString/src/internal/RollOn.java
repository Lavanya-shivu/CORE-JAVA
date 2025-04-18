package internal;

import java.util.Objects;

public class RollOn {
    private String brand;
    private String fragrance;
    private double size;  // in milliliters
    private double price;

    public RollOn(String brand, String fragrance, double size, double price) {
        this.brand = brand;
        this.fragrance = fragrance;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "RollOn{" + "brand='" + brand +", fragrance='" + fragrance + ", size=" + size + "ml, price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof RollOn) {
            RollOn rollOn = (RollOn) obj;
            if (Objects.equals(this.brand, rollOn.brand) &&
                    Objects.equals(this.fragrance, rollOn.fragrance) &&
                    Objects.equals(this.size,rollOn.size) &&
            Objects.equals(this.price,rollOn.price)) {

                System.out.println("RollOn is Matching");
                return true;
            }
            System.out.println("RollOn is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
