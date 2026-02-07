
// WAP to demostrating a class without generics

import java.util.ArrayList;

public class WithGenericsDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        String str = list.get(0);
        String str1 = list.get(1);

        System.out.println(str);
        System.out.println(str1);
    }
}

