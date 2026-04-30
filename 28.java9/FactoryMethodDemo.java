// WAP to demostrating factory method

import java.util.List;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        List<String> states = List.of("NEW","PROCESSING","DONE");

        System.out.println(states);
    }
}