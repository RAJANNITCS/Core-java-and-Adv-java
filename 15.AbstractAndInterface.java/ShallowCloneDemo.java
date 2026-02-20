// WAP to demostrating shallow cloneing 

// Address class 
class Address {
    String city; // City name

    Address(String city) {
        this.city = city; // Assign city
    }
}

// Employee class implementing Cloneable
class Employee implements Cloneable {
    int id; // Primitive field
    String name; // Immutable object
    Address address; // Reference object

    Employee(int id, String name, Address address) {
        this.id = id;  // Assign id
        this.name = name; // Assign name
        this.address = address; // Assign address
    }

    // @Override clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Default shallow copy
    }
}

public class ShallowCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Delhi"); // Create Address object

        Employee emp1  = new Employee(1, "rajan", address);  // Create original object

        Employee emp2 = (Employee) emp1.clone(); // clone object

        emp2.address.city = "Mumbai"; // Modify cloned object's address

        System.out.println(emp1.address.city); // Check origianl

        emp2.name = "mohan";
        emp2.id = 2;

        System.out.println(emp1.id);
        System.out.println(emp1.name);
    }
}
