package Runner;

import internal.HairDryer;

public class HairDryerRunner {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        hairDryer.setBrand("Philips");
        hairDryer.setColor("Lavender");
        hairDryer.setWattage(2000);
        hairDryer.setCost(1500);

        HairDryer hairDryer1 = new HairDryer();
        hairDryer.setBrand("Nova");
        hairDryer.setColor("Black");
        hairDryer.setWattage(1800);
        hairDryer.setCost(1000);

        HairDryer hairDryer2 = new HairDryer();
        hairDryer.setBrand("Philips");
        hairDryer.setColor("Lavender");
        hairDryer.setWattage(2000);
        hairDryer.setCost(1500);

        System.out.println(hairDryer);
        System.out.println(hairDryer1);
        System.out.println(hairDryer2);

        boolean match = hairDryer.equals(hairDryer2);
        boolean nomatch = hairDryer2.equals(hairDryer1);
    }
}
