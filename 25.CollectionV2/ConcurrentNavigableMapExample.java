// WAP to demostrating ConcurrentNavigableMap interface and method 

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentNavigableMapExample {
    public static void main(String[] args) {
        // Creating ConcurrentNavigableMap
        ConcurrentNavigableMap<Integer, String> map = new ConcurrentSkipListMap<>();

        // Adding elements
        map.put(10, "A"); // insert key 10
        map.put(20, "B"); // insert key 20
        map.put(30, "C"); // insert key 30

        // Navigation methods
        System.out.println(map.lowerKey(20)); // 10
        System.out.println(map.floorKey(20)); // 20
        System.out.println(map.ceilingKey(25)); // 30
        System.out.println(map.higherKey(20)); // 30

        // Sub map
        System.out.println(map.subMap(10, 30)); // keys between 10 and 30

        // First and last
        System.out.println(map.firstKey()); // 10
        System.out.println(map.lastKey()); // 30
    }
}
