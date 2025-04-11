package com.java.runner;

import com.java.external.Airconditioner.CityTraffic;

public class TrafficRunner {
    public static void main(String[] args) {
        CityTraffic traffic = new CityTraffic();
        traffic.signal();
        System.out.println("--------------------------");

        traffic.rushHour();
        traffic.clear();
        traffic.clear(traffic);
        traffic.clear(null);
        System.out.println("==========================");
    }
}
