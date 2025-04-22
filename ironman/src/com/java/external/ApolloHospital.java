package com.java.external;

import com.java.internal.rule.Hospital;

public class ApolloHospital implements Hospital {
    @Override
    public void clean(){
        System.out.println("running clean in ApolloHospital");
    }
}
