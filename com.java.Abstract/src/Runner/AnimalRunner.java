package Runner;

import External.Dog;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", "Beagle");
        System.out.println("original Dog");
        dog.displayDetails();
        dog.makeSound();

        Dog dog1 = new Dog(dog);
        System.out.println("Copied Dog");
        dog1.displayName();
        dog1.makeSound();

    }
}
