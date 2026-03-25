// WAP to demostrating Sequential and Parallel stream 

import java.util.stream.*;
import java.util.*;

public class StreamEampleSeqAanPer {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // List<Integer> result = list.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());

        List<Integer> result1 = list.parallelStream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());

        // System.out.println(result);
        System.out.println(result1);
    }
}
