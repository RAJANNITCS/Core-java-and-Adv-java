// WAP to demostrating ArrayBlockingQueue

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueExample {
    public static void main(String[] args) {
        // Create queue with capacity 3
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        // Producer
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {

                    System.out.println("Producing: " + i);

                    queue.put(i); // waits if queue full

                    Thread.sleep(500);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Consumer
        Thread consumer = new Thread(() -> {
            try {
                while (true) {

                    Integer value = queue.take(); // waits if empty

                    System.out.println("Consumed: " + value);

                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
