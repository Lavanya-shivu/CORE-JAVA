package com.java.external.Airconditioner;

import com.java.internal.TimeMachine;

public class Past {
    public void past(TimeMachine timeMachine){
        if(timeMachine!= null){
            if(timeMachine instanceof Future){
                Future future = (Future) timeMachine;
                future.shutdown();
                future.travel();
            }
            else {
                timeMachine.activate();
                System.err.println("Timemachine is going to past");
            }
        }
        else {
            System.err.println("Timemachine is null");
        }
    }
}
