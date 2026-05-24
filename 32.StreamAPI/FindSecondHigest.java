// WAP to find second higest word from given string

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindSecondHigest {

    static class Word {
        String text;
        int length;

        Word(String text) {
            this.text = text;
            this.length = text.length();
        }

        @Override
        public String toString() {
            return this.text + ":" + this.length;
        }
    }

    public static String secondHigestV1(String str, int n) {

        if (str == null || str.isEmpty()) {
            return "";
        }

        String[] words = str.split(" ");

        // sort descending by length
        Arrays.sort(words, (a, b) -> b.length() - a.length());

        // Edge case
        if (n > words.length) {
            return "not enough words";
        }

        return words[n - 1];

    }

    public static String secondHigestV2(String str, int n) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        String[] words = str.split(" ");

        // min heap
        PriorityQueue<Word> minHeap = new PriorityQueue<>((a,b) -> a.length - b.length);

        for (String word : words) {
            minHeap.offer(new Word(word));

            // Keep only top N largest
            if (minHeap.size() > n) {
                minHeap.poll();
            }
        }

        return minHeap.peek().text;
    }

    public static String secondHigestV3(String str, int n) {
        return Arrays.stream(str.split(" "))
                .sorted(Comparator.comparingInt(String::length)
                        .reversed())
                .skip(n - 1)
                .findFirst()
                .orElse("Not enough words");
    }

    public static void main(String[] args) {
        String str = "I am learning Streams API in java";
        System.out.println(FindSecondHigest.secondHigestV2(str, 2));
    }
}
