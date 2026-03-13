// WAP to demostrating Reentrantlock check method.

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    
    // Create a Reentrantlock
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            // acquire the lock
            lock.lock();

            try {
                // check if current thread holds the lock
                boolean isLock = lock.isHeldByCurrentThread();

                System.out.println("Does thread hold lock =" + isLock);

            } finally {
                // release the lock
                lock.unlock();
            }

            // check if current thread holds the lock
            boolean isLock = lock.isHeldByCurrentThread();

            System.out.println("Out side , Does thread hold lock =" + isLock);
        });

        t1.start();
    }
}
