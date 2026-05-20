// WAP to demostrating what happen when we modifi list using stream 

import java.util.ArrayList;
import java.util.List;

public class StreamModificationExample {
    public static void main(String[] args) {

        // crate list 
        List<String> list = new ArrayList<>();

        // add elements
        list.add("A");
        list.add("B");
        list.add("C");
        

        // Streaming the list 
        list.stream().forEach(item -> {

            // Print each item in list
            System.out.println(item);

            // try to modify list during stream
            list.add("D");
            
        });
    }
}
