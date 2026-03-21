// WAP to demostrating Predicates in java

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Predicate to check if number is grater then 10
        Predicate<Integer> isGrater = num -> num > 10;
        
        //Testing the predicate
        System.out.println(isGrater.test(20));
        System.out.println(isGrater.test(5));
    }
}
