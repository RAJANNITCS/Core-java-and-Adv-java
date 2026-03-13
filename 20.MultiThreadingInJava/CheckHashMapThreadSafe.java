// WAP to checking Hashmap thread safe 

import java.util.HashMap;
import java.util.Map;

public class CheckHashMapThreadSafe {
    public static void main(String[] args) {
        // Creating a normal HashMap
        Map<String, String> map = new HashMap<>();

        // Thread 1
        new Thread(() -> {
            map.put("user", "Alice"); // Thread 1 inserts value
        }).start();

        // Thread 2
        new Thread(() -> {
            map.put("user", "Bob"); // Thread 2 inserts value
        }).start();

        System.out.println(map);
    }
}
