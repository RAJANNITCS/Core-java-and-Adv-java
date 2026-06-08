// WAP to find number of vowel in each words in string

import java.util.Arrays;

public class NumberOfVowel {

    public static void numberOfVowelInEachWords(String str, int targetVowels) {
        Arrays.stream(str.split(" ")).filter(
                word -> word.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count() == targetVowels)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        String str = "I am learning Streams API in Java";
        NumberOfVowel.numberOfVowelInEachWords(str, 2);
    }
}
