// WAP to demostrating For Each Loop

import java.util.*;

public class ForEachLoop {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list.stream().forEach(n -> System.out.println(n));
        
    }
}
