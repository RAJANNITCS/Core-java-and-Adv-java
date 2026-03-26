// WAP to demostrating Find any example

import java.util.*;

public class FindAnyExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Optional<Integer> num = list.stream().filter(n -> n > 5).findAny();

        if (num.isPresent()) {
            System.out.println(num.get());
        }
    }
}
