package Runner;
import internal.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180, 10.99);
        Book book2 = new Book("1984", "George Orwell", 328, 12.99);
        Book book3 = new Book("1984", "George Orwell", 328, 12.99);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        boolean noMatch = book1.equals(book3);   // false
        boolean isMatch = book2.equals(book3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
