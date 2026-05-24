// WAP to find the word that has the highest length

import java.util.Arrays;
import java.util.Comparator;

public class FindHighestLength {

    public static String findLargestWordV2(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        return Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse("");
    }

    public static void main(String[] args) {
        String str = "I am learning Stream API in java";

        System.out.println(FindHighestLength.findLargestWordV2(str));
    }
}