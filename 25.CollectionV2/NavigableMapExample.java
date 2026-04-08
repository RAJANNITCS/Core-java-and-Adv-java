// WAP to demostrating Navigable interface 

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {

        // Creating NavigableMap using TreeMap 
        NavigableMap<Integer,String> map = new TreeMap<>();

        // Adding elemets
        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");

        // lower key -> strictly less than 
        System.out.println(map.lowerKey(25));

        // floorKey -> less than or equal
        System.out.println(map.floorKey(20));

        // ceilingKey -> greater or equal
        System.out.println(map.ceilingKey(25));

        // Higher key -> strictly greater
        System.out.println(map.higherKey(30));

        // pollFirstEntry -> remove smallest 
        System.out.println(map.pollFirstEntry());

        // pollLastEntry -> remove largest
        System.out.println(map.pollLastEntry());

        System.out.println(map);

        System.out.println(map.descendingMap());
        
    }
}
