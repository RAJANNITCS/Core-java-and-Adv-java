// WAP to demostrating to wrap excetption 

import java.util.*;

public class WrapExceptionInStream {
    public static void main(String[] args) {

        // Step 1: Create list of IDs (some invalid)
        List<String> ids = Arrays.asList("10", "20", "abc", "40");

        // Step 2: Process using stream
        ids.stream().map(id -> {
            try {
                // try to converting String to Integer
                return Integer.parseInt(id); // may throw exception
            } catch (NumberFormatException e) {
                throw new RuntimeException(e); // wrap
            }
        }).forEach(System.out :: println);
    }
}
