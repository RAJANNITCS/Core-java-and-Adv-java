// WAP to demostrating Diamond Operator 

import java.util.*;

public class DiamondOperatorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() {

            @Override
            public boolean add(String s) {
                return super.add(s.toUpperCase());
            }
        };

        list.add("java");

        System.out.println(list);
    }
}
