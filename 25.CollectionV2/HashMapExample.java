// WAP to demostrating HashMap and import methods

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        // Create HashMap object
        Map<Integer,String> map = new HashMap<>();

        // Insert Key-value pairs
        map.put(1, "Amit"); 
        map.put(2, "Rahul");

        // Get value using key
        System.out.println(map.get(2));

        // check key exists
        System.out.println(map.containsKey(2));

        // remove element
        map.remove(1);

        System.out.println(map);
    }
}
