// WAP to demostrating list inteface 

import java.util.List;
import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        System.out.println("list are = " + list);
        
    }
}
