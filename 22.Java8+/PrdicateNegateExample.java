// WAP to demostrating Predicate Negate

import java.util.function.Predicate;

public class PrdicateNegateExample {
    public static void main(String[] args) {

        // Predicate to check number is grater then 10
        Predicate<Integer> isGraterThen10 = num -> num > 10;

        // Predicate to checkout number is not grater then 10
        Predicate<Integer> isNotGraterThen10 = isGraterThen10.negate();

        System.out.println("Not Grater then 10 = " + isNotGraterThen10.test(5));
        System.out.println("Not Grater then 10 = " + isNotGraterThen10.test(12));
    }
}
