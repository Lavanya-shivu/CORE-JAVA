package internal;
//Declare an abstract class with parameterized const , chain in the subclass and create a copy of subclass
public abstract class AbstractPerson {
    public String name;
    public int age;

    // Parameterized constructor
    public AbstractPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Concrete method
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Abstract method
    public abstract void showRole();
}
