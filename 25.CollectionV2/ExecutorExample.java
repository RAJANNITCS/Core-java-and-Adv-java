import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) {
        // 1. Create a Thread Pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 2. Define a task (Runnable - no return value)
        Runnable sendEmailTask = () -> {
            try {
                // Simulate sending an email
                System.out.println("Sending email via: " + Thread.currentThread().getName());
                Thread.sleep(2000); 
                System.out.println("Email Sent!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // 3. Submit 5 tasks to the pool of 3 threads
        for (int i = 0; i < 5; i++) {
            executor.execute(sendEmailTask);
        }

        // 4. Shut down the executor gracefully
        executor.shutdown(); 
        
        System.out.println("Main thread finished. Tasks are running in background...");
    }
}