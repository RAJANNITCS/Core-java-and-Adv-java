// WAP to demostrating vector class 

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        // Creating a Vector
        Vector<Integer> vList = new Vector<>();

        // Adding elements 
        vList.add(10); // add 
        vList.add(20);
        vList.add(30);
        vList.add(40);
        vList.add(50);

        // Insert at index
        vList.add(1,15); // shifts elements

        // Get element
        int val = vList.get(2); // fetch index 2

        System.out.println(val);

        // Update element
        vList.set(0, 100);

        // Remove element
        vList.remove(1);

        // Print size
        System.out.println(vList.size());

        // Print capacity
        System.out.println(vList.capacity());
    }
}
