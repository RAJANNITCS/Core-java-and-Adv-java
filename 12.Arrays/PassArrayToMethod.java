// WAP to demostrating pass array as parameter to a method

public class PassArrayToMethod {

    public static void sumOfArray(int[] arr) {
        int totalSum = 0;

        // visite each element and add them
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        System.out.println("sum of array is "+ totalSum);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12};
        PassArrayToMethod.sumOfArray(arr);
    }
}