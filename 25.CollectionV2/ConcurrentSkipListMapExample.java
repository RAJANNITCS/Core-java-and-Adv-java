// WAP to demostrating ConcurrentSkipListMap and import method 

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {
    public static void main(String[] args) {

        // Creating ConcurrentSkipListMap
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

        // Insert elements (automatically sorted)
        map.put(5, "Five");
        map.put(1, "One");
        map.put(3, "Tree");

        // Printing map (sorted order)
        System.out.println(map);

        // Get value
        System.out.println(map.get(3));

        // Get first key
        System.out.println(map.firstKey());

        // Get higher key
        System.out.println(map.higherKey(3));

        // Remove element
        map.remove(1);

        // Print after removal
        System.out.println(map);
    }
}
