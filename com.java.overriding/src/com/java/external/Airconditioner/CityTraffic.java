package com.java.external.Airconditioner;

import com.java.internal.Traffic;

public class CityTraffic extends Traffic {
    public CityTraffic() {
        System.out.println("No-argument constructor in CityTraffic");
    }

    public void rushHour() {
        System.out.println("Heavy traffic during rush hour.");
    }

    public void clear() {
        System.out.println("Traffic is being cleared.");
    }

    public void clear(Traffic traffic) {
        if (traffic != null) {
            System.out.println("Traffic cleared successfully.");
        } else {
            System.out.println("No traffic to clear.");
        }
    }
}
