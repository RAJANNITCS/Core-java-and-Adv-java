// WAP to demostrating Joining method of Collectors class

import java.util.*;
import java.util.stream.Collectors;

public class JoiningExample {
    public static void main(String[] args) {
        
        // Step 1 : create list
        List<String> list = Arrays.asList("Java", "Stream", "API");

        // Step 2 : Join elements
        String result = list.stream().collect(Collectors.joining(","));

        // Step 3 : print result 
        System.out.println(result);
    }
}
