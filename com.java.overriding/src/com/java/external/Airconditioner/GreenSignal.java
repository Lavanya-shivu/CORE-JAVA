package com.java.external.Airconditioner;

import com.java.internal.Signal;

public class GreenSignal {
    public void greenSignal(Signal signal){
        if(signal!= null){
            if(signal instanceof TrafficSignal){
                TrafficSignal trafficSignal = (TrafficSignal) signal;
                trafficSignal.changeColor();
                trafficSignal.stop();
            }
            else {
                signal.transmit();
                System.err.println("Signal is Green");
            }
        }
        else {
            System.err.println("Signal is null");
        }
    }
}
