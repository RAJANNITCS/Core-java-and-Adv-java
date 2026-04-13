// WAP to demostrating Deque and import methods

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {

        // Create Deque using ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        // Add elements at front
        deque.offerFirst(10); // [10]
        deque.offerFirst(20); // [20, 10]

        // Add elements at rear
        deque.offerLast(30);  // [20, 10, 30]

        System.out.println(deque);

        // View front element
        System.out.println(deque.peekFirst());

        // View last element
        System.out.println(deque.peekLast());

        // Remove Front
        deque.pollFirst(); // removes 20

        // Remove Last
        deque.pollLast(); // removes 30

        // Print deque
        System.out.println(deque);
    }
}
