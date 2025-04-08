package com.java.internal.Occupation;

public class Occupation {
    private String title = "Software Engineer";
    private String industry = "IT";
    private int experienceYears = 2;
    private double salary = 60000;
    private boolean remote = true;

    // Package-private setters
    void setTitle(String title) {
        this.title = title;
    }

    void setIndustry(String industry) {
        this.industry = industry;
    }
    void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setRemote(boolean remote) {
        this.remote = remote;
    }
    // Public getters
    public String getTitle() {
        return title;
    }

    public String getIndustry() {
        return industry;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public double getSalary() {
        return salary;
    }
    public boolean isRemote() {
        return remote;
    }
}
