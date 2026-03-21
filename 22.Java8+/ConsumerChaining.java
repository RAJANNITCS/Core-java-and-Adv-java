// WAP to demostrating consumer default method 

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {

        // consumer for print value 
        Consumer<Integer> print = num -> System.out.println("Value = "+num);

        // consumer for print square
        Consumer<Integer> square = num -> System.out.println("Square = " +num * num);

        // combine consumer 
        Consumer<Integer> combine = print.andThen(square);

        combine.accept(5);
    }
}
