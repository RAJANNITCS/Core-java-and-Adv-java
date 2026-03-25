// WAP to demostrating stateless operation 

import java.util.*;

public class StatelessExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list.stream()
            .filter(n -> n % 2 == 0) // Stateless
            .map(n -> n * n)         // Stateless
            .forEach(System.out :: println);

    }
}
