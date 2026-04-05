// WAP to create Custom Iterable class 

import java.util.*;

// Custom class implementing Iterable
class MyCollection implements Iterable<Integer> {

    public List<Integer> list = new ArrayList<>(); // internal storage

    public void add(Integer value) {
        list.add(value);
    }

    @Override
    public Iterator<Integer> iterator() {
        return list.iterator(); // return iterator
    }

}

public class CustomIterableExample {
    public static void main(String[] args) {
        MyCollection obj = new MyCollection();

        obj.add(10);
        obj.add(20);

        for (Integer val : obj) { // works because of Iterable
            System.out.println(val);
        }
    }
}
