package Runner;

import internal.Chalk;

public class ChalkRunner {
    public static void main(String[] args) {
        Chalk chalk1 = new Chalk();
        chalk1.setColor("White");
        chalk1.setBrand("DustFree");
        chalk1.setLengthInCm(10);
        chalk1.setIsBroken(false);

        Chalk chalk2 = new Chalk();
        chalk2.setColor("White");
        chalk2.setBrand("DustFree");
        chalk2.setLengthInCm(10);
        chalk2.setIsBroken(false);

        Chalk chalk3 = new Chalk();
        chalk3.setColor("Green");
        chalk3.setBrand("OldSchool");
        chalk3.setLengthInCm(5);
        chalk3.setIsBroken(true);

        System.out.println(chalk1);
        System.out.println(chalk2);
        System.out.println(chalk3);

        boolean match = chalk1.equals(chalk2);      // should return true
        boolean notMatch = chalk2.equals(chalk3);   // should return false

        System.out.println("Chalks match result: " + match);
        System.err.println("Chalks not match result: " + notMatch);
    }
}
