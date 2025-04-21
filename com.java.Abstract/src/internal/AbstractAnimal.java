package internal;
// Declare an abstract class with abstract method and extend it by a subclass. Create copy of subclass
public abstract class AbstractAnimal {
    protected String name;

    public AbstractAnimal(String name){
        this.name = name;
    }
    public abstract void makeSound();

        public void displayName(){
            System.out.println("Animal name is Dog");
    }
}
