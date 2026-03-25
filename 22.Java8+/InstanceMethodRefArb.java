// WAP to demostrating Instance Method Reference (of arbitrary object)

import java.util.List;
import java.util.Arrays;

public class InstanceMethodRefArb {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");

        // Lambda
        // list.replaceAll(x -> x.toUpperCase());

        // Method Reference
        list.replaceAll(String::toUpperCase);

        System.out.println(list);
    }
}
