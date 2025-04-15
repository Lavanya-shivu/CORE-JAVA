package com.java.external.Airconditioner;

import com.java.internal.Traffic;

public class HeavyTraffic {
    public void heavyTraffic(Traffic traffic){
        if(traffic!= null){
            if(traffic instanceof CityTraffic){
                CityTraffic cityTraffic = (CityTraffic) traffic;
                cityTraffic.clear();
                cityTraffic.rushHour();
            }
            else {
                traffic.signal();
                System.out.println("Traffic is heavy");
            }
        }
        else {
            System.out.println("Traffic is null");
        }
    }

}
