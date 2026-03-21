// WAP to demostrating of useing consumer with collections

import java.util.List;
import java.util.Arrays;

public class ConsumerListExample {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // arr.forEach(value -> System.out.println(value)); // consumer used

        arr.stream().filter(num -> num % 2 == 0).map(num -> num * 2).forEach(num -> System.out.println(num));

    } 
}
