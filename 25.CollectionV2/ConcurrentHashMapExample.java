// WAP to demostrating ConcurrentHashMap and Import method 

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {

        // Creating ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Put value
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        // putIfAbsent
        map.putIfAbsent("A", 1000);

        // Replace value
        map.replace("A", 2);

        // Conditional replace
        map.replace("A", 2,3);

        // computeIfAbsent
        map.computeIfAbsent("B", k -> 10);

        // merge 
        map.merge("B", 5, (oldVal,newVal) -> oldVal + newVal);

        // remove with condition
        map.remove("A",3);

        // print map
        System.out.println(map);
    }
}
