// WAP to demostrating ArrayDeque class and importent methods

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        // Create ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        // Add elements at rear
        deque.offerLast(10); // [10]
        deque.offerLast(20); // [10, 20]

        // Add element at front
        deque.offerFirst(5); // [5, 10, 20]

        // Print deque
        System.out.println(deque);

        // Access element at front
        System.out.println(deque.peekFirst()); // 5
        System.out.println(deque.peekLast()); // 20

        deque.pollFirst(); // removes 5
        deque.pollLast(); // removes 20

        // Print deque
        System.out.println(deque);
    }
}
