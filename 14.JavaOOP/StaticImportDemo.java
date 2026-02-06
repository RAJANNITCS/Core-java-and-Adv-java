// WAP to demostrating static import in java

import static java.lang.Math.sqrt;
import static java.lang.Math.PI;

public class StaticImportDemo {
    public static void main(String[] args) {
        // Using Math class name , without static import 
        double result = Math.sqrt(25);

        System.out.println(result);

        System.out.println(Math.PI);


        // No Math class name , with static import

        double result1 = sqrt(25);

        System.out.println(result1);

        System.out.println(PI);

    }
}
