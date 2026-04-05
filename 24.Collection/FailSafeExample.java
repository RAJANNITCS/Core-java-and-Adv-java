// WAP to demostrating Fail-Safe Iterator

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("A");
        list.add("B");

        for (String str : list) {
            list.add("C");
            System.out.println(str);
        }

        System.out.println(list);
    }
}
