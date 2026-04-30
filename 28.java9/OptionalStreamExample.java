// WAP to demostrating Optional Stream method

import java.util.Optional;

public class OptionalStreamExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java");

        name.stream().forEach(System.out :: println);
    }
}
