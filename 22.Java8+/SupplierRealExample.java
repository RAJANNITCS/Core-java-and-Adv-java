// WAP to demostrating real use of supplier

import java.util.Random;
import java.util.function.Supplier;

public class SupplierRealExample {
    public static void main(String[] args) {
        Random random = new Random();

        // Supplier for random number 
        Supplier<Integer> randomSupplier = () -> random.nextInt(100);

        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
        
    }
}
