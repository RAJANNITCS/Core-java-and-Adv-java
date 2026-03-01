// WAP to demostrating fairness 

import java.util.concurrent.locks.ReentrantLock;

public class FairnessExampleDemo {
    
    // Create FIR lock
    private static final ReentrantLock lock = new ReentrantLock(false);

    public static void main(String[] args) {

        // Create 5 threads
        for (int i = 1; i <=5 ; i++) {
            int threadNumber = i; // Store value for lambda

            new Thread(() -> {

                // Acquire lock
                lock.lock();

                try {
                    // Print which thread go to lock
                    System.out.println("Thread" + threadNumber + " acquired the lock");

                    // Simulate some work
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace(); 
                } finally {
                    // Always release lock in finally block
                    lock.unlock();
                }
            }).start();
        }
    }
}
