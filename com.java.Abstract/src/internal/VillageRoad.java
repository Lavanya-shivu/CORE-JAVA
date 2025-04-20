package internal;

public class VillageRoad extends Road{

    @Override
    public void type(){
        System.out.println("Narrow and less structured road");
    }
    @Override
    public void length(){
        System.out.println("Typically short");
    }

    @Override
    public void location() {
        System.out.println("Found in remote or agricultural regions");
    }
    @Override
    public void material(){
        System.out.println("Mud, gravel, or simple tar");
    }
    @Override
    public void condition(){
        System.out.println(" Often affected by weather conditions");
    }
}
