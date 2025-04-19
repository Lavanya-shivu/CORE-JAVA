package Runner;

import internal.Echo;

public class EchoRunner {
    public static void main(String[] args) {
        Echo echo1 = new Echo();
        echo1.setSource("Cave");
        echo1.setPitch("Low");
        echo1.setDuration(7);
        echo1.setLoud(true);

        Echo echo2 = new Echo();
        echo2.setSource("Tunnel");
        echo2.setPitch("High");
        echo2.setDuration(5);
        echo2.setLoud(false);

        Echo echo3 = new Echo();
        echo3.setSource("Tunnel");
        echo3.setPitch("High");
        echo3.setDuration(5);
        echo3.setLoud(false);

        System.out.println(echo1);
        System.out.println(echo2);
        System.out.println(echo3);

        boolean match = echo2.equals(echo3);
        boolean noMatch = echo1.equals(echo3);

        System.out.println("Match result: " + match);
        System.err.println("No match result: " + noMatch);
    }
}
