// WAP to demostrating LinkedList 

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10); // [10]
        list.add(20); // [10, 20]

        // Add at beginning
        list.addFirst(5); // [5, 10, 20]

        // Add at end
        list.addLast(30); // [5, 10, 20, 30]

        // Access element
        System.out.println(list.get(1)); // 10

        // Remove element
        list.remove(2); // removes 20

        // Print list
        System.out.println(list); // [5, 10, 30]
        
    }
}