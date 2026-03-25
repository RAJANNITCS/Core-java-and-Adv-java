// WAP to demostrating sorted operation

import java.util.*;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,1,9,7,3,6);

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        // Custom Sorting
        List<Integer> descendingOrd = list.stream().sorted((a, b) -> b - a).collect(Collectors.toList());

        System.out.println("Sorted list = " + sortedList);

        System.out.println("Sorted in descending order = " + descendingOrd);
    }
}
