// WAP to demostrating dynamic array 

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        
        // dyanmic array
        ArrayList<Integer> arr = new ArrayList<>();

        // adding elements
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        // printing array elements
        System.out.println("Array elements are : ");
        for (Integer integerValue : arr) {
            System.out.println(integerValue);
        }

        // removing last element
        arr.remove(arr.size() - 1);

        System.out.println("After removing last element");

        for (Integer num : arr) {
            System.out.println(num);
        }
    }
}