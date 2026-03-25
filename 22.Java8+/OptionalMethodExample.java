// WAP to demostrating Optional method

import java.util.Optional;

public class OptionalMethodExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("rajan singh");

        name.ifPresent(n -> System.out.println(n));

    }
}
