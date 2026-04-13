// WAP to demostrating CuncurrentMap interface method 

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapExample {
    public static void main(String[] args) {

        // Creating concurrentMap using ConcurrentHashMap
        ConcurrentMap<String,Integer> map = new ConcurrentHashMap<>();

        // adding values
        map.put("A", 1);
        map.put("B", 2);

        // putIfAbsent - will not overwrite existing key
        map.putIfAbsent("A", 100);

        // Replace value
        map.replace("B", 200);

        // Conditional remove
        map.remove("A",1);

        // Print map
        System.out.println(map);
    }
}
