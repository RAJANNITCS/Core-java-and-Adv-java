// WAP to find Higest Length word from string 

import java.util.Arrays;
import java.util.Comparator;

public class HigestLengthWord {

    public static String findHigestLengthWordV1(String str) {

        return Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    public static void main(String[] args) {
        String str = "I am learning Stream API in java";
        System.out.println(HigestLengthWord.findHigestLengthWordV1(str));
    }
}
