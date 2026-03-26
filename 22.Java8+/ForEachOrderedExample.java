// WAP to demostrating forEachOrdered

import java.util.Arrays;
import java.util.List;

public class ForEachOrderedExample {
    public static void main(String[] args) {
        // Step 1 : Create a list of number
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // Step 2 : Use parallel stream with forEach
        list.parallelStream().forEachOrdered(num -> System.out.print(num + " "));
    }
}
