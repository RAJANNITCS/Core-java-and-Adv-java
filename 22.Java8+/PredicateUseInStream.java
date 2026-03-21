// WAP to demostrating Predicate use in Stream API

import java.util.List;
import java.util.Arrays;

public class PredicateUseInStream {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        arr.stream().filter(num -> num % 2 == 0).forEach(System.out :: println);
        
    }
}
