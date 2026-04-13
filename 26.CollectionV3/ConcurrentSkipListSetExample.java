// WAP to demostrating ConcurrentSkipListSet class and methods

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetExample {
    public static void main(String[] args) {

        // Create thread-safe sorted set
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

        // Add elements
        set.add(30);
        set.add(10);
        set.add(20);

        // Print sorted set
        System.out.println(set);

        // Check existence
        System.out.println(set.contains(20)); 

        // Get higher value
        System.out.println(set.higher(20));

        // Remove element
        set.remove(10);

        // Get first element
        System.out.println(set.first());
        
    }
}
