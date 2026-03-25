// WAP to demostrating constructor Reference

interface EmployeeFactory {
    Employee create(Integer id, String name, double salary);
}

class Employee {

    public Integer id;
    public String name;
    public double salary;

    public Employee(Integer id , String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}

public class ConstructorRef {
    public static void main(String[] args) {

        // Lambda 
        EmployeeFactory factory = (id, name, salary) -> new Employee(id,name,salary);
        Employee employee = factory.create(001, "emp_01", 1000);

        // Constructor Reference
        EmployeeFactory factory1 = Employee :: new;

        Employee employee1 = factory1.create(002, "emp_02", 20000);

        System.out.println(employee.name);
        System.out.println(employee1.name);
        
    }
}
