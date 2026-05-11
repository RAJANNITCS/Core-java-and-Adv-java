// WAP to demostrating Set use with custome class 

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee {
    int id;

    public Employee(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id = " + id;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {

        // Same object check
        if (this == obj)
            return true;

        // Null and class check
        if (obj == null || getClass() != obj.getClass())
            return false;

        // Type casting
        Employee emp = (Employee) obj;

        // Compare ids
        return id == emp.id;
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

public class SetWithObjectExample {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();

        set.add(new Employee(1));
        set.add(new Employee(1));

        System.out.println(set);
    }
}
