// WAP to demostrating sorting method of stream class

import java.util.*;
import java.util.stream.Collectors;

public class StreamSortExample {
    public static void main(String[] args) {

        // Create list of integer
        List<Integer> list = Arrays.asList(5, 2, 8, 1, 9);

        // Ascending order using stream 
        List<Integer> ascList = list.stream()
                    .sorted()                     // default ascending
                    .collect(Collectors.toList());

        // Descending order using stream
        List<Integer> descList = list.stream()
                    .sorted(Comparator.reverseOrder()) // descending order
                    .collect(Collectors.toList());

        // print result 
        System.out.println("Ascending = " + ascList);
        System.out.println("Descending = " + descList);
    }
}
