// WAP to demostrating fail-Fast iterator

import java.util.*;

public class FailFastExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        for (String str : list) {
            list.add("S"); // ❌ Modifying during iteration
            System.out.println(str);
        }
    }
}
