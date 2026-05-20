import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

// RecursiveTask because we want result
class SumTask extends RecursiveTask<Integer> {

    // Array to process
    private int[] array;

    // Start index
    private int start;

    // End index
    private int end;

    // Threshold for splitting
    private static final int THRESHOLD = 4;

    // Constructor
    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    // Main computation method
    @Override
    protected Integer compute() {

        // If task is small enough
        if ((end - start) <= THRESHOLD) {

            // Process directly
            int sum = 0;

            for (int i = start; i < end; i++) {
                sum += array[i];
            }

            return sum;
        }

        // Find middle
        int mid = (start + end) / 2;

        // Create left subtask
        SumTask leftTask = new SumTask(array, start, mid);

        // Create right subtask
        SumTask rightTask = new SumTask(array, mid, end);

        // Fork left task asynchronously
        leftTask.fork();

        // Compute right task directly
        int rightResult = rightTask.compute();

        // Join left result
        int leftResult = leftTask.join();

        // Combine results
        return leftResult + rightResult;
    }
}

public class Main {

    public static void main(String[] args) {

        // Sample array
        int[] numbers = {
            1,2,3,4,5,6,7,8,9,10
        };

        // Create pool
        ForkJoinPool pool = new ForkJoinPool();

        // Create task
        SumTask task = new SumTask(numbers, 0, numbers.length);

        // Execute task
        int result = pool.invoke(task);

        // Print result
        System.out.println("Sum = " + result);
    }
}