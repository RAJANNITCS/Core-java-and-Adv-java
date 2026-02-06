// WAP to demostrating normal import in java

import java.util.List;
import java.util.ArrayList;

public class NormalImport {
    
    public static void main(String[] args) {
        
        // Using class names directly
        List<String> orders = new ArrayList<>();
        orders.add("order-1");
        orders.add("order-2");

        System.out.println(orders);
    }
}
