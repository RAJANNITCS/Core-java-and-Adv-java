// WAP to demostrating Collectors method

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,5,5,6,7,7,8,9,9,10);
        List<String> listOfName = Arrays.asList("rohan", "ravi", "sanoj");
        List<String> listOfCourses = Arrays.asList("Java","API","Stream","Code","AI");
        List<Integer> list1 = Arrays.asList(5, 12, 7, 20, 3, 15);

        // toList()
        List<Integer> even = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        // System.out.println("Even number list = " + even);

        // toSet()
        Set<Integer> unique = list.stream().collect(Collectors.toSet());
        // System.out.println("Only unique number = " + unique);
        
        // toMap()
        Map<String, Integer> map = listOfName.stream().collect(Collectors.toMap(name -> name, name -> name.length()));
        // System.out.println("Length of each name = " + map);

        // groupingBy()
        // Step 2: Use groupingBy collector
        Map<Integer, List<String>> grouped = listOfCourses.stream() // Convert list to stream
                .collect(Collectors.groupingBy(             // Collect result using groupingBy
                        s -> s.length()                    // Key: length of string
                ));
        // System.out.println(grouped);    
        
        // partitioningBy()
        Map<Boolean,List<Integer>> partitioned = list1.stream().collect(Collectors.partitioningBy(n -> n > 10));
        // System.out.println(partitioned);

        // counting()
        long count = listOfName.stream().collect(Collectors.counting());
        // System.out.println("Number of item in list = " + count);

        // joining()
        String result = listOfName.stream().collect(Collectors.joining(","));
        // System.out.println(result);
    }
}
