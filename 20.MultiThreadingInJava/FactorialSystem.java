import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

// 1. Define the Math Task using Callable so we can return a value (the result).
class FactorialCalculator implements Callable<BigInteger> {
    private final int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    // This is the method the thread in the pool will execute.
    @Override
    public BigInteger call() throws Exception {
        System.out.println("Thread " + Thread.currentThread().getName() + " is starting calculation for " + number + "!");
        
        // Call our factorial logic.
        BigInteger result = calculateFactorial(number);

        System.out.println("Thread " + Thread.currentThread().getName() + " FINISHED calculation for " + number + ".");
        return result;
    }

    // Actual, iterative factorial calculation logic.
    private BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

public class FactorialSystem {
    public static void main(String[] args) {
        // Numbers we want to find the factorial for.
        int[] numbersToCalculate = {5, 12, 20, 8, 15, 10, 25};

        // 2. Create the Thread Pool: EXACTLY THREE THREADS.
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // A list to hold our Future "receipts" to collect results later.
        List<Future<BigInteger>> futureResults = new ArrayList<>();

        // 3. Submit all the tasks to the pool.
        System.out.println("Submitting " + numbersToCalculate.length + " math tasks to the 3-thread pool...");
        for (int num : numbersToCalculate) {
            FactorialCalculator task = new FactorialCalculator(num);
            
            // Submitting to the pool immediately returns a Future "receipt".
            Future<BigInteger> futureReceipt = pool.submit(task);
            
            // Store the future receipt.
            futureResults.add(futureReceipt);
        }

        // 4. Shut down the pool (important! stops accepting new work, lets current finish).
        pool.shutdown();

        // 5. Collect and print the results using the Future objects.
        System.out.println("\n--- Processing and collecting results ---");
        for (int i = 0; i < numbersToCalculate.length; i++) {
            try {
                // The .get() method will BLOCK (wait) until that specific task finishes.
                BigInteger factorialResult = futureResults.get(i).get();
                
                System.out.println("The factorial of " + numbersToCalculate[i] + " is: " + factorialResult);
            
            } catch (InterruptedException e) {
                // The current main thread was interrupted while waiting.
                Thread.currentThread().interrupt();
                e.printStackTrace();
            } catch (ExecutionException e) {
                // The factorial task itself threw an exception during calculation.
                System.err.println("Error calculating factorial for number " + numbersToCalculate[i]);
                e.printStackTrace();
            }
        }

        System.out.println("\nAll factorial calculations are complete!");
    }
}