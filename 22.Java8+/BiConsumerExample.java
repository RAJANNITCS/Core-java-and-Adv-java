// WAP to demostrating BiConsumer

import java.util.Map;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        // BiConsumer used in map
        BiConsumer<Integer,String> printer = (k,v) -> {
            System.out.println(k + " -> " + v);
        };

        map.put(1, "A");
        map.put(2, "B");

        map.forEach(printer); // internally use BiConsumer
    }
}
