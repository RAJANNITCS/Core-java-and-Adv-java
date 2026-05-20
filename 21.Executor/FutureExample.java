// WAP to demostrating using of future 

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws Exception {

        // Create thred pool with 2 thread 
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        // Submit callable task
        Future<Integer> future = executor.submit(() -> {
            //Simulate long task
            Thread.sleep(3000);

            return 500;
        });

        System.out.println("Task Submitted");

        // Get Result
        Integer result = future.get();

        System.out.println(result);

        // Shutdown executor
        executor.shutdown();
        
    }
}
