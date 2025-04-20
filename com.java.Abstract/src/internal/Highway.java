package internal;

public class Highway extends Road{

    @Override
    public void type(){
        System.out.println("Highway Express");
    }
    @Override
    public void length(){
        System.out.println("Usually long");
    }
    @Override
    public void location(){
        System.out.println("Connects urban and rural areas");
    }
    @Override
    public void material(){
        System.out.println(" Made of concrete ");
    }
    @Override
    public void condition(){
        System.out.println("Well-maintained and regulated");
    }
}
