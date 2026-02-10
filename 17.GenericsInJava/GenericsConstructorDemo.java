// WAP to demostrating Generics Constructor with generic class and non generic class

/**
 * CASE A: Generic Class, Normal Constructor
 * The class 'Box' is tied to type T. 
 * The constructor just uses whatever T is.
 */
class Box<T> {
    private T content;

    // This is NOT a generic constructor. 
    // It is a normal constructor in a generic class.
    public Box(T content) {
        this.content = content;
        System.out.println("Box created with: " + content.getClass().getSimpleName());
    }
}

/**
 * CASE B: Normal Class, Generic Constructor
 * The class 'Printer' is NOT generic.
 * The constructor IS generic (it has <E> before its name).
 */
class Printer {
    // This is a Generic Constructor.
    // It accepts any type E and prints its info.
    public <E> Printer(E element) {
        System.out.println("Constructor logic for: " + element.toString());
    }
}

/**
 * CASE C: Generic Class, Generic Constructor
 * The class 'Pair' is tied to type T.
 * The constructor introduces a brand new type E.
 */
class Pair<T> {
    private T first;

    // T comes from the class.
    // <E> is defined specifically for this constructor.
    public <E> Pair(T first, E second) {
        this.first = first;
        System.out.println("Class Type T: " + first.getClass().getSimpleName());
        System.out.println("Constructor Type E: " + second.getClass().getSimpleName());
    }
}

public class GenericsConstructorDemo {
    public static void main(String[] args) {
        // Test Case A: Type 'String' is fixed for the whole object
        Box<String> stringBox = new Box<>("Fragile Goods");

        // Test Case B: Normal class, but we pass an Integer to the generic constructor
        Printer p1 = new Printer(101); 
        // We can pass a Double to the same class constructor
        Printer p2 = new Printer(99.99); 

        // Test Case C: T is Integer (from class), E is String (from constructor)
        Pair<Integer> myPair = new Pair<>(1, "Entry Number One");
    }
}