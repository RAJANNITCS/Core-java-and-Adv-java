// WAP to devide list into two part even and odd

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DevideList {

    public static void devideListIntoEvenAndOdd(int[] arr) {
        Map<Boolean, List<Integer>> partitioned = Arrays.stream(arr).boxed()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<List<Integer>> result = Arrays.asList(partitioned.get(false),
                partitioned.get(true));

        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        DevideList.devideListIntoEvenAndOdd(arr);
    }
}
