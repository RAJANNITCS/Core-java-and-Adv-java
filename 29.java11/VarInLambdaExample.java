// WAP to demostrating var use in lambda

import java.util.function.BiFunction;

public class VarInLambdaExample {
    public static void main(String[] args) {

        // Lambda with var
        BiFunction<Integer, Integer, Integer> add = (var a, var b) -> a + b;

        // Call Lambda
        int result = add.apply(10, 20);

        System.out.println(result);
    }
}
