// WAP to use consumer in real application 

import java.util.function.Consumer;

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
public class ConsumerRealExample {
    public static void main(String[] args) {

        Employee employee = new Employee(001, "emp_01", 10000);

        // Consumer to print employee
        Consumer<Employee> print = emp -> {
            System.out.println(emp.id + ":" + emp.name + ":" + emp.salary);
        };

        print.accept(employee);
    }
}
