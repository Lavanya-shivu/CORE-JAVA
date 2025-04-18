package internal;

import java.util.Objects;

public class Magazine {
    private String title;
    private String publisher;
    private int issueNumber;
    private double price;

    public Magazine(String title, String publisher, int issueNumber, double price) {
        this.title = title;
        this.publisher = publisher;
        this.issueNumber = issueNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Magazine{" + "title='" + title + ", publisher='" + publisher + ", issueNumber=" + issueNumber + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Magazine) {
            Magazine magazine = (Magazine) obj;
            if (Objects.equals(this.title, magazine.title) &&
                    Objects.equals(this.publisher, magazine.publisher) &&
                    Objects.equals(this.issueNumber,magazine.issueNumber) &&
            Objects.equals(this.price,magazine.price)) {

                System.out.println("Magazine is Matching");
                return true;
            }
            System.out.println("Magazine is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
