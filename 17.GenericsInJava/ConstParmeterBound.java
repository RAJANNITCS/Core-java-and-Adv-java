// WAP to demostrating Bounded Type Parameters in Generic Constructors

class NumberPrinter {
    // Bounded type parameter for generic constructor
    <T extends Number> NumberPrinter(T number) {
        System.out.println("Number : " + number);
    }
}

public class ConstParmeterBound {
    public static void main(String[] args) {
        // NumberPrinter obj1 = new NumberPrinter(100);
        // NumberPrinter obj2 = new NumberPrinter(3.14);
    }
}
