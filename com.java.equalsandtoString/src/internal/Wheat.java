package internal;

import java.util.Objects;

public class Wheat {
    private String type;
    private String origin;
    private int quantity;
    private int price;

    public Wheat(String type, String origin, int quantity, int price) {
        this.type = type;
        this.origin = origin;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return " { Wheat" + "type=" + type+ "origini=" + origin + "quantity=" + quantity + "price=" + price+ '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Wheat) {
            Wheat wheat = (Wheat) obj;
            if (Objects.equals(this.type, wheat.type) &&
                    Objects.equals(this.origin, wheat.origin) &&
                    Objects.equals(this.quantity,wheat.quantity) &&
            Objects.equals(this.price,wheat.price)) {

                System.out.println("Wheat is Matching");
                return true;
            }
            System.out.println("Wheat is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
