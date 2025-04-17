package com.java.internal;

public class Doctor {
    private String specialization;
    private int yearsOfExperience;

    public Doctor() {
    }

    public Doctor(String specialization, int yearsOfExperience) {
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public void treat() {
        System.out.println("Doctor treats patients");
    }
    @Override
    public String toString() {
        return "Doctor Specialization: " + specialization + ", Years of Experience: " + yearsOfExperience;
    }
}
