// WAP to demostrating skip operation 

import java.util.*;
import java.util.stream.Collectors;

public class SkipExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> result = list.stream().skip(3).limit(7).collect(Collectors.toList());

        System.out.println(result);
    }
}
