// WAP to creating infinite loop 

import java.util.stream.Stream;

public class InfiniteStreamIterate {
    public static void main(String[] args) {

        // Infinite stream starting from 1, increment by 1
        Stream<Integer> numbers = Stream.iterate(1, n -> n + 1);

        numbers
            .limit(10) // limit to 10 elements
            .forEach(System.out :: println);
    }
}
