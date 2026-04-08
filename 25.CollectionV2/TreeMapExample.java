// WAP to demostraing TreeMap class and import method 

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        // Create TreeMap object
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding elements
        map.put(30, "Apple");
        map.put(10, "Banana");
        map.put(20, "Mango");

        // Print sorted map
        System.out.println(map);

        // Get value by key
        System.out.println(map.get(20)); // Mango

        // First and last keys
        System.out.println(map.firstKey()); // 10
        System.out.println(map.lastKey()); // 30

        // Navigation methods
        System.out.println(map.lowerKey(20)); // 10
        System.out.println(map.floorKey(20)); // 20
        System.out.println(map.ceilingKey(25)); // 30
        System.out.println(map.higherKey(20)); // 30

        // Range operations
        System.out.println(map.subMap(10, 30)); // {10=Banana, 20=Mango}

        // Remove smallest element
        System.out.println(map.pollFirstEntry()); // 10=Banana
    }
}
