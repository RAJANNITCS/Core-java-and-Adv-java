// WAP to featch only integer from list of string

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtrectIntegers {

    // Method to check whether string is integer
    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void featchOnlyNumbersFromString(String[] strArr) {
        List<Integer> list = Arrays.stream(strArr).filter(ExtrectIntegers::isInteger).map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(list);
    }

    public static void main(String[] args) {
        String[] strArr = { "abc", "123", "456", "xyz" };
        ExtrectIntegers.featchOnlyNumbersFromString(strArr);
    }
}
