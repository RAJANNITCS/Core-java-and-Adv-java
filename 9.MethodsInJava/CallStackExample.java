// WAP to demostrating method call 

public class CallStackExample {

    public static void D() {
        float d = 40.5f;
        System.out.println("In Method D" + d);
    }

    public static void C() {
        double c = 30.5;
        System.out.println("In Method C" + c);
    }

    public static void B() {
        int b = 20;
        C(); // Calling C
        System.out.println("In Method B" + b);
    }

    public static void A() {
        int a = 10;
        B(); // Calling B
        System.out.println("In Method A" + a);
    }

    public static void main(String[] args) {
        A(); // Start with function A
        D(); // Then call D
    }
}