// WAP to demostrating map interface important methods

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        // Create hashMap object
        Map<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1,"Amit");
        map.put(2, "rahul");
        map.put(3, "neha");

        // Fetch value using key
        System.out.println(map.get(2));

        // check key exists
        System.out.println(map.containsKey(2));

        // Iterate using entrySet
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
