// WAP to demostrating fixed size of array 


public class FixedSizeOfArray {
    public static void main(String[] args) {
        // fixed-size of array of 5 integers
        int[] arr = new int[5];

        // storing value in array 
        for (int i = 0; i < 5; i++) {
            arr[i] = (i + 2);
        }

        // printing array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("elements of array is = " + arr[i]);
        }
    }
}