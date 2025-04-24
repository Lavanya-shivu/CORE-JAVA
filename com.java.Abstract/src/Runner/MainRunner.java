package Runner;


import External.Car;

public class PersonRunner {
    private static void main(String[] args) {
        Car car = new Car("Toyota", 2022);
        System.out.println("Original Car");
        car.displayDetails();

        Car car1 = new Car(car);
        System.out.println("Copied Car");
        car1.displayDetails();
    }
}

