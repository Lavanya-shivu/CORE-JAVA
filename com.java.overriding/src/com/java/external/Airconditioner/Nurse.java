package com.java.external.Airconditioner;

import com.java.internal.Doctor;

public class Nurse extends Doctor {
    public Nurse() {
        System.out.println("No-argument constructor in ObjectDoctor");
    }

    public void specialization() {
        System.out.println("Doctor specializes in cardiology, neurology, or surgery");
    }

    public void consult() {
        System.out.println("Doctor is consulting a patient");
    }

    public void consult(Doctor doctor) {
        if (doctor != null) {
            System.out.println("Consultation is in progress");
        } else {
            System.out.println("No doctor available for consultation");
        }
    }
}
