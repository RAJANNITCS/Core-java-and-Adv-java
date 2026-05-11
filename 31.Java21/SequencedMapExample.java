// WAP to demostrating Sequenced Map Collections

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class SequencedMapExample {
    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1,"A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println(map.firstEntry());

        System.out.println(map.lastEntry());

        System.out.println(map.reversed());

    }
}
