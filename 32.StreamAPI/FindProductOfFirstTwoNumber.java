// WAP to find Product of first two number 

import java.util.Arrays;

public class FindProductOfFirstTwoNumber {

    public static int findProduct(int[] arr) {
        return Arrays.stream(arr).boxed().limit(2).reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 6, 9, 2, 4 };
        System.out.println(FindProductOfFirstTwoNumber.findProduct(arr));
    }
}
