// WAP to demostrating Reusable list

import java.util.*;

public class BatchProcessor {
    public static void main(String[] args) {

        // Initialize with expected batch size
        ArrayList<Integer> list = new ArrayList<>(5000);

        for (int i = 0; i < 3; i++) {
            list.clear();  // Clear previous data

            // Add 50000 elements
            for (int j = 0; j < 5000; j++) {
                list.add(j); // Add element
            }

            // Process data
            System.out.println("Batch " + i + " size : " + list.size());
        }
    }
}
