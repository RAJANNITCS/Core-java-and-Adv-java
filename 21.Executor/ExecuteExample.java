// WAP to demostrating Execute method of ExecuterService interface

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteExample {
    public static void main(String[] args) {

        // Create thread pool with 2 thread
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit Runnable task
        executor.execute(() -> {

            // Print current thread name
            System.out.println(Thread.currentThread().getName());

        });

        // Shutdown executor
        executor.shutdown();
    }
}
