// WAP to demostrating ThreadPoolExecutor

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {

        // Create ThreadPoolExecutor manually
        ThreadPoolExecutor executor = new ThreadPoolExecutor(

                // Minimum threads always alive
                2,

                // Maximum allowed threads
                4,

                // Extra thread idle timeout
                60,

                // Time unit for keepAliveTime
                TimeUnit.SECONDS,

                // Queue to store waiting tasks
                new ArrayBlockingQueue<>(2),

                // Rejection policy
                new ThreadPoolExecutor.AbortPolicy());

        // Submit 8 tasks
        for (int i = 1; i <= 8; i++) {

            // Final variable for lambda
            int taskId = i;

            try {

                // Submit task
                executor.execute(() -> {

                    // Print task execution info
                    System.out.println(
                            "Executing Task "
                                    + taskId
                                    + " by "
                                    + Thread.currentThread().getName());

                    try {

                        // Simulate long-running work
                        Thread.sleep(5000);

                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }

                    // Task completed message
                    System.out.println(
                            "Completed Task "
                                    + taskId);
                });

            } catch (Exception e) {

                // Print rejected task
                System.out.println(
                        "Task Rejected: "
                                + taskId);
            }
        }

        // Shutdown executor gracefully
        executor.shutdown();
    }
}
