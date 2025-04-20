package Runner;

import internal.Highway;
import internal.Road;
import internal.VillageRoad;

public class RoadRunner {

    public static void main(String[] args) {
        Road road = new Highway();
        System.out.println("Highway Details");
        road.type();
        road.length();
        road.location();
        road.material();
        road.condition();


        System.out.println("VillageRoad Details");
        Road road1 =new VillageRoad();
        road1.type();
        road1.length();
        road1.location();
        road1.material();
        road1.condition();

    }
}
