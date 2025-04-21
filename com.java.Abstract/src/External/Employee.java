package External;

import internal.AbstractPerson;

public class Employee extends AbstractPerson {
    public String department;

    // Constructor chaining to parent
    public Employee(String name, int age, String department) {
        super(name, age); // chained to parent constructor
        this.department = department;
    }

    // Copy constructor
    public Employee(Employee original) {
        this(original.name, original.age, original.department); // chained to own constructor
    }

    @Override
    public void showRole() {
        System.out.println("Role: Employee in " + department + " department");
    }

    public void displayDetails() {
        displayPersonInfo();
        showRole();
    }
}
