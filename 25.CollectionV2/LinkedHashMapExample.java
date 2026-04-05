// WAP to demostrating LinkedHashMap and import methods

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        // Creating LinkedHashMap 
        HashMap<Integer,String> map = new LinkedHashMap<>();

        // Add elements
        map.put(1, "Apple");
        map.put(3, "Banana");
        map.put(2, "Mango");

        //Printing map
        System.out.println(map);

    }
}
