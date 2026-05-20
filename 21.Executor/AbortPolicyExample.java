// WAP to demostrating AbortPolicy 

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AbortPolicyExample {
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(

                2,
                2,
                10,
                TimeUnit.SECONDS,

                // Queue size = 2
                new ArrayBlockingQueue<>(2),

                // Rejection policy
                new ThreadPoolExecutor.AbortPolicy());

        // Submit 10 tasks
        for (int i = 1; i <= 10; i++) {

            int taskId = i;

            executor.submit(() -> {

                System.out.println(
                        "Executing Task : " + taskId);

                try {

                    Thread.sleep(5000);

                } catch (Exception e) {

                    e.printStackTrace();
                }
            });
        }
    }
}
