package Runner;

import internal.ConstructionProject;
import internal.Project;
import internal.SoftwareProject;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new SoftwareProject();
        System.out.println("Software Project details");
        project.title();
        project.duration();
        project.domain();
        project.teamSize();
        project.outcome();

        System.out.println("Construction Project details");
        Project project1 = new ConstructionProject();
        project1.title();
        project1.duration();
        project1.domain();
        project1.teamSize();
        project1.outcome();
    }
}
