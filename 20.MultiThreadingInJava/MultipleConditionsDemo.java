// WAP to demostrating multiple condation 

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class BoundedBuffer {

    // Create lock
    private ReentrantLock lock = new ReentrantLock();

    // Condition for buffer not full
    private Condition notFull = lock.newCondition();

    // Condition for buffer not empty
    private Condition notEmpty = lock.newCondition();

    private int count = 0; // current itmes
    private int capacity = 5; // max buffer size

    // Producer method
    public void produce() throws InterruptedException {

        lock.lock(); // acquire lock

        try {
            // Wait while buffer is full
            while (count == capacity) {
                System.out.println("Buffer full. Producer waiting .....");
                notFull.await(); // wait on notFull condition
            }

            // Add item
            count++;
            System.out.println("Produced . Current count :" + count);

            // Singnal consume that item is available
            notEmpty.signal();
        } finally {
            lock.unlock(); // relese lock
        }
    }

    // Consumer method
    public void consume() throws InterruptedException {

        lock.lock(); // acquire lock

        try {

            // Wait while buffer is empty
            while (count == 0) {
                System.out.println("Buffer empty. Consumer waiting...");
                notEmpty.await(); // wait on notEmpty condition
            }

            // Remove item
            count--;
            System.out.println("Consumed. Current count: " + count);

            // Signal producer that space is available
            notFull.signal();

        } finally {
            lock.unlock(); // release lock
        }
    }
}

public class MultipleConditionsDemo {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.produce();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.consume();
                    Thread.sleep(800);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();

    }
}
