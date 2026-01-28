// WAP to demostrating NoClassDefFoundError

// File: Helper.java
class Helper {
    public static void sayHello() {
        System.out.println("Hello!");
    }
}

public class NoClassDefFoundError {
    public static void main(String[] args) {
        // This code compiles perfectly if Helper.java is present
        Helper.sayHello();
    }
}