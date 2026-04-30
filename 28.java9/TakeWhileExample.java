// WAP to demostrating TakeWhile method

import java.util.*;


public class TakeWhileExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,1,2);

        // numbers.stream().takeWhile(n -> n < 4).forEach(System.out :: println);

        numbers.stream().dropWhile(n -> n < 3).forEach(System.out :: println);

    }
}
