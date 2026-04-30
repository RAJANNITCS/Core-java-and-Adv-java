// WAP to demostrating priority queue

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        // View smallest element
        System.out.println(pq.peek()); // 10

        // Remove element
        System.out.println(pq.poll()); // 10

        // Print queue
        System.out.println(pq); // [20, 30]
    }
}
