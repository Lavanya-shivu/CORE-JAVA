package internal;

import java.util.Objects;

public class Spray {
    private String brand;
    private String scent;
    private double volume; // in milliliters
    private double price;

    public Spray(String brand, String scent, double volume, double price) {
        this.brand = brand;
        this.scent = scent;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Spray{" + "brand='" + brand + ", scent='" + scent + ", volume=" + volume + "ml, price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Spray) {
            Spray spray = (Spray) obj;
            if (Objects.equals(this.brand, spray.brand) &&
                    Objects.equals(this.scent, spray.scent) &&
                    Objects.equals(this.volume,spray.volume) &&
            Objects.equals(this.price,spray.volume)) {

                System.out.println("Spray is Matching");
                return true;
            }
            System.out.println("Spray is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
