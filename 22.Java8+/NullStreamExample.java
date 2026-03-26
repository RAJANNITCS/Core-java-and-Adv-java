// WAP to filter null from stream

import java.util.*;
import java.util.stream.Collectors;

public class NullStreamExample {
    public static void main(String[] args) {

        // Step 1 : List with null value
        List<String> list = Arrays.asList("A", null, "B", null, "C");

        // Step 2 : Filter nulls before processing
        List<String> result = list.stream()
                    .filter(Objects::nonNull) // filter all null value
                    .map(String::toLowerCase) // safe now
                    .collect(Collectors.toList());

        // Step 2.1 : handle null with default value 
        List<String> result1 = list.stream().map(s -> s == null ? "DEFALUT" : s.toUpperCase()).collect(Collectors.toList());

        // Step 3 : print result
        System.out.println("Result = " + result);

        // Step 3.1 : print result
        System.out.println("Result1 = " + result1);
    }
}
