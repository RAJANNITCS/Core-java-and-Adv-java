// WAP to demostrating NavigableSet and important methods

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {

        // Creating NavigableSet
        NavigableSet<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        // Navigation operations
        System.out.println("Lower than 30: " + set.lower(30));  // 20
        System.out.println("Floor of 30: " + set.floor(30));     // 30
        System.out.println("Ceiling of 35: " + set.ceiling(35)); // 40
        System.out.println("Higher than 30: " + set.higher(30)); // 40

        // Poll operations
        System.out.println("Poll First: " + set.pollFirst()); // removes 10
        System.out.println("Poll Last: " + set.pollLast());   // removes 50

        // Descending order
        System.out.println("Descending: " + set.descendingSet());
    }
}
