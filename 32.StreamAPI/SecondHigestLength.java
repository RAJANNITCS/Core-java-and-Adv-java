// WAP to demostrating second higest length word

import java.util.Arrays;
import java.util.Comparator;

public class SecondHigestLength {

    public static String secondHigestWord(String str, int n) {

        if (str == null || str.isEmpty()) {
            return "";
        }

        return Arrays.stream(str.split(" "))
                .sorted(Comparator.comparingInt(String :: length).reversed())
                .skip(n - 1).findFirst().orElse("No word Found");
    }

    public static void main(String[] args) {
        String str = "I am learning Streams API in java";
        System.out.println(SecondHigestLength.secondHigestWord(str, 2));
    }
}
