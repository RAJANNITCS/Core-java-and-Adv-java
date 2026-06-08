// WAP to find first not repeated char

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNotRepeatedChar {

    public static Character findFirstNonRepeatedChar(String str) {
        return str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        String str = "Hello World ";
        System.out.println(FindFirstNotRepeatedChar.findFirstNonRepeatedChar(str));
    }
}
