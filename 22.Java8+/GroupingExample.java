// WAP to demostrating groupingBy method of Collectors class

import java.util.*;
import java.util.stream.Collectors;

public class GroupingExample {
    public static void main(String[] args) {

        // Step 1 : Create a list of strings
        List<String> list = Arrays.asList("Java", "API","Stream","Code","AI");

        // Step 2 : Use groupingBy collector
        Map<Integer, List<String>> grouped = list.stream() // Convert list to stream 
            .collect(Collectors.groupingBy(                // Collect result using group
                s -> s.length()                            // key : length to string
            ));

        // Step 3 : print result
        System.out.println(grouped);
    }
}
