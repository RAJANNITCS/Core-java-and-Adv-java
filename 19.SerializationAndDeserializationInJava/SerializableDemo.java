// WAP to demostrating Serializable 

import java.io.Serializable;

class Employee implements Serializable {
      // Recommended: Add serialVersionUID
    private static final long serialVersionUID = 1L;

    // Instance variable (will be serialized)
    private String name;

    // Instance variable (will be serialized)
    private int salary;

    // Transient variable (will NOT be serialized)
    private transient String password;

    // Constructor
    public Employee(String name, int salary, String password) {
        this.name = name;
        this.salary = salary;
        this.password = password;
    }

    // Method to display object
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Password: " + password);
    }
}

public class SerializableDemo {
    
}
