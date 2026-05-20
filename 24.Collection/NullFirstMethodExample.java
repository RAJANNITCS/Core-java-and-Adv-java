// WAP to demostrating NullFirstMethod

import java.util.*;

public class NullFirstMethodExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // Add element in list
        list.add("Banana");
        list.add(null);
        list.add("Apple");

        // Null value come first
        list.sort(Comparator.nullsFirst(String :: compareTo));

        System.out.println(list);
    }
}
