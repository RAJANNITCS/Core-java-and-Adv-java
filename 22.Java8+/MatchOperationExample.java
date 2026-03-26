// WAP to demostraing match operation in stream

import java.util.*;

public class MatchOperationExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        boolean result = false;
        // anyMatch()
        
        // result = list.stream().anyMatch(n -> n < 5);

        //allMatch()
        // result = list.stream().allMatch(n -> n > 5);

        //noneMatch()
        result = list.stream().noneMatch(n -> n < 0);

        System.out.println("Result is = " + result);
    }
}
