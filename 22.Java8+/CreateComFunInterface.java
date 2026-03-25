// WAP to create custome functional interface

@FunctionalInterface
interface MyInterface {

    // abstract method
    public void sayHello(String name);

    // default method
    public default void printDefault() {
        System.out.println("Printing default method");
    }

    // static method
    public static void printStatic() {
        System.out.println("Printing static method");
    }

}

public class CreateComFunInterface {
    
    public static void main(String[] args) {

        MyInterface obj = (name) -> System.out.println("hello -> " + name);

        // call abstract method
        obj.sayHello("rajan singh");

        // call default method
        obj.printDefault();

        // call static method 
        MyInterface.printStatic();
    }
}
