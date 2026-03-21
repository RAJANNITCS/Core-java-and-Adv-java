// WAP to demostrating default method in functional interface 
// in multi inheritance

interface M1 {

    default void d1() {
        System.out.println("d1");
    }
}

interface M2 {

    default void d2() {
        System.out.println("d2");
    }
}

class M3 implements M1, M2 {
    @Override
    public void d1() {
        System.out.println("Overide d1 method in M1 interface");
        // M1.super.d1();
    }
}

public class DefaultMethodInFunDemo {
    public static void main(String[] args) {
        new M3().d1();
    }
}
