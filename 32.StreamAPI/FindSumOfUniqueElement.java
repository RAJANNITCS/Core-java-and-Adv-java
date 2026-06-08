// WAP to find sum of unique elements of array 

import java.util.Arrays;

public class FindSumOfUniqueElement {

    public static int findSumOfUniqueElement(int[] arr) {
        return Arrays.stream(arr).distinct().sum();
    }  

    public static void main(String[] args) {
        int[] arr = {1,6,7,8, 1,1, 8, 8 , 7};
        System.out.println(FindSumOfUniqueElement.findSumOfUniqueElement(arr));
    }    
}
