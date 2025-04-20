package internal;

public class SoftwareProject extends Project{

    @Override
    public void title(){
        System.out.println("Skin Cancer Detection using ML");
    }
    @Override
    public void duration(){
        System.out.println("Duration is 4 months");
    }
    @Override
    public void domain(){
        System.out.println("Machine Learning");
    }
    @Override
    public void teamSize(){
        System.out.println("We are 4 members in a team");
    }

    @Override
    public void outcome() {
        System.out.println("Detects Skin Cancer in Early stage");
    }
}
