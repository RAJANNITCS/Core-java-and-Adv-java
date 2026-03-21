// WAP to demostrating Function default method 

import java.util.function.Function;

public class FunctionAndThenExample {
    public static void main(String[] args) {
        // Write a function to multiply give numebr 
        Function<Integer,Integer> multiply = num -> num * num;

        // Write a function to add 5 on gien number
        Function<Integer, Integer> add = num -> num + 5;

        // make result function 
        Function<Integer, Integer> result = multiply.andThen(add);

        System.out.println(result.apply(5));
    }
}
