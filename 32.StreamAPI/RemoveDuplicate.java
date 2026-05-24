// WAP to remove duplicate from String and return in same order 

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static String removeDuplicateV1(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        char[] charArr = sentence.toCharArray();

        char[] newCharArr = new char[charArr.length];
        int size = 0;

        for (char c1 : charArr) {
            boolean isDulicate = false;
            for (int i = 0; i < size; i++) {
                if (c1 == newCharArr[i]) {
                    isDulicate = true;
                    break;
                }
            }

            if (!isDulicate) {
                newCharArr[size] = c1;
                size++;
            }
        }

        return new String(newCharArr);
    }

    public static String removeDuplicateV2(String sentence) {

        if (sentence == null || sentence.isEmpty()) {
            return null;
        }

        String result = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (result.indexOf(sentence.charAt(i)) == -1) {
                result += sentence.charAt(i);
            }
        }

        return result;
    }

    public static String removeDuplicateV3(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        // return sentence.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());

        return sentence.chars().distinct().mapToObj(ch -> Character.toString((char) ch)).collect(Collectors.joining());
    }

    public static String removeDuplicateV4(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        // Stores already visited characters
        Set<Character> seen = new HashSet<>();

        // Efficient String builder
        StringBuffer result = new StringBuffer();

        for (char c1 : sentence.toCharArray()) {
            // if character is not already seen
            if (!seen.contains(c1)) {
                seen.add(c1);
                result.append(c1);
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String str = "dabcadefg";

        // System.out.println(RemoveDuplicate.removeDuplicateV1(str));

        // System.out.println(RemoveDuplicate.removeDuplicateV2(str));

        System.out.println(removeDuplicateV3(str));

        // System.out.println(RemoveDuplicate.removeDuplicateV4(str));
    }
}
