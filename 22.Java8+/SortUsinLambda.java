// WAP to sorting elements of list using lambda 

import java.util.*;

public class SortUsinLambda {
    public static void main(String[] args) {

        // Create list
        List<Integer> numbers = Arrays.asList(5,2,8,1,9);

        // Ascending using lambda 
        numbers.sort((a,b) -> a - b);
        System.out.println("Ascending : " + numbers);

        // Decending using lambda
        numbers.sort((a,b) -> b - a);
        System.out.println("Decending : " + numbers);
    }
}
