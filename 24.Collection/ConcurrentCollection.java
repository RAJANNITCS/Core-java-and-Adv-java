// WAP to create Concurrent collection 

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollection {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        Runnable r1 = () -> {
            map.put(1, "A");
            map.put(2, "B");
            map.put(3, "C");
        };

        Runnable r2 = () -> {
            map.put(4, "D");
            map.put(5, "E");
            map.put(6, "F");
        };

        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Map is " + map);
    }
}
