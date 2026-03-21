// WAP to demostrating supplier use in Optional

import java.util.Optional;

public class SupplierWithOptional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);

        // Supplier used here
        String value = optional.orElseGet(() -> "Default Value");

        System.out.println(value);
        
    }
}
