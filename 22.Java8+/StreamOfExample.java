// WAP to demostrating Stream Of method 

import java.util.stream.Stream;

public class StreamOfExample {
    public static void main(String[] args) {

        // Creating stream using Stream.of()
        Stream<String> stream = Stream.of("Java", "Python", "C++");

        // Printing elements
        stream.forEach(System.out :: println);
        
    }
}
