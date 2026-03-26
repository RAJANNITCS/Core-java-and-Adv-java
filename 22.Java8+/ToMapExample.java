// WAP to demostrating toMap method of Collectors class

import java.util.*;
import java.util.stream.Collectors;

public class ToMapExample {
    public static void main(String[] args) {

        // Step 1 : Create a list of strings
        List<String> list = Arrays.asList("Java", "API", "Code");

        // Step 2 : Convert to map
        Map<Integer, String> map = list.stream()
        .collect(Collectors.toMap(
                s -> s.length(),                  // Key
                s -> s,                           // Value
                (oldValue, newValue) -> oldValue  // Handle duplicate keys
        ));
        
        // Step 3 : Print result
        System.out.println(map);
    }
}
