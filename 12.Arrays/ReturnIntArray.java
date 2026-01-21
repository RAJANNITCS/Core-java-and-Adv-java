// WAP to demostrating of Return array 

public class ReturnIntArray {

    public static int[] getArray() {

        return new int[]{1,2,3,4,54,6,7,8};

    }

    public static void main(String[] args) {
        int[] arr = ReturnIntArray.getArray();
        
        int sumOfArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArray += arr[i];
        }

        System.out.println("sum of array is "+ sumOfArray);
    }
}