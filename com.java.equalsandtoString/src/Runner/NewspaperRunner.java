package Runner;

import internal.Newspaper;

public class NewspaperRunner {
    public static void main(String[] args) {
        Newspaper newspaper1 = new Newspaper("The Times", "Times Group", "2025-04-17", 2.5);
        Newspaper newspaper2 = new Newspaper("The Guardian", "Guardian Media Group", "2025-04-17", 3.0);
        Newspaper newspaper3 = new Newspaper("The Guardian", "Guardian Media Group", "2025-04-17", 3.0);

        System.out.println(newspaper1);
        System.out.println(newspaper2);
        System.out.println(newspaper3);

        boolean noMatch = newspaper1.equals(newspaper3);   // false
        boolean isMatch = newspaper2.equals(newspaper3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
