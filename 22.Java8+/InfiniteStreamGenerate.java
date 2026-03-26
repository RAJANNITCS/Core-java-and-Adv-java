// WAP to demostrating infinite stream

import java.util.stream.Stream;

public class InfiniteStreamGenerate {
    public static void main(String[] args) {

        // Generate infinite stream of random numbers
        Stream<Double> randomStream  = Stream.generate(() -> Math.random());

        randomStream
                .limit(5) // restrict to 5 elements
                .forEach(System.out :: println); // print each number
    }
}
