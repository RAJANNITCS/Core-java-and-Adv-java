import java.util.HashSet;
import java.util.Objects;

class Customer {
    Integer custId;
    String custName;

    Customer(Integer custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }

    @Override
    public String toString() {
        return this.custId + ":" + this.custName;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;   // Same object
        if (obj == null) return false;  // Null check
        if (getClass() != obj.getClass()) return false; // Class check

        Customer other = (Customer) obj;

        return Objects.equals(custId, other.custId) &&
               Objects.equals(custName, other.custName);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(custId, custName);
    }
}

public class CustomerDemo {
    public static void main(String[] args) {
        HashSet<Customer> customers = new HashSet<>();

        customers.add(new Customer(1, "rajan singh"));
        customers.add(new Customer(1, "rajan singh"));

        System.out.println(customers);
    }
}
