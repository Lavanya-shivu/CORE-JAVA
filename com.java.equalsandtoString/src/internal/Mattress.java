package internal;

import java.util.Objects;

public class Mattress {
    private String brand;
    private String type;
    private String size;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mattress{" + "brand='" + brand + ", type='" + type + ", size='" + size + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mattress) {
            Mattress mattress = (Mattress) obj;
            if (Objects.equals(this.brand, mattress.brand) &&
                    Objects.equals(this.type, mattress.type) &&
                    Objects.equals(this.size, mattress.size) &&
                    Objects.equals(this.price,mattress.price)) {
                System.out.println("Mattress is Matching");
                return true;
            }
            System.out.println("Mattress is Not Matching");
            return false;
        }
        System.err.println("Invalid object for Mattress comparison");
        return false;
    }
}
