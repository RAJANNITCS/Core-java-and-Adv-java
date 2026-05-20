// WAP to create LRU Cache using linkedlist

import java.util.LinkedList;

public class LRUCacheExample {

    // Maximum cache size
    private final int capacity;

    // Linkedlist to store cache data
    private LinkedList<Integer> cache;

    // Constructor
    public LRUCacheExample(int capacity) {

        // Initialize cache size
        this.capacity = capacity;

        // create Linkedlist
        this.cache = new LinkedList<>();

    }

    // Method to access cache
    public void access(int data) {

        // If element already exists
        if (cache.contains(data)) {

            // Remove old position
            cache.remove(Integer.valueOf(data));

        } else if (cache.size() >= capacity) { // if cache full

            // Remove least recently used item
            cache.removeFirst();
        }

        // Add current item as most recently used
        cache.addLast(data);

    }

    // Disply cache
    public void display() {
        System.out.println(cache);
    }

    public static void main(String[] args) {
        LRUCacheExample cache = new LRUCacheExample(3);

        cache.access(10);
        cache.access(20);
        cache.access(30);

        cache.display();

        cache.access(20);

        cache.display();

        cache.access(40);

        cache.display();
        
    }
}
