// WAP to demostrating After introduse Record use case 

// Address record
record Address(String city, String contry) {}

// Employee record
record Employee(String name, Address address) {}

public class AfterRecordExample {
    public static void main(String[] args) {

        Object obj = new Employee("Rahul", new Address("Delhi", "India"));

        // Record Pattern
        if (obj instanceof Employee(String name, Address address)) {

            System.out.println(name);

            System.out.println(address.city());
            
        }
    }
}
