// WAP to demostrating ArraysList class 

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(10); // adds element
        list.add(20);
        list.add(30);

        // Accessing element
        System.out.println(list.get(1)); // print 20

        // Removing element
        list.remove(1); // removes element at index 1
    }
}
