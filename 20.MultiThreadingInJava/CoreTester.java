import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Collectors; // 1. MUST import this in Java 8

public class CoreTester {
    public static void main(String[] args) {
        // Create a huge list of numbers using Java 8 syntax
        List<Long> numbers = LongStream.rangeClosed(1, 1_000_000)
                                      .boxed()
                                      .collect(Collectors.toList()); // 2. Fix: Use collect()

        // 1. Sequential approach (Uses only 1 Core)
        long start1 = System.currentTimeMillis();
        // We perform math on 1 million numbers one by one
        long count1 = numbers.stream()
                             .map(n -> Math.sqrt(n))
                             .count(); 
        System.out.println("Sequential Time: " + (System.currentTimeMillis() - start1) + "ms");

        // 2. Parallel approach (Uses ALL available Cores)
        long start2 = System.currentTimeMillis();
        // Java 8 uses the ForkJoinPool to split this task across CPU cores
        long count2 = numbers.parallelStream()
                             .map(n -> Math.sqrt(n))
                             .count(); 
        System.out.println("Parallel Time: " + (System.currentTimeMillis() - start2) + "ms");
    }
}