package internal;

import java.util.Objects;

public class Telephone {
    private String brand;
    private String model;
    private String type; // e.g., Landline, Cordless, Rotary
    private double price;

    public Telephone(String brand, String model, String type, double price) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Telephone{" + "brand='" + brand +", model='" + model + ", type='" + type + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Telephone) {
            Telephone telephone = (Telephone) obj;
            if (Objects.equals(this.brand, telephone.brand) &&
                    Objects.equals(this.model, telephone.model) &&
                    Objects.equals(this.type, telephone.type) &&
                    Objects.equals(this.price,telephone)) {
                System.out.println("Telephone is Matching");
                return true;
            }
            System.out.println("Telephone is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
