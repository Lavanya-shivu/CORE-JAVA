package Runner;

import internal.Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella("Yellow","Sunmate", 500,"M");
        Umbrella umbrella1 =  new Umbrella("Black", "RainPro",450,"L");
        Umbrella umbrella2 =  new Umbrella("Black", "RainPro", 450,"L");

        System.out.println(umbrella);
        System.out.println(umbrella1);
        System.out.println(umbrella2);

        boolean nomatch = umbrella.equals(umbrella2);
        boolean ismatch = umbrella1.equals(umbrella2);

        System.out.println("Match results:" +ismatch);
        System.err.println("Not match results:" +nomatch);
    }
}
