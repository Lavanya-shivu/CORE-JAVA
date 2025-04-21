package internal;

//Declare a abstract class with two abstract methods, two concrete methods , extend it by a subclass , implement one abstract method , then extend the subclass by another class and i
// mplement the abstract method, create a copy of complete class

public abstract class AbstractDevice {
    public String brand;
    public int power;

    public AbstractDevice(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    public void displayPower() {
        System.out.println("Power: " + power + "W");
    }

    // Two abstract methods
    public abstract void start();
    public abstract void shutdown();
}
