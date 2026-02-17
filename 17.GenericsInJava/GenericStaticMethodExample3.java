// WAP to demostrating static generic method

public class GenericStaticMethodExample3 {
    // Generic static method
    public static <T> void printElement(T element) {
        System.out.println("Element : " + element);
    }

    public static void main(String[] args) {
        GenericStaticMethodExample3.printElement(42);
        GenericStaticMethodExample3.printElement("Generics in java");
    }

}
