// WAP to demostrating IfPresentOrElse 

import java.util.Optional;

public class IfPresentOrElseExample {
    public static void main(String[] args) {
        Optional<String> user = Optional.of("John");

        user.ifPresentOrElse(name -> System.out.println(name), () -> System.out.println("No user found"));

        
    }
}
