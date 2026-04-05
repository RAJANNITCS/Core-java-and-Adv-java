// WAP to demostrating asList() method of Arrays class

import java.util.*;

public class ArraysAsListExample {
    public static void main(String[] args) {
        
        // Creating a list using Arrays.asList
        List<String> list = Arrays.asList("A","B","C");

        // Printing list
        System.out.println(list);

        // Trying to modify element (allowed)
        list.set(1, "X"); // replace B with X

        // Printing updated list
        System.out.println(list);

        // Trying to add element (NOT allowed)
        list.add("D");
        
    }
}
