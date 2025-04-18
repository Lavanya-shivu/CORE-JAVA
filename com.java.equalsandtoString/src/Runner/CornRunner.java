package Runner;

import internal.Corn;

public class CornRunner {
    public static void main(String[] args) {
        Corn corn1 = new Corn("Sweet", "USA", 50, 200);
        Corn corn2 = new Corn("Popcorn", "India", 30, 150);
        Corn corn3 = new Corn("Popcorn", "India", 30, 150);

        System.out.println(corn1);
        System.out.println(corn2);
        System.out.println(corn3);

        boolean noMatch = corn1.equals(corn3);
        boolean isMatch = corn2.equals(corn3);

        System.out.println("Match result: " + isMatch);
        System.err.println("Not match result: " + noMatch);
    }
}
