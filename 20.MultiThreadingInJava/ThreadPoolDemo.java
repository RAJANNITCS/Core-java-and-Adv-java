// WAP to demostrating Thread pool

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 1. Create a Fixed Thread Pool with 3 threads
        // This means only 3 inventory updates can happen at the exact same time.
        ExecutorService service = Executors.newFixedThreadPool(3);
        // 2. Simulate 10 items being updated in the warehouse
        for (int i = 1; i <= 10; i++) {
            int productId = i;
            
            // Submitting a task to the pool
            service.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Thread " + threadName + " is updating Product ID: " + productId);
                
                try {
                    // Simulate database work (taking 1 second)
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                System.out.println("Product " + productId + " update COMPLETE by " + threadName);
            });
        }

        // 3. Shut down the pool after tasks are finished
        service.shutdown(); 
    }
}


