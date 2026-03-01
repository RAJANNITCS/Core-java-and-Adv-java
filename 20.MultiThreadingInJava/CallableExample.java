// WAP to demostrating Callable interface
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


// 1. Define a task that returns a String result
class PaymentProcessor implements Callable<String> {

    private String paymentId;

    public PaymentProcessor(String paymentId) {
        this.paymentId = paymentId;
    }

    // The call() method contains the logic and can throw exception 
    @Override
    public String call() throws Exception {
        System.out.println("Processing payment for ID : " + paymentId + "on Thread : " + Thread.currentThread().getName());

        // Simulate a long-running database or API call (2 seconds)
        Thread.sleep(2000); 

        // Return the result of the computation
        return "SUCCESS: Transaction " + paymentId + " completed.";
    }
}

public class CallableExample {
    public static void main(String[] args) {
        // Create a Thread Pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create the task
        PaymentProcessor task = new PaymentProcessor("TXN-998877");

        System.out.println("Submitting payment request...");

        // 2. Submit the Callable task to the executor
        // This returns a Future immediately
        Future<String> futureResult = executor.submit(task);

        System.out.println("Payment is being processed in background. I can do other work here!");

        try {
            // 3. Get the result from Future. 
            // Note: .get() is a blocking call. It waits until the thread finishes.
            String finalStatus = futureResult.get(5, TimeUnit.SECONDS); 
            
            System.out.println("Final Result: " + finalStatus);
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Task was interrupted or failed: " + e.getMessage());
        } catch (java.util.concurrent.TimeoutException e) {
            System.err.println("Payment took too long! Timing out.");
        } finally {
            // 4. Always shut down the executor to prevent memory leaks
            executor.shutdown();
        }
    }
}
