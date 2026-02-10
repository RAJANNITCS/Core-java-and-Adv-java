// WAP to demostrating Multiple Type Parameters in Constructors

class Pair {
    // Generic constructor with two type parameters
    <A, B> Pair(A first, B second) {
        System.out.println("First: " + first + ", Second: " + second);
    }
}

public class MultiParameterGenericsConstructorDemo {
    public static void main(String[] args) {
        new Pair(10, "Ten");  // Integer and String
        new Pair(3.14, 42);   // Double and Integer
    }
}