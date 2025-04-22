package com.java.external;

import com.java.internal.rule.Police;

public class PoliceStation implements Police {
    @Override
    public void complaint(){
        System.out.println("Complaint is taken in policeStation");
    }

}
