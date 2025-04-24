package com.java.Village;

public class VillageRunner {
    public static void main(String[] args) {
        Villagehead villagehead1 = new Villagehead("Hosahalli", 520);
        Villagehead villagehead2 = new Villagehead("Jaynag", 256);

        Village village = new Village("Hosahalli", 520, new Villagehead[]{villagehead1, villagehead2});
        village.display();
    }
}

