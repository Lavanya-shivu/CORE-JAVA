package com.java.runner;

import com.java.external.Airconditioner.Nurse;

public class DoctorRunner {
    public static void main(String[] args) {
        Nurse nurse = new Nurse();
        nurse.treat();
        System.out.println("--------------------------");

        nurse.specialization();
        nurse.consult();
        nurse.consult(nurse); // with non-null
        nurse.consult(null);         // with null
        System.out.println("==========================");
    }
}
