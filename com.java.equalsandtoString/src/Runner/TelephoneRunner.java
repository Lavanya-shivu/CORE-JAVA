package Runner;

import internal.Telephone;

public class TelephoneRunner {
    public static void main(String[] args) {
        Telephone phone1 = new Telephone("Panasonic", "KX-TG3411SX", "Cordless", 2199);
        Telephone phone2 = new Telephone("Beetel", "X78", "Landline", 1199);
        Telephone phone3 = new Telephone("Beetel", "X78", "Landline", 1199);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        boolean noMatch = phone1.equals(phone3);   // false
        boolean isMatch = phone2.equals(phone3);   // true

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
