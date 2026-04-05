// WAP to creatre synchronized collection 

import java.util.*;

public class SynchronizedCollection {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());

        Runnable r1 = () -> {
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("E");
        };

        Runnable r2 = () -> {
            list.add("1");
            list.add("2");
            list.add("3");
            list.add("4");
            list.add("5");
        };

        Thread t1 = new Thread(r1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();

        System.out.println("List is " + list);
    }
}
