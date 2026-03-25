// WAP to demostrating State Full operation 

import java.util.*;

public class StateFullExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,8,4,5,6,7,10);

        list.stream()
            .sorted() // Statefull
            .forEach(System.out :: println);
    }
}
