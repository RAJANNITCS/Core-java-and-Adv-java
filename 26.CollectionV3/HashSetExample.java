// WAP to demostrating HashSet class and importent method 

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        // Create HashSet
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple");

        // print set
        System.out.println(set);

        // Check element
        System.out.println(set.contains("Apple"));

        // Remove element
        set.remove("Banana");

        // Size
        System.out.println(set.size());
        
    }
}
