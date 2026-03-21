// WAP to demostrating Function use in real project

import java.util.function.Function;

class Employee {
    public Integer id;
    public String name;
    public double salary;

    public Employee(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class FunctionRealExample {
    public static void main(String[] args) {

        Employee employee = new Employee(001, "emp_01", 20000);

        // Function to get salary 
        Function<Employee, Double> salary = emp -> emp.salary;

        System.out.println("Get employee salary = " + salary.apply(employee));
    }
}
