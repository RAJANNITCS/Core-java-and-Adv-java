// WAP to demostrating Executor service

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderProcessor {
    public static void main(String[] args) {

        // Crate thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 10 orders
        for (int i = 1; i <= 10; i++) {

            int orderId = i;

            executor.submit(() -> {

                System.out.println(
                        "Processing order : "
                                + orderId
                                + " by "
                                + Thread.currentThread().getName());

                try {
                    // Simulate processing
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            });
        }
        // Shutdown pool
        executor.shutdown();
    }
}
