// WAP to demostrating Externalizabel interface

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Employee implements Externalizable {
    private String name;
    private int salary;

    // Mandatory public no-arg constructor
    public Employee() {
        System.out.println("Default constructor called");
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Manually writing fields
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.name);
        out.writeInt(this.salary);
    }

    // Manually reading fields
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject(); // Read name
        // salary = in.readInt(); // Read salary
    }

    public void display() {
        System.out.println(this.name + " - " + this.salary);
    }
}

public class ExternalizableDemo {
    public static void main(String[] args) {
        try {
            // Step 1: Create employee object
            Employee emp = new Employee("rajan", 5000);

            // Step 2 : Serialization (Write to file)
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp); // Serialize object

            oos.close(); // Close stream
            fos.close(); // Close file stream

            System.out.println("Object serialized successfully\n");

            // STEP 3: Deserialization (Read from file)
            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee emp2 = (Employee) ois.readObject(); // Deserialize object

            ois.close();
            fis.close();

            System.out.println("\nObject deserialized successfully\n");

            // STEP 4: Display object data
            emp2.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
