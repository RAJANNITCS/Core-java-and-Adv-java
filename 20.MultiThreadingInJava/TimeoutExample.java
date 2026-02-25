// WAP to demostrating try lock method with time

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Example {

    private ReentrantLock lock = new ReentrantLock();

    public void process() throws InterruptedException {
        if (lock.tryLock(5, TimeUnit.SECONDS)) {

            try {
                System.out.println("Lock acquired");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Timeout - Could not acquire lock");
        }
    }
}

public class TimeoutExample {
    public static void main(String[] args) {
        Example example = new Example();
        Thread user1 = new Thread(() -> {
            try {
                example.process();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread user2 = new Thread(() -> {
            try {
                example.process();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        user1.start();
        user2.start();
    }
}
