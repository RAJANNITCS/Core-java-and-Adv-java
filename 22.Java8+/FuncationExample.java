// WAP to demostrating Funcation

import java.util.function.Function;

public class FuncationExample {
    public static void main(String[] args) {

        // Function to square a number 
        Function<Integer, Integer> square = num -> num * num;

        System.out.println(square.apply(5));
    }
}
