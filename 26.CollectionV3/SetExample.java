// WAP to demostrating Set interface and importent method 

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        // Create Set
        Set<String> set = new HashSet<>();

        // Add elements
        set.add("A");
        set.add("B");
        set.add("A");

        // Print Set
        System.out.println(set);

        // Check contains
        System.out.println(set.contains("A"));

        // Remove element
        set.remove("B");

        // Size
        System.out.println(set.size());
    }
}
