// WAP to demostrating Stream 

import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {

        // Step 1 : Create a list
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Step 2 : Create stream and process
        List<Integer> result = list.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());

        // Step 3 : Print result
        System.out.println(result);
        
    }
}
