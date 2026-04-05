// WAP to demostrating Collections.synchronizedList

import java.util.*;

public class SynchronizedListExample {
    public static void main(String[] args) {

        // Create list 
        List<String> list = Collections.synchronizedList(new ArrayList<>());

        // Adding elements
        list.add("A");
        list.add("B");

        // Iteration MUST be synchronized
        synchronized(list) { // lock required
            for (String str : list) {
                System.out.println(str);
            }
        }
        
    }
}
