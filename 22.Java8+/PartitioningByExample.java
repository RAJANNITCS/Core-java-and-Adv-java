// WAP to demostrating PartitioningBy method of collectors class

import java.util.*;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        // Step 1 : Create list of integers
        List<Integer> list = Arrays.asList(5,12,7,20,3,15);

        // Step 2: Partition data
        Map<Boolean, List<Integer>> partitioned = list.stream() //Convert to stream
                    .collect(Collectors.partitioningBy(         // Partition collector
                        n -> n > 10                             // condition
                    ));

        // Step 3 : Print Result
        System.out.println(partitioned);
    }
}
