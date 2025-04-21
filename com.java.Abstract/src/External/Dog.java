package External;

import internal.AbstractAnimal;

public class Dog extends AbstractAnimal {
    public String breed;

    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }
    public Dog(Dog original){
        super(original.name);
        this.breed = original.breed;
    }
    @Override
    public void makeSound(){
        System.out.println("Sounds like BowBow");
    }
    public void displayDetails(){
        displayName();
        System.out.println("Breed:" + breed);
    }
}
