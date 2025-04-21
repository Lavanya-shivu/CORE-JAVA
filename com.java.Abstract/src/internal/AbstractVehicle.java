package internal;
//Declare an abstract class with no abstract methods and extend it by a subclass. Create copy of subclass
public abstract class AbstractVehicle {
    protected String brand;

    public AbstractVehicle(String brand) {
        this.brand = brand;
    }
   public void displayBrand(){
        System.out.println("Brand:" + brand);
    }
}

