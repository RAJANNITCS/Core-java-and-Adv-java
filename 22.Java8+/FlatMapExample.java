// WAP to demostrating Flat map operation

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> departments = Arrays.asList(
            Arrays.asList("Alice", "Bob"),
            Arrays.asList("Charlie", "David")
        );

        List<String> allEmployeeList = departments.stream().flatMap(dept -> dept.stream()).collect(Collectors.toList());

        System.out.println("All employee are = " + allEmployeeList);
    }
}
