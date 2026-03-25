// WAP to demostrating Filter Operation 

import java.util.*;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<String> statuses = Arrays.asList("SUCESS","FAILED","PENDING","SUCESS","FAILED");

        List<String> filedStatusOnly = statuses.stream().filter(status -> status.equals("FAILED")).collect(Collectors.toList());

        // filedStatusOnly.forEach(System.out :: println);

        System.out.println(filedStatusOnly);
    }
}
