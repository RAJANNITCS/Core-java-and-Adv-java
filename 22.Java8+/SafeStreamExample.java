// WAP to demostrating Safe Steam Example 

import java.util.concurrent.CopyOnWriteArrayList;

public class SafeStreamExample {
    public static void main(String[] args) {

        // Thread safe-list
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Add elements
        list.add("A");
        list.add("B");
        list.add("C");

        // Modify during streaming
        list.stream().forEach(item -> {

            // Print each item 
            System.out.println(item);

            // Modify
            list.add("D");

        });

        // Print final list
        System.out.println(list);
        
    } 
}
