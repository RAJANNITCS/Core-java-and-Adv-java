// WAP to demostrating supplier uses

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        // Supplier that returns a fixed value
        Supplier<String> supplier = () -> "Hello World !!!!";

        System.out.println(supplier.get());
    }
}
