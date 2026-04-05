// WAP to demostrating Collections class method

import java.util.*;

public class SortMethodExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,8,1,10,7);

        Collections.sort(list);

        System.out.println(list);
    }
}
