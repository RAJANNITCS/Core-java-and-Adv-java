// WAP to demostrating Predicate use in real application 

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    public Integer id;
    public String name;
    public double salary;

    public Employee(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.id + ":" + this.name + ":" + this.salary;
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(01, "emp_1", 100000));
        employees.add(new Employee(02, "emp_2", 300000));
        employees.add(new Employee(03, "emp_03", 2000));
        employees.add(new Employee(04, "emp_04", 6000));

        // Predicate to check employee salray < 7000;
        Predicate<Employee> emPredicate = emp -> emp.salary < 7000;

        employees.forEach(emp -> {
            if (emPredicate.test(emp)) {
                System.out.println(emp);
            }
        });
    }
}
