package com.java.runner;

import com.java.external.EngineeringCollege;
import com.java.external.MedicalCollege;
import com.java.internal.rule.College;

public class CollegeRunner {
    public static void main(String[] args) {
        College college = new EngineeringCollege();

        College college1 = new MedicalCollege();

        System.out.println("Engineering college details");
        college.collegeName();
        college.location();
        college.fees();

        System.out.println("Medical College details");

        college1.collegeName();
        college1.location();
        college1.fees();
    }
}
