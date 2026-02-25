// WAP to demostrating lock method in ReentrantLock class

import java.util.concurrent.locks.ReentrantLock;

class Example {

    private ReentrantLock lock = new ReentrantLock(); // create lock

    public void display() {

        lock.lock(); // Acquire lock
        try {
            System.out.println(Thread.currentThread().getName() + " Entered");
        } finally {
            lock.unlock(); // Release lock
        }
    }
}

public class LockMethodDemo {
    public static void main(String[] args) {
        Example example = new Example();

        Thread user1 = new Thread(() -> {
            example.display();
        });

         Thread user2 = new Thread(() -> {
            example.display();
        });

        user1.start();
        user2.start();
    }
}
