import java.util.List;
import java.util.Arrays;

public class StreamExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Amit", "Ravi", "Suresh");

        names.stream()                // Returns Stream abstraction
             .filter(name -> name.startsWith("R"))
             .forEach(System.out::println);
    }
}
