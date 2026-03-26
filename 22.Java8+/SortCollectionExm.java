// WAP to demostrating Collections.sort()

import java.util.*;

public class SortCollectionExm {
    public static void main(String[] args) {
        
        // Crate a list of number
        List<Integer> numbers = Arrays.asList(5,2,8,1,9);

        // Sort in ASCENDING order (default behavior)
        Collections.sort(numbers);

        // Print ascending order
        System.out.println("Ascending Order : " + numbers);

        // Sort in DESCENDING order
        Collections.sort(numbers, Collections.reverseOrder());

        // Print descending order
        System.out.println("Descending order : " + numbers);
        
    }
}
