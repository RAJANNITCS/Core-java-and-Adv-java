// WAP to demostraing Queue Interface

import java.util.*;

public class QueueInterfaceExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // Create queue

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue.poll()); // Removes first element
        
    }
}
