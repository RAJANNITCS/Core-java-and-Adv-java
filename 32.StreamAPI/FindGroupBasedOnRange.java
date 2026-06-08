// WAP to find group of element based on range

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindGroupBasedOnRange {

    public static void findGroupBasedOnRange(int[] arr) {
        Map<Integer, List<Integer>> map = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(num -> (num / 10) * 10, LinkedHashMap::new, Collectors.toList()));

        System.out.println(map);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 10, 14, 20, 24, 30, 34, 40, 44, 50, 54 };
        FindGroupBasedOnRange.findGroupBasedOnRange(arr);
    }
}
