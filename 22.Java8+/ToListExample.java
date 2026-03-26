// WAP to demostrating toList method of Collectors class

import java.util.*;
import java.util.stream.Collectors;

public class ToListExample {
    public static void main(String[] args) {
        
        // Step 1: Creating a list of integer
        List<Integer> list = Arrays.asList(5,8,2,10,21,34);

        // Step 2: filter number > 10
        List<Integer> result = list.stream().filter(num -> num > 10).collect(Collectors.toList());

        // if you need array list
        
        // Step 3 print result
        System.out.println(result);
    }
}
