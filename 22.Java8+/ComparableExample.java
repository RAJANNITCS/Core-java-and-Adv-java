// WAP to demostrating comparable 

import java.util.*;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee> {

    public Integer age;
    public String name;

    public Employee(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Employee other) {
        return this.age - other.age; // ascending;
    }

    @Override
    public String toString() {
        return this.age + "->" + this.name;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays
                    .asList(new Employee(32, "emp_01")
                    ,new Employee(23, "emp_02")
                    , new Employee(31, "emp_04"));

        List<Employee> result = employees
                    .stream()
                    .sorted()
                    .collect(Collectors.toList());

        System.out.println(result);
    }
}
