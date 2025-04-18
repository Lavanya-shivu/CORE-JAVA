package internal;

import java.util.Objects;

public class Lipstick {
    private String shade;
    private String brand;
    private int weight;
    private int price;

    public Lipstick(String shade, String brand, int weight, int price) {
        this.shade = shade;
        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lipstick{" +"shade='" + shade  + ", brand='" + brand + ", weight=" + weight + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lipstick) {
            Lipstick lipstick = (Lipstick) obj;
            if (Objects.equals(this.shade, lipstick.shade) &&
                    Objects.equals(this.brand, lipstick.brand) &&
                    Objects.equals(this.weight,lipstick.weight) &&
            Objects.equals(this.price,lipstick.price)) {

                System.out.println("Lipstick is Matching");
                return true;
            }
            System.out.println("Lipstick is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
            }
