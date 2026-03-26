// WAP to demostrating sorted method with Compartor

import java.util.*;
import java.util.stream.Collectors;

public class SortedWithCompartor {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi");

        List<String> result = list.stream()
                .sorted((a , b) -> a.length() - b.length()) // Custom logic
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
