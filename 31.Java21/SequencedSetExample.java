// WAP to demostrating Sequenced Set 

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class SequencedSetExample {
    public static void main(String[] args) {

        SequencedSet<String> set = new LinkedHashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");

        System.out.println(set.getFirst());

        System.out.println(set.getLast());

        System.out.println(set.reversed());
        
    }
}
