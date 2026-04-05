// WAP to demostrating CopyOnWriteArrayList

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {

        // Create CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // add elements
        list.add("A");
        list.add("B");

        // Iterate List
        for (String str : list) {
            if (str.equals("B")) {
                list.add("C");
            }
            System.out.println(str); // print A,B
        }

        System.out.println(list);
    }
}
