// WAP to demostrating List Iterator

import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
         List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator(); // Get ListIterator

        // Forward traversal
        while (it.hasNext()) {
            String val = it.next();
            System.out.println(val);
            if (val.equals("B")) {
                it.set("X");
            }
        }

        // Backward traversal
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

    }
}
