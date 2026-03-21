// WAP to demostrating Predicate with Collection 

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateListExample {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Predicate to filter even number
        Predicate<Integer> isEven = num -> num % 2 == 0;

        for (Integer value : arr) {
            if (isEven.test(value)) {
                System.out.println(value);
            }
        }
    }
}
