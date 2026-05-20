// WAP to demostrating and create LRU cache using LinkedHashMap

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    // Maximum capacity
    private final int capacity;

    // Constructor
    public LRUCache(int capacity) {

        super(capacity, 0.75f,true);

        this.capacity = capacity;

    }

    // Remove eldest entry automatically
    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1,"A");
        cache.put(2,"B");
        cache.put(3, "C");

        System.out.println(cache);

        // Access key 1
        cache.get(1);

        System.out.println(cache);

        // Add new element
        cache.put(4, "D");

        System.out.println(cache);
    }
}
