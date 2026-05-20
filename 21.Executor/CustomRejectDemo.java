import java.util.concurrent.*;

// Custom rejection handler
class CustomRejectHandler
        implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(
            Runnable r,
            ThreadPoolExecutor executor) {

        System.out.println(
                "Task Rejected : " + r.toString()
        );

        System.out.println(
                "Active Threads : "
                + executor.getActiveCount()
        );

        System.out.println(
                "Queue Size : "
                + executor.getQueue().size()
        );
    }
}

public class CustomRejectDemo {

    public static void main(String[] args) {

        // Create executor
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(

                        2,
                        2,
                        10,
                        TimeUnit.SECONDS,

                        new ArrayBlockingQueue<>(2),

                        // Custom handler
                        new CustomRejectHandler()
                );

        // Submit many tasks
        for (int i = 1; i <= 10; i++) {

            int id = i;

            executor.submit(() -> {

                System.out.println(
                        "Running Task : " + id
                );

                try {

                    Thread.sleep(5000);

                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
    }
}