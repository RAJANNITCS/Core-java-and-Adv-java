// WAP to demostrating future and future task

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureComparison {
    public static void main(String[] args) throws Exception {

        // ---- CASE 1 : Using Future (The Standard Way)
        ExecutorService excutor = Executors.newSingleThreadExecutor();

        // submit() returns an implementation of Future (usually a FutureTask internally)
        Future<String> standardFuture = excutor.submit(() -> {
            Thread.sleep(1000);
            return "Bank report Generated via Executor";
        });

        // We treat it as a future interface
        System.out.println("Status 1: " + standardFuture.get());

        // --- CASE 2: Using FutureTask (The Manual/Custom Way) ---
        // We create the 'Container' (FutureTask) ourselves
        FutureTask<String> customTask = new FutureTask<>(() -> {
            Thread.sleep(1000);
            return "Inventory Sync Completed via FutureTask";
        });

        // Since FutureTask IS a Runnable, we can give it to a raw Thread
        Thread thread = new Thread(customTask);
        thread.start();

        // Since FutureTask IS a Future, we can call .get() on it
        System.out.println("Status 2: " + customTask.get());

        excutor.shutdown();
    }
}