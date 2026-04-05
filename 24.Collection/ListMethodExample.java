// WAP to demostrating add method 

import java.util.*;

public class ListMethodExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // Create List

        list.add("A"); // Add element
        list.add("B");
        list.add("A"); // Duplicate allowed

        System.out.println(list.get(1)); // Access element

        list.set(1, "C"); // Replace element

        list.remove("A"); // Remove element

        System.out.println(list);
    }
}
