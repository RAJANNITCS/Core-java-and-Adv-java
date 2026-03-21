// WAP to demostrating consumper 

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        // consumer for print give number
        Consumer<Integer> print = num -> System.out.println(num);

        print.accept(5);
    }
}
