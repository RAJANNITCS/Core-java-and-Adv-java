// WAP to demostrating toSet() method

import java.util.*;
import java.util.stream.Collectors;

public class ToSetExample {
    public static void main(String[] args) {

        // Step 1: Create list with duplicates
        List<Integer> list = Arrays.asList(1,2,2,3,3,4,4,5,5);

        // Step 2 : Convert to set
        Set<Integer> result = list.stream().collect(Collectors.toSet());

        // Step 3 : print result
        System.out.println(result);
    }
}
