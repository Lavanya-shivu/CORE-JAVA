package internal;

import java.util.Objects;

public class Tonic {
    private String name;
    private String brand;
    private int quantity; // in ml
    private int price;

    public Tonic(String name, String brand, int quantity, int price) {
        this.name = name;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return " { Tonic" + "name=" +name+ "brand=" +brand+ "quantity=" + quantity + "price=" +price+ '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tonic) {
            Tonic tonic = (Tonic) obj;
            if (Objects.equals(this.name, tonic.name) &&
                    Objects.equals(this.brand, tonic.brand) &&
                    Objects.equals(this.quantity,tonic.quantity) &&
            Objects.equals(this.price, tonic.price)) {

                System.out.println("Tonic is Matching");
                return true;
            }
            System.out.println("Tonic is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
