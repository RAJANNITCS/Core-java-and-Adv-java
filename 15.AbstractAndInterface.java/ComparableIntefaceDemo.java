// WAP to demostrating comparable interface 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    private Integer id;
    private String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Integer getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "{ Employee id = " + this.id + " name = " + this.name + " }";
    }

    /**
     * This method defines the natural sorting order for Employee objects,
     * which is based on their ID.
     * It compares this Employee object with the 'other' Employee object.
     */
    @Override
    public int compareTo(Employee other) {
        // We are comparing based on the employee's ID.
        // The Integer class's compareTo() method is used for comparison.
        // // Ascending order
        // return Integer.compare(this.id, other.id);

        // you can write like this. for decending order
        // if (this.getId().equals(other.getId())) {
        // return 0;
        // } else if (this.getId() < other.getId()) {
        // return 1;
        // } else {
        // return -1;
        // }
        // you can write like this. for ascending order
        // if (this.getId().equals(other.getId())) {
        //     return 0;
        // } else if (this.getId() < other.getId()) {
        //     return -1;
        // } else {
        //     return 1;
        // }
        // for string
        return this.getName().compareTo(other.getName());
    }
}

public class ComparableIntefaceDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(102, "Alice"));
        employees.add(new Employee(104, "Mohan"));
        employees.add(new Employee(101, "Bob"));
        employees.add(new Employee(103, "Charlie"));

        System.out.println("Before sorting: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        // This will use the compareTo() method we defined in the Employee class.
        Collections.sort(employees);

        System.out.println("After sorting: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
