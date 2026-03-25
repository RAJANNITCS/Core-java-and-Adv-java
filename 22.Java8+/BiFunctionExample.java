// WAP to demostrating BiFunction Functional Interface

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        // BiFunction to add tow number 
        BiFunction<Integer, Integer, Integer> add = (num1, num2) -> num1 + num2;

        System.out.println("Sum of two number " + add.apply(20, 10));
    }
}
