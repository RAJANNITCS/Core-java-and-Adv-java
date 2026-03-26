// WAP to demostrating ForEach loop

import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {

        // Step 1 : Create a list of number
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // Step 2 : Use parallel stream with forEach
        list.parallelStream().forEach(num -> System.out.print(num + " "));

    }
}
