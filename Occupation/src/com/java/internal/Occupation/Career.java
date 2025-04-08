package com.java.internal.Occupation;

public class Career {
    public void careergrowth() {
        Occupation occupation = new Occupation();

        // Use setters
        occupation.setTitle("Data Scientist");
        occupation.setIndustry("Finance");
        occupation.setExperienceYears(5);
        occupation.setSalary(95000);
        occupation.setRemote(false);

        // Use getters
        System.out.println("--- Career Advisor View ---");
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Experience: " + occupation.getExperienceYears() + " years");
        System.out.println("Salary: $" + occupation.getSalary());
        System.out.println("Remote: " + occupation.isRemote());
    }
}
