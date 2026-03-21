interface StaticMethodDemo {

    public static void print() {
        System.out.println("hello");
    }
}

public class StaticMethod implements StaticMethodDemo {
    public static void print() {
        System.out.println("main method");
    }

    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
        obj.print();
        StaticMethod.print();
        StaticMethodDemo.print();
    }
}