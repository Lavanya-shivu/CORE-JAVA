package External;

public class Laptop extends Computer{
    private int batteryLife;

    public Laptop(String brand, int power, int batteryLife) {
        super(brand, power); // chained to Computer constructor
        this.batteryLife = batteryLife;
    }

    // Copy constructor
    public Laptop(Laptop original) {
        this(original.brand, original.power, original.batteryLife); // constructor chaining
    }

    // Implement remaining abstract method
    @Override
    public void shutdown() {
        System.out.println("Laptop is shutting down...");
    }

    public void displayDetails() {
        displayBrand();
        displayPower();
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
}
