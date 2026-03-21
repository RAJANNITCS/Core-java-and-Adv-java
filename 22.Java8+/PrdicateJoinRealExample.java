// WAP to demostrating predicate join in real project

import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

// create employee class
class Employee {
    public Integer id;
    public String name;
    public Integer age;
    public double salary;

    public Employee(Integer id, String name, Integer age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.id + ":" + this.name + ":" + this.age + ":" + this.salary;
    }
}

public class PrdicateJoinRealExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(0001, "emp_01", 21, 1000));
        employees.add(new Employee(0002, "emp_02", 22, 2000));
        employees.add(new Employee(0003, "emp_03", 33, 6000));
        employees.add(new Employee(0004, "emp_04", 34, 7000));
        employees.add(new Employee(0005, "emp_05", 25, 5000));

        // Salary > 5000
        Predicate<Employee> highSalary = num -> num.salary > 5000;

        // age > 30
        Predicate<Employee> senior = num -> num.age > 30;

        // Joining predicates
        Predicate<Employee> eligible = highSalary.and(senior);

        employees.forEach(emp -> {
            if (eligible.test(emp)) {
                System.out.println("Eligible employee = " + emp);
            }
        });
    }
}
