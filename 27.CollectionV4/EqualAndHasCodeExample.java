// WAP to demostrating of override equal and hashCode method 

// Custome Employee class

import java.util.HashSet;
import java.util.Set;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding equals method
    @Override
    public boolean equals(Object obj) {

        // Same memory reference
        if (this == obj) {
            return true;
        }

        // Null check
        if (obj == null) {
            return false;
        }

        // Type check
        if (getClass() != obj.getClass()) {
            return false;
        }

        // Type casting
        Employee other = (Employee) obj;

        // Business comparison
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return this.id + " : " + this.name;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

public class EqualAndHasCodeExample {
    public static void main(String[] args) {

        // Create Employee one
        Employee e1 = new Employee(1, "Rahul");

        // Create Employee two
        Employee e2 = new Employee(1, "Rahul");

        // Compare two employee
        System.out.println(e1.equals(e2));

        Set<Employee> set = new HashSet<>();

        set.add(e1);
        set.add(e2);

        System.out.println(set.size());

    }
}
