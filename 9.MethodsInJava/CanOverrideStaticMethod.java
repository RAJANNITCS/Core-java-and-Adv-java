// WAP to demostrating can we override static method

class Test1 {

    public static void show() {
        System.out.println("Show test 1");
    }

}

class Test2 extends Test1{

    public static void show() {
        System.out.println("Show test 2");
    }

}

public class CanOverrideStaticMethod {
    public static void main(String[] args) {
        Test2.show();
    }
}