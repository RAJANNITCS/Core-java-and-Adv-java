// WAP to demostrating CallerRuns policy

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CallerRunsExample {
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(

                2,
                2,
                10,
                TimeUnit.SECONDS,

                new ArrayBlockingQueue<>(2),

                new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 1; i <= 10; i++) {

            int taskId = i;

            executor.submit(() -> {

                System.out.println(

                        Thread.currentThread().getName()
                                + " executing Task : "
                                + taskId);

                try {

                    Thread.sleep(3000);

                } catch (Exception e) {

                    e.printStackTrace();
                }
            });
        }
    }
}
