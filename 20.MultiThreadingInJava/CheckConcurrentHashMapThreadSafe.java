// WAP to check is Concurrent Hashmap thread safe 

import java.util.concurrent.ConcurrentHashMap;

public class CheckConcurrentHashMapThreadSafe {
    public static void main(String[] args) {
        // Thread-safe map
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        // Thread 1
        new Thread(() -> {
            map.put("user", "Alice");
        }).start();

        // Thread 2
        new Thread(() -> {
            map.put("user", "Bob");
        }).start();

        System.out.println(map);
    }
}
