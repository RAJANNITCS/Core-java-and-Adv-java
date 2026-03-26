// WAP to Using map() (Nested Result)

import java.util.*;
import java.util.stream.*;

public class MapForNestedResultExample {
    public static void main(String[] args) {
        // Creating list of list
        List<List<String>> list = Arrays.asList(
            Arrays.asList("a","b"),
            Arrays.asList("c","d")
        );

        // Using map()
        List<Stream<String>> result = list.stream()
            .map(innerList -> innerList.stream().map(String :: toUpperCase)) // convert each list to stream
            .collect(Collectors.toList());        // collect into list

        // Printing result
        result.forEach(stream -> {
            stream.forEach(System.out :: println); // print each inner stream
            System.out.println();
        });
    }
}
