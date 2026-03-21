// WAP to demostrating compose default method in function

import java.util.function.Function;

public class FunctionComposeExample {
    public static void main(String[] args) {

        // Make Funcation to multiply
        Function<Integer, Integer> multiply = num -> num * num;

        // Make Function to add 5
        Function<Integer, Integer> add = num -> num + 5;

        // combine result
        Function<Integer, Integer> result = multiply.compose(add);

        System.out.println(result.apply(5));
    }
}
