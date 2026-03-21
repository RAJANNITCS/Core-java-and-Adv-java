// WAP to use Supplier with Stream

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierStream {
    public static void main(String[] args) {
        Random r = new Random();
        Supplier<Integer> random = () -> r.nextInt(100);;

        Stream.generate(random).limit(3).forEach(System.out :: println);
    }
}
