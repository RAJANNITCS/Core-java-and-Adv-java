// WAP to demostrating LinkedBlockingQueue class and import method

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {
    public static void main(String[] args) {

        // Create queue (unbounded by default)
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {

                    System.out.println("Producing: " + i);

                    queue.put(i); // will not block normally

                    Thread.sleep(500);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
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
