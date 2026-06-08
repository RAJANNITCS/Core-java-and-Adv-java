// WAP to find second higest word length from string

import java.util.Arrays;
import java.util.Comparator;

public class SecondHigestWordLength {

    public static int secondHigestLength(String str, int n) {
        return Arrays.stream(str.split(" "))
                .sorted(Comparator.comparingInt(String::length)
                        .reversed())
                .skip(n - 1).findFirst()
                .map(String::length).orElse(0);
    }

    public static void main(String[] args) {
        String str = "I am learning Streams API in java";
        System.out.println(SecondHigestWordLength.secondHigestLength(str, 2));
    }
}
