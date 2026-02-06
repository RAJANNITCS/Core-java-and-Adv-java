
class Parent {

    // Static method in parent class
    static void show() {
        System.out.println("Parent show method");
    }
}

class Child extends Parent {

    // Static method with same signature
    static void show() {
        System.out.println("Child show method");
    }
}

public class MethodHidingDemo {
    public static void main(String[] args) {

        Parent p = new Child();   // Parent reference, Child object
        p.show();                 // Calls Parent method

        Child c = new Child();    // Child reference
        c.show();                 // Calls Child method
    }
    
}
