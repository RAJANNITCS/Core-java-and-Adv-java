// WAP to demostrating IterateExample 

import java.time.LocalDate;
import java.util.stream.Stream;

public class IterateExample {
    public static void main(String[] args) {
                
        // Stream.iterate(1, n-> n <= 4, n-> n + 1).forEach(System.out :: println);

        Stream.iterate(LocalDate.now(),d->d.isBefore(LocalDate.now().plusDays(5)),d->d.plusDays(1)).forEach(System.out :: println);
    }
}
