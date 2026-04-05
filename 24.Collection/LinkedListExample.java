// WAP to demostrating Linkedlist 

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add element at end
        list.add("A");
        list.add("B");

        // Add element at beginning
        list.addFirst("Start"); // insert at head

        // Add element at specific index
        list.add(1, "X"); // inserts at index 1

        // Access element
        String value = list.get(1); // fetch element at index 1

        System.out.println(value);

        System.out.println(list);
    } 
}
