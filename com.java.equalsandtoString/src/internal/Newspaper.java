package internal;

import java.util.Objects;

public class Newspaper {
    private String name;
    private String publisher;
    private String date; // Date of issue
    private double price;

    public Newspaper(String name, String publisher, String date, double price) {
        this.name = name;
        this.publisher = publisher;
        this.date = date;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Newspaper{" + "name='" + name + ", publisher='" + publisher + ", date='" + date + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Newspaper) {
            Newspaper newspaper = (Newspaper) obj;
            if (Objects.equals(this.name, newspaper.name) &&
                    Objects.equals(this.publisher, newspaper.publisher) &&
                    Objects.equals(this.date, newspaper.date) &&
                    Objects.equals(this.price,newspaper.price)) {

                System.out.println("Newspaper is Matching");
                return true;
            }
            System.out.println("Newspaper is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
