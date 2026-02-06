class Parent {

    // Instance method in parent
    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {

    // Overridden method in child
    void show() {
        System.out.println("Child show()");
    }
}

public class Test {

    public static void main(String[] args) {

        // Parent reference pointing to Child object
        Parent p = new Child();

        // Method call
        p.show();
    }
}
