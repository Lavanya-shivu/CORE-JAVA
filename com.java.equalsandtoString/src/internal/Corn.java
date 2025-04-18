package internal;

import java.util.Objects;

public class Corn {
    private String variety;
    private String origin;
    private int quantity;
    private int price;

    public Corn(String variety, String origin, int quantity, int price) {
        this.variety = variety;
        this.origin = origin;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{ Corn" + "variety=" + variety + "origin=" + origin + "quantity=" + quantity + "price=" + price +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Corn) {
            Corn corn = (Corn) obj;
            if (Objects.equals(this.variety, corn.variety) &&
                    Objects.equals(this.origin, corn.origin) &&
                    Objects.equals(this.quantity,corn.quantity) &&
            Objects.equals(this.price,corn.price)) {

                System.out.println("Corn is Matching");
                return true;
            }
            System.out.println("Corn is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
