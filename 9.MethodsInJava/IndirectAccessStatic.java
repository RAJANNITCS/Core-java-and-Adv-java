// WAP to demostrating indirect access of no static field in static method

class Test {
    int x = 10; // Non - static variable

    void greet() {
        System.out.println("Hello");
    }

    public static void show() {

        // Step 1 : Crate Object
        Test obj = new Test();
        
        // Step 2 : Access non - static member using object
        System.out.println(obj.x);

        // Step 3 : Access non - static method using object
        obj.greet();// call non-static method
    }
}
public class IndirectAccessStatic {
    public static void main(String[] args) {
        Test.show();
    }
}