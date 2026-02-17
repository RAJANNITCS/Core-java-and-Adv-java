// WAP to demostrating wildcards use in method parameters

import java.util.Arrays;
import java.util.List;

public class WildCardsMethodParameters {

    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
    
    public static void main(String[] args) {
        List<?> stringList = Arrays.asList("Apple","ball","Cat");
        List<?> integerList = Arrays.asList(2,4,6,8,10);

        printList(integerList);
        printList(stringList);
    }
}
