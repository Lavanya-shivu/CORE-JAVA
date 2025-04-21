package Runner;

import External.Employee;

public class PersonRunner {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 28, "HR");
        System.out.println("Original Employee:");
        emp1.displayDetails();

        // Copy the employee
        Employee emp2 = new Employee(emp1);
        System.out.println("\nCopied Employee:");
        emp2.displayDetails();
    }
}
