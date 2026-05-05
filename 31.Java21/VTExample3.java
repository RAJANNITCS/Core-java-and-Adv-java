// WAP to demostrating Virtual Thread 

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VTExample3 {
    public static void main(String[] args) {

        // Create executor for virtual threads
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 0; i < 5; i++) {
            int taskId = i;

            executor.submit(() -> {
                System.out.println("Task " + taskId + "running in " + Thread.currentThread());
            });
        }

        executor.close(); // shutdown
    }
}
