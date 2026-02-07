// WAP to demostrating generic interface use in our program

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }

    // for printing object details
    @Override
    public String toString() {
        return name + " - " + age;
    }
}


public class UseGenericsComparbleInteface {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("rohan", 18));
        employees.add(new Employee("madhu", 22));
        employees.add(new Employee("seema", 25));

        // Sorting using Comparable
        Collections.sort(employees);

        // Print employee 
        System.out.println("Emplyee sort by name ");
        for (Employee e1 : employees) {
            System.out.println(e1.toString());
        }
    }
}
