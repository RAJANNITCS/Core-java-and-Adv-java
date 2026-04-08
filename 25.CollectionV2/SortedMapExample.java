// WAP to demostrating SortedMap interface import methods

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {

        // Create TreeMap (SortedMap implementation)
        SortedMap<Integer, String> map = new TreeMap<>();

        // Adding elements (key-value)
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Mango");

        // Print map (sorted by keys)
        System.out.println(map); 

        // Get first key
        System.out.println(map.firstKey());

        // Get last key
        System.out.println(map.lastKey());

        // Get key less than 3
        System.out.println(map.headMap(3));

        // Get keys greater or eequal to 2
        System.out.println(map.tailMap(2)); 

        // Get range 1 to 3 (excluding 3)
        System.out.println(map.subMap(1, 3)); 

    }
}
