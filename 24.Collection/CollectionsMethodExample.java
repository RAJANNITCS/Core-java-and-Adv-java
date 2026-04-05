// WAP to demostrating Collections methods

import java.util.*;

public class CollectionsMethodExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(1);
        list.add(9);
        list.add(4);

        // sort()
        Collections.sort(list);

        System.out.println("Sorted list = " + list);

        // reverse()
        Collections.reverse(list);

        System.out.println("Reverse list = " + list);

        // max(), min()
        Integer maxVal = Collections.max(list);
        Integer minVal = Collections.min(list);

        System.out.println("Max value is = " + maxVal);
        System.out.println("Min value is = " + minVal);
        
    }
}
