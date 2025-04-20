package Runner;

import internal.Doctor;
import internal.Engineer;
import internal.Job;

public class JobRunner {
    public static void main(String[] args) {
        Job job = new Engineer();
        System.out.println("Engineer job details");
        job.role();
        job.salary();
        job.location();
        job.companyName();
        job.benefits();

        System.out.println("Doctor job details");
        Job job1 = new Doctor();
        job1.role();
        job1.salary();
        job1.location();
        job1.companyName();
        job1.benefits();
    }
}
