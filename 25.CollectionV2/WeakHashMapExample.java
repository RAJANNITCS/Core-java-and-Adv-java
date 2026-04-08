// WAP to demostrating WeakHashMap example

import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) throws InterruptedException {

        // Create WeaKHashMap object
        WeakHashMap<String,String> map = new WeakHashMap<>();

        // Create key with strong reference
        String key = new String("User1");

        map.put(key, "Rajan");

        // Print map before gc
        System.out.println("Before GC = " + map);


        // Removing strong reference
        key = null;

        // Suggesting JVM to run GC
        System.gc();

        // Waiting for GC
        Thread.sleep(1000);

        // Printing map after GC
        System.out.println("After GC: " + map);
    }
}
