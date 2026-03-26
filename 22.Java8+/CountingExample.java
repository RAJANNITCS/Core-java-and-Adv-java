// WAP to demostrating counting method of collectors class

import java.util.*;
import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {

        // Step 1 : Create a list
        List<String> list = Arrays.asList("Java","Stream","API");

        // Step 2 : Count elements
        long count = list.stream().collect(Collectors.counting());

        // Step 3 : print result 
        System.out.println(count);
        
    }
}
