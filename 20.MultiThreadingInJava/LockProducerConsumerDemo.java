import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

// Producer-Consumer using ReentrantLock + Multiple Conditions

class LockBuffer {

    private final ReentrantLock lock = new ReentrantLock();

    // Separate conditions
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    private int count = 0;
    private final int capacity = 2;

    // Producer method
    public void produce(String name) throws InterruptedException {

        lock.lock(); // acquire lock

        try {
            while (count == capacity) {
                System.out.println(name + " waiting (Buffer FULL)");
                notFull.await(); // wait only producers queue
            }

            count++;
            System.out.println(name + " produced. Count: " + count);

            notEmpty.signal(); // wake ONLY consumers

        } finally {
            lock.unlock(); // release lock
        }
    }

    // Consumer method
    public void consume(String name) throws InterruptedException {

        lock.lock(); // acquire lock

        try {
            while (count == 0) {
                System.out.println(name + " waiting (Buffer EMPTY)");
                notEmpty.await(); // wait only consumers queue
            }

            count--;
            System.out.println(name + " consumed. Count: " + count);

            notFull.signal(); // wake ONLY producers

        } finally {
            lock.unlock();
        }
    }
}

public class LockProducerConsumerDemo {

    public static void main(String[] args) {

        LockBuffer buffer = new LockBuffer();

        // Multiple producers
        for (int i = 1; i <= 3; i++) {
            String name = "Producer-" + i;

            new Thread(() -> {
                try {
                    for (int j = 0; j < 5; j++) {
                        buffer.produce(name);
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        // Multiple consumers
        for (int i = 1; i <= 3; i++) {
            String name = "Consumer-" + i;

            new Thread(() -> {
                try {
                    for (int j = 0; j < 5; j++) {
                        buffer.consume(name);
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}