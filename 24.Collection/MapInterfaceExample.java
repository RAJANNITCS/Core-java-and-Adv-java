// WAP to demostrating Map interface 

import java.util.*;

public class MapInterfaceExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(); // Create HashMap

        map.put(1, "John");
        map.put(2, "Alice");
        map.put(3, "Mike");

        System.out.println(map.get(1)); // Get value using key
    }
}
