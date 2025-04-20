package internal;

public class Engineer extends Job{

    @Override
    public void role(){
        System.out.println("Role is developer");
    }
    @Override
    public void salary(){
        System.out.println("Salary is 100000 per month");
    }
    @Override
    public void location(){
        System.out.println("Loacation is bengaluru");
    }
    @Override
    public void companyName(){
        System.out.println("Company name is Amazon");
    }
    @Override
    public void benefits(){
        System.out.println("Benefits is Health Insurance");
    }
}
