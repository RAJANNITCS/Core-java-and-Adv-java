// WAP to demostrating static block

class A {

    // Static block 
    static {
        System.out.println("Static block of class A");
    }

    // Static method
    static void show() {
        System.out.println("Static method show() of class A");
    }

}

public class StaticBlockV1 {
    public static void main(String[] args) {
        // Calling static method of class A
        A.show();
    }
}