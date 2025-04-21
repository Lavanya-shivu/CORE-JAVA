package External;

import internal.AbstractDevice;

public abstract class Computer extends AbstractDevice {
    public Computer(String brand, int power) {
        super(brand, power);
    }

    // Implement one abstract method
    @Override
    public void start() {
        System.out.println("Computer is starting up...");
    }

}
