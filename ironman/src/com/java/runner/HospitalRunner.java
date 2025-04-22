package com.java.runner;

import com.java.external.ApolloHospital;
import com.java.internal.rule.Hospital;
import com.java.internal.rule.Hostel;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new ApolloHospital();
    hospital.clean();
    }
}
