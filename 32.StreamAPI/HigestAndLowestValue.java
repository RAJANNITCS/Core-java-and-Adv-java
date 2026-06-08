// WAP to demostrating Higest and Lowest posible value

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class HigestAndLowestValue {

    public static void higestAndLowestValue(int[] arr) {
        String higestPosibleValue = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).map(String::valueOf)
                .collect(Collectors.joining());

        String lowestPossibleValue = Arrays.stream(arr).boxed().sorted().map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(higestPosibleValue + " / " + lowestPossibleValue);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        HigestAndLowestValue.higestAndLowestValue(arr);
    }
}
