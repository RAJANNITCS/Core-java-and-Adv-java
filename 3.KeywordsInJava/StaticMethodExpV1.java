// WAP to explain static method

class Demo {
    static void printInfo() {
        System.out.println("This is a class-level message.");
        // System.out.println(this); // ❌ Compile-time Error: "Cannot use 'this' in a static context"
    }
}

public class StaticMethodExpV1 {
    public static void main(String[] args) {
        Demo.printInfo();
    }
}