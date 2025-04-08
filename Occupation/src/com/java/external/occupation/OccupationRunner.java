package com.java.external.occupation;

import com.java.internal.Occupation.Career;

public class OccupationRunner {
    public static void main(String[] args) {
        Career career = new Career();
        career.careergrowth();

        JobSeeker jobseeker = new JobSeeker();
        jobseeker.jobSearch();
    }
}
