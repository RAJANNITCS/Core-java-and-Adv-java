// WAP to demostrating Custom Class Implements Comparable

// Custom Employee class implements comparable

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    int id;
    String name;

    public Employee (int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee other) {
        // sort by employee id
        return Integer.compare(id, other.id);
    }

    @Override
    public String toString() {
        return "Employee id : " +this.id + " name : " + this.name;
    }
}

public class CustomClassImpComparable {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(11,"A"));
        list.add(new Employee(2, "B"));
        list.add(new Employee(15, "C"));

        // Work because Employee implements Comparable
        Collections.sort(list);

        System.out.println(list);
        
    }
}
