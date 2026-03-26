// WAP to demostrating exception in stream 

import java.util.*;

public class ExceptionInStream {
    public static void main(String[] args) {

        // Step 1: Create list of IDs (some invalid)
        List<String> ids = Arrays.asList("10", "20", "abc", "40");


        // Step 2: Process using stream
        ids.stream().map(id -> {
            try {
                // try to converting String to Integer
                return Integer.parseInt(id); // may throw exception
            } catch (NumberFormatException e) {
                // Handle invalid input
                System.out.println("Invalid number : " + id);
                return -1; // return default value
            }
        }).forEach(System.out :: println);

    }
}
