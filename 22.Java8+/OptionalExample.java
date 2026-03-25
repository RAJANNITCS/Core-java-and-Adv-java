// WAP to demostraing Optional class

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        // Creating Optional with value
        Optional<String> name = Optional.of("Rajan Singh");

        // Creating Optional that may be null
        Optional<String> emptyName = Optional.ofNullable(null);

        // Checking value 
        if (name.isPresent()) {
            // get() return actual value
            System.out.println(name.get());
        }

        // Useing orElse
        String result = emptyName.orElse("Default Name");
        System.out.println(result);

        // Using map
        Optional<Integer> length = name.map(n -> n.length());
        System.out.println(length.get());

        // Using ifPresent
        name.ifPresent(n -> System.out.println("Hello " + n));
    }
}
