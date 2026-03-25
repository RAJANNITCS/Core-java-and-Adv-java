// WAP to demostrating Bi product 

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        // BiPredicate to compare two number
        BiPredicate<Integer, Integer> isGrater = (num1,num2) -> num1 > num2;

        // calling and testing method
        System.out.println("numer one is grater then number two = " + isGrater.test(5,6));
        System.out.println("numer one is grater then number two = " + isGrater.test(15,6));
    }
}
