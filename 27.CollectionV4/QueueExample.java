// WAP to demostrating queue interface and import methods

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        // Creating Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // Print queue
        System.out.println(queue);

        // check head
        System.out.println(queue.peek());
        
        // Remove element
        System.out.println(queue.poll());

        // Print queue after removing 
        System.out.println(queue);
        
    }
}
