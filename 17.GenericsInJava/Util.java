public class Util {
    public static <T extends Number> void printDoubleValue(T value) {
        System.out.println(value.doubleValue());
    }

    public static void main(String[] args) {
        printDoubleValue(10);      // Output: 10.0
        printDoubleValue(3.14);    // Output: 3.14

        // The following will cause a compile-time error because String does not extend Number
        // printDoubleValue("Hello");
    }
}
