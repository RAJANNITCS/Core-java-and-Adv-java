// WAP to demostrating collection interface methods

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceExample {
    public static void main(String[] args) {

        Collection<String> col = new ArrayList<>(); // Using collection reference

        col.add("A");
        col.add("B");

        System.out.println(col.size()); // Print size

        System.out.println(col.contains("A")); // check elements

        col.remove("A"); // Remove elements

        System.out.println(col); // Print collection
    }
}
