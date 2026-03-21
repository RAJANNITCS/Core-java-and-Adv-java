// WAP to demostrating Or join 

import java.util.function.Predicate;

public class PredicateOrExample {
    public static void main(String[] args) {
        // check number > 10
        Predicate<Integer> isGrater = num -> num > 10;

        // check number is even % 2 == 0
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Joining using OR
        Predicate<Integer> combined = isGrater.or(isEven);

        // testing Predicate
        System.out.println("Number grater then 10 or even = " + combined.test(12));
        System.out.println("Number grater then 10 or even = " + combined.test(6));
    }
}
