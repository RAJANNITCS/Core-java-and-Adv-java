// WAP to demostrating upper bounded wildcard

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcardDemo {
    
    public static double sum(List<? extends Number> numbers) {
        double total = 0.0;
        for (Number number: numbers) {
            total += number.doubleValue();
        }
        return total;
    } 

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8); 
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

        System.out.println("Sum of integers: " + sum(intList));
        System.out.println("Sum of doubles: " + sum(doubleList));
    }
}
