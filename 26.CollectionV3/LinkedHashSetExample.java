// WAP to demostrating LinkedHashSet class and import methods

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        // Create LinkedHashSet object 
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements (insertion order will be maintained)
        set.add("A"); // Insert A
        set.add("B"); // Insert B
        set.add("C"); // Insert C
        set.add("A"); // Duplicate, will be ignored

        // Print set
        System.out.println(set); 
        // Output: [A, B, C]

        // Check if element exists
        System.out.println(set.contains("B")); // true

        // Remove element
        set.remove("B");

        // Print after removal
        System.out.println(set); 
        // Output: [A, C]

        // Iterate
        for(String value : set) {
            System.out.println(value); // Maintains order
        }
    }
}
