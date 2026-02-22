
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// Employee class implements Serializable
class Employee implements Serializable {

    // Unique ID for serialization
    private static final long serialVersionUID = 1L;

    String name;               // Employee name
    Department department;     // Reference to Department

    // Constructor
    public Employee(String name) {
        this.name = name;
    }
}

// Department class implements Serializable
class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    String deptName;       // Department name
    Employee employee;     // Reference back to Employee

    public Department(String deptName) {
        this.deptName = deptName;
    }
}


public class CircularSerializationDemo {

    public static void main(String[] args) throws Exception {

        // Create Employee object
        Employee emp = new Employee("Rajan");

        // Create Department object
        Department dept = new Department("IT");

        // Create circular reference
        emp.department = dept;   // Employee has Department
        dept.employee = emp;     // Department has Employee (circular)

        // Create ObjectOutputStream to write object
        ObjectOutputStream oos =
                new ObjectOutputStream(
                        new FileOutputStream("data.ser"));

        // Serialize Employee
        oos.writeObject(emp);

        // Close stream
        oos.close();

        System.out.println("Serialization successful");
    }
}

