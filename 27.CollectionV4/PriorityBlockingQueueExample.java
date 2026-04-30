// WAP to demostrating PriorityBlockingQueue

import java.util.concurrent.PriorityBlockingQueue;

// Custome class to define priority
class Task implements Comparable<Task> {

    int priority;
    String name;

    // Constructor
    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    // Define priority logic
    @Override
    public int compareTo(Task other) {
        return this.priority - other.priority; // min-heap
    }

    @Override
    public String toString() {
        return name + " (Priority " + priority + ")";
    }
}

public class PriorityBlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {

        // Create PriorityBlockingQueue
        PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();

        // Add element
        queue.put(new Task(3, "Low Task"));
        queue.put(new Task(1, "High Task"));
        queue.put(new Task(2, "Medium Task"));

        
        // Take elements (based on priority)
        while (!queue.isEmpty()) {
            System.out.println(queue.take());
        }
    }
}
