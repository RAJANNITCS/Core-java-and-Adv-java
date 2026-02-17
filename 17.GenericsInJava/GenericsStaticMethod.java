// WAP to demostrating Generic static Method 

class MyClass<T> {
    public static <U> void staticMethod(U parm) {
        System.out.println(parm);
    }
}

public class GenericsStaticMethod {
    public static void main(String[] args) {
        // Call Static generic method with different type 
        MyClass.staticMethod(10); // Integer
        MyClass.staticMethod("Hello"); // String
        MyClass.staticMethod(3.14); // Double

        // You can also specify the type explicitly
        MyClass.<String>staticMethod("Explicit Type");
    }
}
