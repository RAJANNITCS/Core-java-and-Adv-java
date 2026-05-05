// WAP to demostrating Virtual Thread 

import java.util.concurrent.Executors;

public class VirtualThreadExample {
    public static void main(String[] artgs) {

        // Create executor that creates new virtual thread per task
        var executor = Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 0; i < 5; i++) {
            int taskId = i; // Capture loop variable

            executor.submit(() -> {
                // Print Current thread info
                System.out.println("Task " + taskId + " running on " + Thread.currentThread());

                try {
                    // Simulate blocking I/O (Like DB Call)
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.close(); // Shutdown executor
        
    }
}
