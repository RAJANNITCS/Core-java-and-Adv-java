// WAP to demostrating ListIterator class

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator();

        while(it.hasNext()) {
            String val = it.next();

            if (val.equals("A")) {
                it.remove(); // safe
            }
        }

        System.out.println(list);
    }
}
