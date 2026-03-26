// WAP to Using flatMap() (Flattened Result)

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapFlatternedExample {
    public static void main(String[] args) {

        // Creating list of lists
        List<List<String>> list = Arrays.asList(
            Arrays.asList("a","b"),
            Arrays.asList("c","d")
        );

        // Using flatMap()
        List<String> result = list.stream()
            .flatMap(innerList -> innerList.stream()).map(String :: toUpperCase)
            .collect(Collectors.toList());


        // Printing result
        System.out.println(result);

    }
}