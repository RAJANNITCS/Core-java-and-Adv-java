// WAP to show if you attempt to use the "super" keyword in a class that doesn't have a superclass

class MyClass {

    public MyClass() {
        super(); // This is valid
    }

    public void display() {
        System.out.println("Display something.......");
    }

    public void print() {
        super.toString(); // ✅ valid — from Object class
        // super.display();  // ❌ compile error — no display() in Object class
    }
}

public class SuperKeywordsExpV4 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // obj.display();
        obj.print();
    }
}