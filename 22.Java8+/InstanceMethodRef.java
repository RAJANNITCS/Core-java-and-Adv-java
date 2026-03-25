// WAP to demostrating instance method reference

import java.util.List;
import java.util.Arrays;

public class InstanceMethodRef {
    
    public void display(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        InstanceMethodRef obj = new InstanceMethodRef();

        List<String> list = Arrays.asList("Java", "Spring");

        // Lambda 
        list.forEach(value -> obj.display(value));

        // Method Reference
        list.forEach(obj :: display);
    }
}
