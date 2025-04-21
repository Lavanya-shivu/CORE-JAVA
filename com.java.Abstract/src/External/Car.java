package External;

import internal.AbstractVehicle;

public class Car extends AbstractVehicle {
    int year;


   public Car(String brand, int year){
        super(brand);
        this.year = year;
    }
    public Car (Car original){
        super(original.brand);
        this.year = original.year;
    }
    public void displayDetails(){
        displayBrand();
       System.out.println("Year:" + year);
    }
}
