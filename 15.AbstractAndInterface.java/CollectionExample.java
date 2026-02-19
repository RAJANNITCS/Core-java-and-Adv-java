// WAP to demostrating abstraction uses in collection framework

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        
        // We use List reference (abstraction)
        // ArrayList is actual implementation

        // Tomorrow if performance requirement changes:

        names = new LinkedList<>();

        names.add("seema"); // add element
        names.add("mohan");

        System.out.println(names);
    }
}
