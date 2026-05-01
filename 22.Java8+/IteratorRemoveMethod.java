// WAP to demostrating Remove method in Iterator class

import java.util.*;

public class IteratorRemoveMethod {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            String value = it.next();

            if (value.equals("B")) {
                it.remove(); // ✅ Safe removal
            }
        }

        System.out.println(list);
    }
}
