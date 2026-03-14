// WAP to demostraning immutabillity in functional Programming 

// step 1 - we create Immutable Employee class

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

final class Employee {

    // fields are private and final
    private final int id;
    private final String name;
    private final double salray;

    // constructor to initialize fields
    public Employee(int id, String name, double salary) {

        // assigning values during object creation 
        this.id = id;
        this.name = name;
        this.salray = salary;
    }

    // getting for id
    public int getId() {
        return this.id;
    }

    // gettter for name
    public String getName() {
        return this.name;
    }

    // getter for salary
    public double getSalary() {
        return salray;
    }

    @Override
    public String toString() {
        return this.id + "," + this.name + "," + this.salray;
    }

}
public class FunctionalImmutableExample {
    public static void main(String[] args) {
        // creating immutable employee object
        Employee emp = new Employee(101, "Rahul", 50000);

        // printing employee details
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());

        // we cannot change salary like this
        // emp.salary = 60000; ❌ not allowed

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Amit",50000),
                new Employee(2,"Rahul",60000)
        );

        // create new list with updated salaries
        List<Employee> employees2 = employees.stream()
                .map(e -> new Employee(
                        e.getId(),
                        e.getName(),
                        e.getSalary() + 5000
                ))
                .collect(Collectors.toList()); // collect into new list

        System.out.println(employees2);
    }
}
