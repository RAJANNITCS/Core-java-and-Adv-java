// WAP to demostrating Before Record Introduse use case

class Employee {
    public String name;
    public Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String name() {
        return this.name;
    }

    public Address address() {
        return this.address;
    }
}

class Address {
    public String city;
    public String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String city () {
        return this.city;
    }
}

public class BeforeRecordExample {
    public static void main(String[] args) {
        
        Object obj = new Employee("Rahul", new Address("Delhi", "India"));

        // Step 1 : check type
        if (obj instanceof Employee) {

            // Step 2 : Manual casting
            Employee emp = (Employee) obj;

            // Step 3 : Extract data manually
            String name = emp.name();

            // Step 4 : Nested extraction
            String city = emp.address().city();

            System.out.println(name);
            System.out.println(city);
            
        }
    }
}
