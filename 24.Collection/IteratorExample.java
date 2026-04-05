// WAP to demostrating Iterator 

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        
        // Step 1 : Create list of number 
        List<Integer> list = new ArrayList<>();

        // Step 2 : add elements in list 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
