// WAP to demostrating built-in functional interface 

import java.util.function.Predicate;

public class BuilInFunctionalIntDemo {
    public static void main(String[] args) {

        // check if number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(10));
    }
}
