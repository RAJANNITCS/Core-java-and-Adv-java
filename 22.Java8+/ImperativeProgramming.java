// WAP to demostrating imperative programming style

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class ImperativeProgramming {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> even = new ArrayList<>();

        for (Integer value : numbers) {
            if (value % 2 == 0) {
                even.add(value);
            }
        }

        System.out.println(even);
    }
}
