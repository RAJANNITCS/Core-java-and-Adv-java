// WAP to demostrating spliterator 

// Import Spliterator
import java.util.*;                // Import utilities

public class SpliteratorExample {
    public static void main(String[] args) {

        // Step 1 : Create List
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Step 2 : Get Spliterator
        Spliterator<Integer> spliterator = list.spliterator();

        // Step 3 : Process elements one by one
        spliterator.tryAdvance(System.out::println); // prints 1
        spliterator.tryAdvance(System.out::println); // prints 2

        // Step 4 : Split the remaining data
        Spliterator<Integer> split = spliterator.trySplit();

         // Step 5: Process first half
        System.out.println("First half:");
        spliterator.forEachRemaining(System.out::println);

        // Step 6: Process second half
        System.out.println("Second half:");
        split.forEachRemaining(System.out::println);
        
    }
}
