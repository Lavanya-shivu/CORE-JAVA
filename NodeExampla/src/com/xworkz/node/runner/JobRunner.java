package com.xworkz.node.runner;

import com.xworkz.node.dto.JobDto;

import java.util.*;

public class JobRunner {
    public static void main(String[] args) {
        List<JobDto> jobDtos = new ArrayList<>();

        JobDto job1 = new JobDto("Software Engineer", 70000, "Bangalore", "IT");
        JobDto job2 = new JobDto("Data Analyst", 60000, "Mumbai", "Analytics");
        JobDto job3 = new JobDto("HR Manager", 50000, "Delhi", "Human Resources");
        JobDto job4 = new JobDto("Marketing Executive", 45000, "Chennai", "Marketing");
        JobDto job5 = new JobDto("Sales Manager", 55000, "Hyderabad", "Sales");
        JobDto job6 = new JobDto("Product Manager", 80000, "Pune", "Product");
        JobDto job7 = new JobDto("DevOps Engineer", 75000, "Noida", "IT");
        JobDto job8 = new JobDto("Business Analyst", 62000, "Kolkata", "Business");
        JobDto job9 = new JobDto("Graphic Designer", 40000, "Ahmedabad", "Design");
        JobDto job10 = new JobDto("Content Writer", 35000, "Jaipur", "Media");

        JobDto job11 = new JobDto("Financial Analyst", 67000, "Mumbai", "Finance");
        JobDto job12 = new JobDto("Technical Lead", 90000, "Bangalore", "IT");
        JobDto job13 = new JobDto("QA Engineer", 50000, "Chennai", "Testing");
        JobDto job14 = new JobDto("Support Engineer", 42000, "Delhi", "Support");
        JobDto job15 = new JobDto("Legal Advisor", 65000, "Pune", "Legal");
        JobDto job16 = new JobDto("Operations Manager", 60000, "Hyderabad", "Operations");
        JobDto job17 = new JobDto("Backend Developer", 72000, "Bangalore", "IT");
        JobDto job18 = new JobDto("UI/UX Designer", 48000, "Kolkata", "Design");
        JobDto job19 = new JobDto("Cloud Architect", 95000, "Gurgaon", "IT");
        JobDto job20 = new JobDto("HR Executive", 40000, "Nagpur", "Human Resources");

        JobDto job21 = new JobDto("SEO Specialist", 47000, "Indore", "Marketing");
        JobDto job22 = new JobDto("Customer Support", 30000, "Chandigarh", "Support");
        JobDto job23 = new JobDto("System Administrator", 53000, "Delhi", "IT");
        JobDto job24 = new JobDto("Recruiter", 38000, "Bangalore", "HR");
        JobDto job25 = new JobDto("Logistics Coordinator", 44000, "Patna", "Operations");
        JobDto job26 = new JobDto("Project Manager", 85000, "Mumbai", "Management");
        JobDto job27 = new JobDto("Database Administrator", 69000, "Pune", "IT");
        JobDto job28 = new JobDto("Machine Learning Engineer", 91000, "Hyderabad", "AI");
        JobDto job29 = new JobDto("Network Engineer", 57000, "Kochi", "IT");
        JobDto job30 = new JobDto("Technical Writer", 39000, "Bhopal", "Documentation");


        Set<JobDto> jobDto = new HashSet<>();

        jobDto.add(job4);
        jobDto.add(job1);
        jobDto.add(job2);
        jobDto.add(job3);
        jobDto.add(job5);
        jobDto.add(job6);
        jobDto.add(job7);
        jobDto.add(job8);
        jobDto.add(job9);
        jobDto.add(job10);
        jobDto.add(job11);
        jobDto.add(job12);
        jobDto.add(job13);
        jobDto.add(job14);
        jobDto.add(job15);
        jobDto.add(job16);
        jobDto.add(job17);
        jobDto.add(job18);
        jobDto.add(job19);
        jobDto.add(job20);
        jobDto.add(job21);
        jobDto.add(job22);
        jobDto.add(job23);
        jobDto.add(job24);
        jobDto.add(job25);
        jobDto.add(job26);
        jobDto.add(job27);
        jobDto.add(job28);
        jobDto.add(job29);
        jobDto.add(job30);
    }
}
