// WAP to demostrating Peek operation 

import java.util.*;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> evenList = list.stream()
            .peek(n -> System.out.println("Befor -> " + n))
            .map(n -> n * n)
            .peek(n -> System.out.println("After -> " + n))
            .collect(Collectors.toList());

        System.out.println(evenList);
    }
}
