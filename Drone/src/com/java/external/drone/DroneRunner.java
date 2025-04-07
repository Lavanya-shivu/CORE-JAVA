package com.java.external.drone;

import com.java.internal.drone.Features;

public class DroneRunner {
    public static void main(String[] args){
        Features features=new Features();
        features.droneFeatures();
        System.out.println("features of the drone");

        Camera camera=new Camera();
        camera.droneCamera();
        System.out.println("camera quality in drone");
    }
}
