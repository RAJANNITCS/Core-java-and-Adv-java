// WAP to demostrating String join

import java.util.*;

public class StringJoinExample {
    public static void main(String[] args) {

        // New way
        // Step 1 : Create list
        List<String> list = Arrays.asList("Java", "Python", "C++");

        // Step 2 : Join using dash
        String result = String.join("-", list);

        // Step 3 : Print result
        System.out.println(result);
    }
}
