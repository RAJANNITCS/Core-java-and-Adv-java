// WAP to remove duplicate word from string

import java.util.stream.Collectors;

public class RemoveDuplicateWord {

    public static String removeDuplicate(String str) {
        return str.chars()
                .mapToObj(ch -> String.valueOf((char) ch))
                .distinct()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String str = "dabcadefg";

        System.out.println(RemoveDuplicateWord.removeDuplicate(str));
    }
}
