package com.java.external.occupation;

import com.java.internal.Occupation.Occupation;

public class JobSeeker {
    public void jobSearch() {
        Occupation occupation = new Occupation();

        // Only use public getters
        System.out.println("--- Job Seeker View ---");
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Experience: " + occupation.getExperienceYears() + " years");
        System.out.println("Salary: $" + occupation.getSalary());
        System.out.println("Remote: " + occupation.isRemote());
    }
}
