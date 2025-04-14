package com.java.external.Airconditioner;

import com.java.internal.Doctor;

public class HospitalManager {
    public void manageDoctor(Doctor doctor) {
        if (doctor != null) {
            doctor.treat(); // Superclass method

            if (doctor instanceof Nurse) {
                Nurse nurse = (Nurse) doctor; // Casting
                nurse.specialization();
                nurse.consult();
            } else {
                System.err.println("This is not a Nurse. This is a general doctor.");
            }
        } else {
            System.err.println("Doctor object is null.");
        }
    }
}
