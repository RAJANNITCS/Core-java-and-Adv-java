// WAP to demostrating of List.of() method 

import java.util.*;

public class ListOfExample {
    public static void main(String[] args) {

        // Creating immutable list
        List<String> list = List.of("A","B","C","D");

        // Printing List
        System.out.println(list);

        // Trying to modify
        list.set(1, "X");  // ❌ Exception

    }
}
