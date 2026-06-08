// WAP to find each occurrence of words

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurrenceOfWords {

    public static void findOccurrenceOfWords(String str) {
        Map<String, Long> map = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }

    public static void main(String[] args) {
        String str = "I am learning Streams API in Java Java";
        FindOccurrenceOfWords.findOccurrenceOfWords(str);
    }
}
