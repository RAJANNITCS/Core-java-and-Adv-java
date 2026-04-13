// WAP to demostrating TreeSet class and import methods

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        // Create TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(50); // Insert 50
        set.add(20); // Insert 20
        set.add(40); // Insert 40
        set.add(10); // Insert 10

        // Sorted output
        System.out.println("TreeSet: " + set); // [10, 20, 40, 50]

        // First element
        System.out.println("First: " + set.first());

        // Last element
        System.out.println("Last: " + set.last());

        // Navigation methods
        System.out.println("Lower than 40: " + set.lower(40));
        System.out.println("Ceiling of 25: " + set.ceiling(25));

        // Remove smallest
        System.out.println("Poll First: " + set.pollFirst());

        // Reverse order
        System.out.println("Descending: " + set.descendingSet());
        
    }
}
