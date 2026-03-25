// WAP to demostraning distinct operation 

import java.util.*;
import java.util.stream.Collectors;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,3,4,4,5,6,7);

        List<Integer> unique = list.stream().distinct().collect(Collectors.toList());

        System.out.println("unique value = " + unique);
        
    }
}
