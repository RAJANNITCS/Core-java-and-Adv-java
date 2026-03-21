// WAP to demostrating Predicate add join

import java.util.function.Predicate;

public class PredicateAndExample {
    public static void main(String[] args) {

        // check number > 10
        Predicate<Integer> isGrater = num -> num > 10;

        // check number is even % 2 == 0
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Joining using AND
        Predicate<Integer> combined = isGrater.and(isEven);

        // testing Predicate
        System.out.println("Number grater then 10 and even = " + combined.test(12));
        System.out.println("Number grater then 10 and even = " + combined.test(7));
    }
}
