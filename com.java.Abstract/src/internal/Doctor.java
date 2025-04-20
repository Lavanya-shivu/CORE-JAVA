package internal;

public class Doctor extends Job{

    @Override
    public void role(){
        System.out.println("Role is Diagnose and treat patients");
    }
    @Override
    public void salary(){
        System.out.println("Salary is ₹15 LPA");
    }
    @Override
    public void location(){
        System.out.println("Location is Hyderabad");
    }
    @Override
    public void companyName(){
        System.out.println("Hospital name is Manipal");
    }
    @Override
    public void benefits(){
        System.out.println("Benefits is medical allowances");
    }
}
