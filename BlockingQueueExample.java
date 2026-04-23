// WAP to demostrating BlockingQueue example

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {

         // Create BlockingQueue with capacity 2
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);

        // Producer Thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {

                    System.out.println("Producing: " + i);

                    queue.put(i); // waits if queue is full

                    Thread.sleep(1000); // simulate delay
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {

                    Integer value = queue.take(); // waits if empty

                    System.out.println("Consumed: " + value);

                    Thread.sleep(2000); // simulate processing
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
