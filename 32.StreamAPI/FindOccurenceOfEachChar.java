// WAP to find Occurence of each char of word

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurenceOfEachChar {

    public static void findOccurrenceOfEachChar(String str) {
        Map<Character, Long> map = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        System.out.println(map);
    }

    public static void main(String[] args) {
        String word = "Mississippi";
        FindOccurenceOfEachChar.findOccurrenceOfEachChar(word);
    }
}
