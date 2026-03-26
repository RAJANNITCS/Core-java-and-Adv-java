// WAP to demostrating sorted method of stream 

import java.util.*;
import java.util.stream.Collectors;

public class SortedMethodExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,3,1,9,8);

        // sort list 
        List<Integer> result = list.stream().sorted().collect(Collectors.toList());

        System.out.println(result);
    }
}
