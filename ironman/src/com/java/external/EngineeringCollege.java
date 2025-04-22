package com.java.external;

import com.java.internal.rule.College;

public class EngineeringCollege implements College {
    @Override
    public void collegeName() {
        System.out.println("College name is JNN");
    }
    public void location(){
        System.out.println("Location is Shimoga");
    }
    public void fees(){
        System.out.println("Fees is 10 Lack per course");
    }
}