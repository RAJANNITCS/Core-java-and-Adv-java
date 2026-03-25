// WAP to demostrating optional ofNullable method

import java.util.Optional;

public class OptionalOfNullableExample {
    public static void main(String[] args) {
        String name = null;

        // Safe creation 
        Optional<String> optionalName = Optional.ofNullable(name);

        System.out.println(optionalName); // Optional.empty
        
    }
}
