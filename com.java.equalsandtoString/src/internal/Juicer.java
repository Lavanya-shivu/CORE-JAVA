package internal;

import java.util.Objects;

public class Juicer {
    private String brand;
    private String color;
    private int power;  // in watts
    private int price;

    public Juicer(String brand, String color, int power, int price) {
        this.brand = brand;
        this.color = color;
        this.power = power;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Juicer{" + "brand='" + brand + ", color='" + color  + ", power=" + power + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Juicer) {
            Juicer juicer = (Juicer) obj;
            if (Objects.equals(this.brand, juicer.brand) &&
                    Objects.equals(this.color, juicer.color) &&
                    Objects.equals(this.power,juicer.power) &&
            Objects.equals(this.price,juicer.price)) {

                System.out.println("Juicer is Matching");
                return true;
            }
            System.out.println("Juicer is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
