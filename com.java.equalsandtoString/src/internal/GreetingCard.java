package internal;

import java.util.Objects;

public class GreetingCard {
    private String message;
    private String sender;
    private String occasion;
    private int price;

    public GreetingCard(String message, String sender, String occasion, int price) {
        this.message = message;
        this.sender = sender;
        this.occasion = occasion;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{ GreetingCard" + "message=" +message+ "sender=" +sender+ "occasion=" +occasion+ "price=" + price+ '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof GreetingCard) {
            GreetingCard card = (GreetingCard) obj;
            if (Objects.equals(this.message, card.message) &&
                    Objects.equals(this.sender, card.sender) &&
                    Objects.equals(this.occasion, card.occasion) &&
                    Objects.equals(this.price,card.price)) {

                System.out.println("GreetingCard is Matching");
                return true;
            }
            System.out.println("GreetingCard is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
