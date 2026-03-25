// WAP to demostrating Static method ref

import java.util.List;
import java.util.Arrays;

public class StaticMethodRef {
    
    // static method 
    public static void printMsg(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        // Lambda
        list.forEach(x -> printMsg(x));

        // Method Reference
        list.forEach(StaticMethodRef :: printMsg);
    }
}
