// WAP to demostrating Array class method 

import java.util.Arrays;
import java.util.List;

public class ArraysMastery {
    public static void main(String[] args) {
        // 1. Initialize an array
        int[] numbers = {40, 10, 30, 20, 50};

        // 2. Arrays.toString() - Printing the array easily
        // Without this, printing 'numbers' would show a memory address like [I@15db9742
        System.out.println("Original: " + Arrays.toString(numbers));

        // 3. Arrays.sort() - Sorting the array in ascending order
        Arrays.sort(numbers); 
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // 4. Arrays.binarySearch() - Finding an element index
        // NOTE: Array must be sorted first!
        int index = Arrays.binarySearch(numbers, 30);
        System.out.println("Index of 30: " + index);

        // 5. Arrays.fill() - Filling an array with a default value
        int[] statusCodes = new int[5];
        Arrays.fill(statusCodes, 200); // Sets all 5 elements to 200
        System.out.println("Status Codes: " + Arrays.toString(statusCodes));

        // 6. Arrays.copyOf() - Creating a bigger array from an existing one
        int[] largerArray = Arrays.copyOf(numbers, 10); // Copy 'numbers' into a new array of size 10
        System.out.println("Larger Array: " + Arrays.toString(largerArray));

        // 7. Arrays.asList() - Converting to a List
        String[] colors = {"Red", "Green", "Blue"};
        List<String> colorList = Arrays.asList(colors);
        System.out.println("List version: " + colorList);
    }
}