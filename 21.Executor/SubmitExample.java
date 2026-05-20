// WAP to demostrating Submit method of ExecuterService

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SubmitExample {
    public static void main(String[] args) throws Exception {

        // Crate thread Pool
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit Callable task
        Future<Integer> future = executor.submit(() -> {
            // Simulate calculation 
            return 100 + 200;
        });

        // Get result
        Integer result = future.get();

        // Print result 
        System.out.println(result);

        // Shutdown executor
        executor.shutdown();

        System.out.println(
                "Waiting for tasks to finish..."
        );

        // Wait maximum 5 seconds
        boolean finished =
                executor.awaitTermination(
                        5,
                        TimeUnit.SECONDS
                );

        // Print result
        System.out.println(
                "All tasks completed: "
                + finished
        );
    }
}
