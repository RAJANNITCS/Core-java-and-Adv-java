// WAP to demostrating Sequenced collection interface use

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionExample {
    public static void main(String[] args) {

        // ArrayList now supports SequencedCollection methods
        SequencedCollection<String> names = new ArrayList<>();

        // Add elements 
        names.add("A");
        names.add("B");
        names.add("C");
        

        // Add at begging
        names.addFirst("Start");

        // Add at end
        names.addLast("End");

        // First element
        System.out.println(names.getFirst());

        // Last element
        System.out.println(names.getLast());

        // Reverse view
        System.out.println(names.reversed());
    }
}
