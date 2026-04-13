// WAP to demostrating SortedSet interface and import methods

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {

        // Creating SortedSet using TreeSet
        SortedSet<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);

        // Printing sorted set
        System.out.println(set);

        // First element
        System.out.println("First : " + set.first());

        // Last element
        System.out.println("Last : " + set.last());

        // Elements less than 30
        System.out.println("HeadSet : " + set.headSet(30));

        // Elements greater or equal to 30
        System.out.println("TailSet : " + set.tailSet(30));

        // Elements between 20 to 50
        System.out.println("SubSet : " + set.subSet(20, 50));
        
    }
}
