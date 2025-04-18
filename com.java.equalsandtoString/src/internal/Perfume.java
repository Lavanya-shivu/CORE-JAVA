package internal;

import java.util.Objects;

public class Perfume {
    private String fragrance;
    private String brand;
    private int volume; // in ml
    private int price;

    public Perfume(String fragrance, String brand, int volume, int price) {
        this.fragrance = fragrance;
        this.brand = brand;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Perfume" + "fragrance=" +fragrance+ "brand=" +brand+ "volume=" + volume+ "price=" +price+ '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Perfume) {
            Perfume perfume = (Perfume) obj;
            if (Objects.equals(this.fragrance, perfume.fragrance) &&
                    Objects.equals(this.brand, perfume.brand) &&
                    Objects.equals(this.volume, perfume.volume) &&
            Objects.equals(this.price, perfume.price)) {

                System.out.println("Perfume is Matching");
                return true;
            }
            System.out.println("Perfume is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
