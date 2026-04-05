// WAP to demostrating Set interface

import java.util.*;

public class SetInterfaceExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>(); // Crate HashSet

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");

        System.out.println("Print Set = " + set);
    }
}
