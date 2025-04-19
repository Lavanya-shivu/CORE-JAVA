package Runner;
import internal.Shadow;

public class ShadowRunner {
    public static void main(String[] args) {
        Shadow shadow1 = new Shadow();
        shadow1.setShape("Human");
        shadow1.setSurface("Wall");
        shadow1.setLength(180);
        shadow1.setMoving(true);

        Shadow shadow2 = new Shadow();
        shadow2.setShape("Tree");
        shadow2.setSurface("Ground");
        shadow2.setLength(250);
        shadow2.setMoving(false);

        Shadow shadow3 = new Shadow();
        shadow3.setShape("Tree");
        shadow3.setSurface("Ground");
        shadow3.setLength(250);
        shadow3.setMoving(false);

        System.out.println(shadow1);
        System.out.println(shadow2);
        System.out.println(shadow3);

        boolean match = shadow2.equals(shadow3);
        boolean noMatch = shadow1.equals(shadow2);

        System.out.println("Match result: " + match);
        System.err.println("No match result: " + noMatch);
    }
}
