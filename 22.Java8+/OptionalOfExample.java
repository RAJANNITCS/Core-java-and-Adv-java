// WAP to demostrating Optional of method

import java.util.Optional;

public class OptionalOfExample {
    public static void main(String[] args) {

        // Valid case 
        Optional<String> name = Optional.of("rajan singh");

        // Invalid case -> will crash
        Optional<String> nullName = Optional.of(null); // ❌ Exception

        
    }
}
