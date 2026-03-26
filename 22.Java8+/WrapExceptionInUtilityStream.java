// WAP to use Utility Wrapper

import java.util.*;

// Custom functional interface 
@FunctionalInterface
interface ThrowingFunction<T,R> {
    R apply(T t) throws Exception; // always checked exception
}

public class WrapExceptionInUtilityStream {
    
    // Wrapper method
    public static <T,R> java.util.function.Function<T,R> wrap(ThrowingFunction<T,R> func) {
        return t -> {
            try {
                return func.apply(t); // call original function
            } catch (Exception e ) {
                throw new RuntimeException(e); // wrap exception
            }
        };
    }

    public static void main(String[] args) {
        // Step 1: Create list of IDs (some invalid)
        List<String> ids = Arrays.asList("10", "20", "abc", "40");

        // Step 2: Process using stream
        ids.stream()
            .map(wrap(id -> Integer.parseInt(id))) // clean wrapper usage
            .forEach(System.out::println);
    }
}
