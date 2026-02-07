// WAP to demostrating a class without generics

import java.util.ArrayList;

public class WithoutGenericsDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(123);
        list.add(3.14);

        String str = (String) list.get(0);
        String str1 = (String) list.get(1);

        System.out.println(str);
        System.out.println(str1);
    }
}
