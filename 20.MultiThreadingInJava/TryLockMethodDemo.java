// WAP to demostrating Try lock method 

import java.util.concurrent.locks.ReentrantLock;

class Example {

    private ReentrantLock lock = new ReentrantLock();

    public void process() {

        if (lock.tryLock()) { // Try to get lock

            try {
                System.out.println("Lock Acquired");
            } finally {
                lock.unlock(); // Release lock
            }
        } else {
            System.out.println("Could not acquire lock");
        }
    }
}

public class TryLockMethodDemo {
    public static void main(String[] args) {
        Example example = new Example();

        Thread user1 = new Thread(() -> example.process());

        Thread user2 = new Thread(() -> example.process());

        user1.start();
        user2.start();
    }
}
